package LinkedList;

class DLL {
    private Node head;
    private Node tail;
    private int size;

    public int getSize() {
        return size;
    }

    private class Node {
        private int val;
        private Node next;
        private Node previous;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node previous) {
            this.val = val;
            this.next = next;
            this.previous = previous;
        }
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;
        if (head != null) {
            head.previous = node;
        }
        head = node;
        if (tail == null) {
            tail = head;
        }
        size++;
    }

    public void insertLast(int val) {
        if (tail == null) {
            insertFirst(val);
            return;
        }
        Node node = new Node(val);
        node.previous = tail;
        node.next = null;
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
        Node node = new Node(val);
        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        node.previous = temp;
        node.next = temp.next;
        temp.next.previous = node;
        temp.next = node;
        size++;
    }

    public int deleteFirst(){
        int val = head.val;
        head = head.next;
        head.previous = null;
        size--;
        return val;
    }

    public int deleteLast(){
        if (size <= 1) {
            return deleteFirst();
        }
        int val = tail.val;
        tail = tail.previous;
        tail.next = null;
        size--;
        return val;
    }

    public void display() {
        Node temp = head;
        while(temp.next != null){
            System.out.print(temp.val+" <-> ");
            temp = temp.next;
        }
        System.out.println("END");
    }

    public void displayReverse() {
        Node temp = tail;
        while(temp.previous != null){
            System.out.print(temp.val+" <-> ");
            temp = temp.previous;
        }
        System.out.println("END");
    }
}

public class DLLImpl {
    public static void main(String[] args) {
        DLL dll = new DLL();
        dll.insertFirst(2);
        dll.insertFirst(3);
        dll.insertFirst(4);
        dll.insertFirst(8);
        dll.insertFirst(1);
        dll.insertFirst(7);
        dll.insertLast(9);
        dll.insertLast(11);
        dll.insert(5, 3);
        dll.display();
        dll.displayReverse();
        System.out.println("Deleted element is: "+dll.deleteFirst());
        dll.display();
        System.out.println("Deleted element is: "+dll.deleteLast());
        dll.display();
    }
}
