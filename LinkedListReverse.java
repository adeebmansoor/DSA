public class LinkedListReverse {
    Node head;

    public class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
    }

    public Node reverseList(Node head) {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            // Store new next in each iteration
            next = curr.next;
            // Reverse current node's next pointer
            curr.next = prev;
            // Move pointers one position ahead
            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void display(Node node) {
        Node temp = node;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    public static void main(String[] args) {
        LinkedListReverse list = new LinkedListReverse();
        list.insertFirst(18);
        list.insertFirst(67);
        list.insertFirst(3);
        list.insertFirst(42);
        list.insertFirst(15);

        Node reverseHead = list.reverseList(list.head);
        list.display(reverseHead);
    }
}
