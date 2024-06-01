package LinkedList;

class SLL {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    private class Node {
        private int val;
        private Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
        }
        Node node = new Node(val);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    public int deleteFirst() {
        int val = head.val;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return val;
    }

    public int deleteLast() {
        if (size <= 1) {
            return deleteFirst();
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.val;
        tail = temp;
        tail.next = null;
        size--;
        return val;
    }

    public int delete(int index) {
        if (index == 0) {
            return deleteFirst();
        }
        if (index == size - 1) {
            return deleteLast();
        }
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.next.val;
        temp.next = temp.next.next;
        size--;
        return val;
    }

    public int findValue(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        int val = temp.val;
        return val;
    }

    public Node findNode(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.val == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
    }
}

public class SLLImpl {
    public static void main(String[] args) {
        SLL sll = new SLL();
        sll.insertFirst(3);
        sll.insertFirst(2);
        sll.insertFirst(4);
        sll.insertFirst(8);
        sll.insertFirst(6);
        sll.insertLast(10);
        sll.insert(5, 3);
        sll.display();
        System.out.println("Removed value: " + sll.deleteFirst());
        sll.display();
        System.out.println("Removed value: " + sll.deleteLast());
        sll.display();
        System.out.println("Removed value: " + sll.delete(3));
        sll.display();
        System.out.println("Value at node 1: " + sll.findValue(1));
        System.out.println("Value found at: "+sll.findNode(5));
        System.out.println("Size of SLL: "+sll.getSize());
    }
}
