public class CircularSinglyLinkedList {
    Node head;
    Node tail;

    private class Node {
        int value;
        Node next;

        public Node (int val) {
            this.value = val;
            this.next = null;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        node.next = head;
        tail.next = node;
        head = node;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        node.next = head;
        tail.next = node;
        tail = node;
    }

    public void insert(int val, int pos) {

        // Negative position check
        if (pos < 0) {
            System.out.println("Invalid position.");
            return;
        }

        Node node = new Node(val);

        // If list is empty
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
            return;
        }

        // If pos is 1, insert at first
        if (pos == 1) {
            insertFirst(val);
            return;
        }

        // Traverse
        Node temp = head;
        int count = 0;
        while (count < pos - 1 && temp.next != head) { // Stop if we loop back
            temp = temp.next;
            count++;
        }

        // Case 3: Insert at tail or beyond length
        if (temp == tail) {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        // Case 4: Insert in middle
        else {
            node.next = temp.next;
            temp.next = node;
        }
    }

    public int deleteFirst() {
        // Check if list is empty
        if (head == null) {
            return -1;
        }

        int val = head.value;
        // If there is only one element in the list
        if (head == tail) {
            head = tail = null;
            return val;
        }

        // If more than one elements
        else {
            tail.next = head.next;
            head = head.next;
            return val;
        }
    }

    public int deleteLast() {
        // Check if list is empty
        if (head == null) {
            return -1;
        }

        int val = 0;
        // If there is only one element in the list
        if (head == tail) {
            val = tail.value;
            head = tail = null;
            return val;
        }

        // If more than one elements
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        val = temp.next.value;
        temp.next = head;
        tail = temp;
        return val;
    }

    public void deleteAt(int pos) {
        // Check if list is empty
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        // Negative position check
        if (pos < 0) {
            System.out.println("Invalid position.");
            return;
        }

        int val = 0;
        // If there is only one element in the list
        if (head == tail && pos == 1) {
            val = tail.value;
            head = tail = null;
            System.out.print(val);
            return;
        }

        // If pos = 1
        if (pos == 1) {
            System.out.println(deleteFirst());
            return;
        }

        Node temp = head;
        for (int i=1; i<pos-1; i++) {
            temp = temp.next;
        }

        // Check if pos == tail;
        if (temp == tail) {
            System.out.println(deleteLast());
            return;
        }
        else {
            val = temp.next.value;
            temp.next = temp.next.next;
        }
        System.out.println(val);
    }

    public void deleteVal(int val) {
        // Check if list is empty
        if (head == null) {
            System.out.println("List is Empty!");
            return;
        }

        
        // Check if head has the target val
        if (head.value == val) {
            if (head == tail) { // Only one node
                head = tail = null;
            }
            else {
                tail.next = head.next;
                head = head.next;
            }
            System.out.println(val + " is deleted.");
            return;
        }

        Node temp = head;
        do {
            Node n = temp.next;
            if (n.value == val) {
                temp.next = n.next;
                if (n == tail) { // update tail if needed
                    tail = temp;
                }
                System.out.println(val + " is deleted.");
                break;
            }
            temp = temp.next;
        } while (temp != head);
        // System.out.println(val + " not found.");
    }

    public void display() {
        Node temp = head;
        if (head != null) {
            do {
                System.out.print(temp.value + " -> ");
                temp = temp.next;
            } while (temp != head);
        }
        System.out.print("HEAD");
    }

    public static void main(String[] args) {
        CircularSinglyLinkedList list = new CircularSinglyLinkedList();
        list.insertFirst(13);
        list.insertFirst(77);
        list.insertFirst(8);
        list.insertFirst(65);
        list.insertLast(42);
        list.insertLast(99);
        list.insert(82, 3);
        // System.out.println(list.deleteFirst());
        // System.out.println(list.deleteLast());
        list.deleteAt(2);
        list.deleteVal(13);

        list.display();
    }
}
