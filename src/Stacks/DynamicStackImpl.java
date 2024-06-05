package Stacks;

class DynamicStack extends CustomStack {
    public DynamicStack() {
        super();
    }

    public DynamicStack(int size) {
        super(size);
    }

    @Override
    public boolean push(int item) {
        if (this.isFull()) {
            int[] temp = new int[data.length * 2];
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        return super.push(item);
    }
}

public class DynamicStackImpl {
    public static void main(String[] args) throws StackException {
        DynamicStack stack = new DynamicStack(3);
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
