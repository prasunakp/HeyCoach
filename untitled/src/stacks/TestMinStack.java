package stacks;

public class TestMinStack {

    public static void main(String[] args){
        MinStack minStack = new MinStack();
        minStack.push(-2);
        minStack.push(0);
        minStack.push(-1);
        System.out.println("min is "+minStack.getMin());
    }
}
