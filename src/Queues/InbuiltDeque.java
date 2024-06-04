package Queues;

import java.util.ArrayDeque;
import java.util.Deque;

public class InbuiltDeque {
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(1);
        deque.add(2);
        deque.add(3);
        deque.add(4);
        deque.add(5);
        System.out.println(deque);
        System.out.println(deque.getFirst());
        System.out.println(deque.getLast());
        System.out.println(deque.removeFirst());
        System.out.println(deque);
        System.out.println(deque.removeLast());
        System.out.println(deque);
        deque.pop();
        System.out.println(deque);
        deque.offerFirst(0);
        System.out.println(deque);
        deque.offerLast(10);
        System.out.println(deque);
    }
}
