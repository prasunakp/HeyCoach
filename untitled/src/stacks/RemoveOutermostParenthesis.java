package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class RemoveOutermostParenthesis {
    public static void main(String[] args){
        String s = "()()";
        List<String> listString = new ArrayList<>();
        char[] charArrray = s.toCharArray();
        String eachString ="";
        String ansString ="";
        Stack<Character> charStack = new Stack<>();
        for(int i=0;i<charArrray.length;i++){
            if(charArrray[i]=='(') {
                charStack.push(charArrray[i]);
                eachString+=charArrray[i];
            }
            else {
                eachString+=charArrray[i];
                charStack.pop();
                if(charStack.size()==0) {
                    listString.add(eachString);
                    eachString ="";
                }
            }
        }
        for(String ls: listString){
            ansString += ls.substring(1,ls.length()-1);
        }

    }
}
