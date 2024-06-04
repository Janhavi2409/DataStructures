package Stacks;

import java.util.Stack;

public class InbuiltStack {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(12);
        stack.push(11);
        stack.push(9);
        stack.push(3);
        stack.push(8);
        System.out.println(stack);
        System.out.println(stack.pop());
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.empty());
        System.out.println(stack.search(11));
        System.out.println(stack);
    }
}
