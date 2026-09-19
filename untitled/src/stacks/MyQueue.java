package stacks;

import java.util.Stack;

public class MyQueue {

    private Stack<Integer> inputStack;
    private Stack<Integer> outputStack;

    public MyQueue() {
        inputStack = new Stack<>();
        outputStack = new Stack<>();
    }

    public void push(int x){
        inputStack.push(x);
    }
    public int pop() {
        while(!inputStack.isEmpty()){
            outputStack.push(inputStack.peek());
            inputStack.pop();
        }
       int peek=  outputStack.peek();
        outputStack.pop();
        while (!outputStack.isEmpty()){
            inputStack.push(outputStack.peek());
            outputStack.pop();
        }
        return peek;
    }

    public int peek(){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.peek());
                inputStack.pop();
            }
            int peek=  outputStack.peek();
            while (!outputStack.isEmpty()){
                inputStack.push(outputStack.peek());
                outputStack.pop();
            }
            return peek;
    }

    public boolean empty() {
            return inputStack.isEmpty();
    }

}
