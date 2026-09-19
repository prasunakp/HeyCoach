package stacks;

import java.util.Stack;

public class BaseballGame {
    public static void main(String[] args){
        String[] operations = {"5","-2","4","C","D","9","+","+"};
        Stack<Integer> ops = new Stack<>();
        int ans=0;
        for(int i=0;i<operations.length;i++){
            switch (operations[i]){
                case "+":
                    int lasteleIndex = ops.size()-1;
                    ops.push(ops.peek()+ops.get(lasteleIndex-1));
                    break;
                case "C":
                    ops.pop();
                    break;
                case "D":
                      ops.push(ops.peek()*2);
                      break;
                default:
                    ops.push(Integer.valueOf(operations[i]));
                    break;
            }
        }
        for(int i=0;i<ops.size();i++){
            ans += ops.get(i);
        }
        System.out.println("ans are "+ans);
    }
}
