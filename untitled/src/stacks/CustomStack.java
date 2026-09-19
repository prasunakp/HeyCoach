package stacks;

import java.util.Stack;

public class CustomStack {
    int maxSize=0;

    Stack<Integer> ans ;

    public CustomStack(int maxSize) {
        this.maxSize=maxSize;
        ans= new Stack<>();
    }

    public void push(int x) {
        if(ans.size()<maxSize){
            ans.push(x);
        }
    }

    public int pop() {
        if(ans.isEmpty()){
            return -1;
        }
        int top = ans.peek();
        ans.pop();
        return top;
    }

    public void increment(int k, int val) {
             Stack<Integer> spair = new Stack<>();
             int size = ans.size();
             for(int i=0;i<size;i++){
                 if(i<(size-k)) {
                     spair.push(ans.peek());
                     ans.pop();
                 }
                 else{
                     spair.push(ans.peek()+val);
                     ans.pop();
                 }
             }
             while (!spair.empty()){
                 ans.push(spair.peek());
                 spair.pop();
             }
    }

}
