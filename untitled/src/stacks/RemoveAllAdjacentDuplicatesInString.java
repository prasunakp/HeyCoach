package stacks;

import java.util.Stack;

public class RemoveAllAdjacentDuplicatesInString {
    public static void main(String[] args){
                String s = "azxxzy";
        Stack<Character> ans = new Stack<>();
        String ansString = "";

         //   s= ansString.isBlank()?s:ansString;
            for(int i=0;i<s.length();i++){
                if(ans.size()>0 && ans.peek().equals(s.charAt(i))){
                    ans.pop();
                    ansString=ansString.substring(0,ansString.length()-1);
                }
                else{
                    ans.push(s.charAt(i));
                    ansString+=s.charAt(i);
                }

            }
            ans.clear();

System.out.println("ans "+ansString);

    }
}
