package Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutationOnline {
    public static void main(String[] args){
        String s = "a1b2";
        List<String> ansList = new ArrayList<>();
         helper(s.toCharArray(),ansList,0);
         for(String ans: ansList){
             System.out.println("ans is "+ans);
         }
    }
    public static void helper (char[] s, List<String> ans, int index){
        if(index==s.length){
            ans.add(new String(s));
            return;
        }
        if(Character.isDigit(s[index])){
            helper(s,ans,index+1);
        }
        else{
            s[index] = Character.toLowerCase(s[index]);
           helper(s,ans,index+1);

           s[index] = Character.toUpperCase(s[index]);
           helper(s,ans,index+1);
        }
    }
}
