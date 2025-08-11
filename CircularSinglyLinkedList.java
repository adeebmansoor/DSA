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
        Node node = new Node(val);

        // If list is empty
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
            return;
        }

        // If pos is 1, insert at first
        if (pos == 1) {
            insertFirst(val);
            return;
        }

        // Traverse
        Node temp = head;
        for (int i = 1; i < pos-1; i++) {
            temp = temp.next;
            if (temp == head) {
                System.out.print("Invalid Position");
                return;
            }
        }

        node.next = temp.next;
        temp.next = node;

        // Update tail if inserted at the end
        if (temp == tail) {
            tail = node;
        }
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

        list.display();
    }
}
