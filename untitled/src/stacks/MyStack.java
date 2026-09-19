package stacks;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MyStack {

   private  Queue<Integer> inputQueue;

    public MyStack() {
        inputQueue= new LinkedList<>();
    }

    public void push(int x) {
        inputQueue.offer(x);
        for(int i=0;i<inputQueue.size()-1;i++){
            inputQueue.offer(inputQueue.poll());
        }
    }
    public int top() {
        return inputQueue.peek();
    }

    public boolean empty() {
        return inputQueue.isEmpty();
    }

    }
