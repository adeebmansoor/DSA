public class DoublyLinkedList {
    Node head;
    Node tail;

    private class Node {
        int value;
        Node prev;
        Node next;

        public Node(int val) {
            this.value = val;
        }

        public Node(int val, Node prev, Node next) {
            this.value = val;
            this.prev = prev;
            this.next = next;
        }
    }

    public Node find(int value) {
        Node node = head;
        while (node != null) {
            if (node.value == value) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if (head != null) {
            head.prev = node;
        }
        head = node;

        if (tail == null) {
            tail = node;
        }
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        Node temp = head;

        node.next = null;

        if (head == null) {
            node.prev = null;
            head = node;
            tail = node;
            return;
        }

        while (temp.next != null) {
            temp = temp.next;
        }

        temp.next = node;
        node.prev = temp;
        tail = node;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == tail || temp == null) {
        insertLast(val);
        return;
        }

        Node nextNode = temp.next;
        Node node = new Node(val, temp, nextNode);
        temp.next = node;
        if (nextNode != null) {
        nextNode.prev = node;
        }
        else {
            tail = node;
        }
    }

    public void insertAfter(int after, int val) {
        Node prev = find(after);
        if (prev == null) {
            System.out.println("Node Not Found!");
            return;
        }

        Node node = new Node(val);
        node.next = prev.next;
        node.prev = prev;
        prev.next = node;
        
        if (node.next != null) {
            node.next.prev = node;
        }
        else {
            tail = node; // update tail
        }
    }
    
    public void displayForward() {
        Node temp = head;

        System.out.println("Print in Forward");
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public void displayBackward() {
        Node temp = tail;

        System.out.println("Print in Reverse");
        while (temp != null) {
            System.out.print(temp.value + " <-> ");
            temp = temp.prev;
        }
        System.out.print("START");
    }

    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.insertFirst(18);
        list.insertFirst(5);
        list.insertFirst(34);
        list.insertLast(99);
        list.insertLast(101);
        list.insert(178, 4);
        list.insertAfter(99, 4);

        list.displayForward();
        System.out.println();
        list.displayBackward();
    }
}
