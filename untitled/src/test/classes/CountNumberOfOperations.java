package test.classes;

import java.util.Stack;

public class CountNumberOfOperations {

    public static void main(String[] args){
               String s ="}}}}}}{}{}}}{{}}}}{}}{{{}{}{}{}}{{{{}}}{}}";
               char[] chars = s.toCharArray();
               int cnt = 0;
        Stack<Character> stack = new Stack<>();

        for(int i =0;i<chars.length;i++){
            if(stack.empty() && chars[i] == '}') {
                cnt++;
                stack.push('{');
            }
            else{
                if(!stack.empty() && stack.peek()=='{' && chars[i] == '}' )
                    stack.pop();
                else stack.push(chars[i]);
            }
        }
       cnt += stack.size()/2;
        System.out.print("answer is "+cnt);
    }
}
