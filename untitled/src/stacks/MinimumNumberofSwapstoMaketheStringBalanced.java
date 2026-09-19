package stacks;

import java.util.Stack;

public class MinimumNumberofSwapstoMaketheStringBalanced {
    public static void main(String[] args){
        String s = "[[][[[[][][[[[]]][][]]]]][[][[][][]][[[[]]][[]][[]][[]]]]]]]][]][]]][[]][[[[[[][[]][[[][]][[]]][";
        Stack<Character> ansStack = new Stack<>();
        for(char ch: s.toCharArray()){
            if(ch==']' && !ansStack.isEmpty() && ansStack.peek()=='['){
                ansStack.pop();
            }
            else{
                ansStack.push(ch);
            }
        }
        //count number of unbalanced closed braces is size/2
        // one swap reduces two unbalanced braces hence we have to divide by 2
        int cnt = ansStack.size()>0&&ansStack.size()/4<1?1:ansStack.size()%4==0?ansStack.size()/4:ansStack.size()/4+1;
        System.out.println("ans is "+ cnt);
    }
}
