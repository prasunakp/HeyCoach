package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePartitioning {
    public static void main(String[] args){
        String s = "cdd";
        List<List<String>> ansList = new ArrayList<>();
            List<String> ans =new ArrayList<>();
            getPalindromeStrings(s,ans,ansList);
          for (List<String> aa :ansList){
                       System.out.println(aa);
            }
    }

    public static void getPalindromeStrings(String s,List<String> ans,List<List<String>> ansList){
         if(s.length()==0){
             ansList.add(ans);
             return;
         }
         for(int i=0;i<s.length();i++){
             if(isPalindrome(s.substring(0,i+1))){
                    ans.add(s.substring(0,i+1));
                getPalindromeStrings(s.substring(i+1),ans,ansList);
                ans.remove(ans.size()-1);
             }
         }
    }

    private static boolean isPalindrome(String s) {
        StringBuilder reverseString = new StringBuilder(s);
        reverseString=reverseString.reverse();
        return reverseString.toString().equals(s);
    }
}
