package Queues;

class CustomQueue {
    private int[] data;
    private static final int DEFAULT_SIZE = 10;
    int end = 0;

    public CustomQueue(int size) {
        this.data = new int[size];
    }

    public CustomQueue() {
        this(DEFAULT_SIZE);
    }

    public boolean isFull() {
        if (end == data.length) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (end == 0) {
            return true;
        }
        return false;
    }

    public boolean insert(int item) {
        if (isFull()) {
            return false;
        }
        data[end] = item;
        end++;
        return true;
    }

    public int remove() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from an empty queue!!!");
        }
        int removed = data[0];
        for (int i = 0; i < end; i++) {
            data[i] = data[i + 1];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Queue is empty!!!");
        }
        return data[0];
    }

    public void display() {
        for (int i = 0; i < end; i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.println("END");
    }
}

public class CustomQueueImpl {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue();
        queue.insert(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);
        queue.display();
        System.out.println("Deleted element: " + queue.remove());
        queue.display();
        System.out.println("Element in front: " + queue.front());
        queue.insert(6);
        queue.insert(7);
        queue.insert(8);
        queue.insert(9);
        queue.insert(10);
        queue.display();
        System.out.println("isFull(): " + queue.isFull());
        System.out.println("isEmpty(): " + queue.isEmpty());
    }
}
