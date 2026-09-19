package stacks;

import java.util.Stack;
import java.util.HashMap;

public class MinStack {

    private Stack<HashMap<Integer,Integer>>  ansStack;
    public MinStack() {
        ansStack= new Stack<>();
    }

    public void push(int value) {
        HashMap<Integer,Integer> element = new HashMap<>();
        if(ansStack.isEmpty())
        {
            element.put(value,value);
            ansStack.push(element);
        }
        else
        {
            HashMap<Integer, Integer> valMap = ansStack.peek();
          int val1 =  valMap.values().iterator().next();
          int val = val1>value?value:val1;
          element.put(value,val);
          ansStack.push(element);
        }

    }

    public void pop() {
            ansStack.pop();
    }

    public int top() {
        if(ansStack.isEmpty()){
            return 0;
        }
        return ansStack.peek().entrySet().iterator().next().getKey();
    }

    public int getMin() {
        HashMap<Integer, Integer> valMap = ansStack.peek();
        return valMap.values().iterator().next();
    }

}
