package Stacks;

import java.util.Arrays;

class CustomStack {
    protected int[] data;
    private static final int DEFAULT_SIZE = 10;
    int ptr = -1;

    public CustomStack() {
        this(DEFAULT_SIZE);
    }

    public CustomStack(int size) {
        this.data = new int[size];
    }

    public boolean push(int item) {
        if (isFull()) {
            System.out.println("Array is full!!!");
            return false;
        }
        ptr++;
        data[ptr] = item;
        return true;
    }

    public int pop() throws StackException {
        if (isEmpty()) {
            throw new StackException("Cannot remove element from empty stack");
        }
        int val = data[ptr];
        ptr--;
        return val;
    }

    public int peek() throws StackException {
        if (isEmpty()) {
            throw new StackException("No element in the stack");
        }
        return data[ptr];
    }

    public void display() {
        for (int i = 0; i <= ptr; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
    }

    public boolean isFull() {
        return ptr == data.length - 1;
    }

    public boolean isEmpty() {
        return ptr == -1;
    }
}

public class CustomStackImpl {
    public static void main(String[] args) throws StackException {
        CustomStack stack = new CustomStack(6);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.display();
        System.out.println(stack.pop());
        stack.display();
        System.out.println(stack.peek());
        System.out.println("isFull?: " + stack.isFull());
        System.out.println("isEmpty?: " + stack.isEmpty());
    }
}