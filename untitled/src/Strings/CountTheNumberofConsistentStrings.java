package Strings;

import java.util.HashSet;

public class CountTheNumberofConsistentStrings {

    public static void main(String[] args){
        String allowed = "abc";
        String[] chars = {"a","b","c","ab","ac","bc","abc"};
        HashSet<Character> stringSet = new HashSet<>();
        int cnt =0;
        for(char ch : allowed.toCharArray()){
         stringSet.add(ch);
        }
        for(String eachString : chars){
            boolean valid=true;
            for(int i=0;i<eachString.length();i++){
                if(!stringSet.contains(eachString.charAt(i))){
                    valid=false;
                    break;
                }
            }
            if(valid){
                cnt++;
            }
        }
        System.out.println("count is "+cnt);
    }
}
