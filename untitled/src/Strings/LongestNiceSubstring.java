package Strings;

import java.util.HashSet;

public class LongestNiceSubstring {
    public static void main(String[] args){

        String s = "Bb";

String ans =longestSubString(s);
        System.out.println("ans is "+ans);

}



    public static String longestSubString(String s){
    if(s.length()<2) {
        return "";
    }
        HashSet<Character> strArrap = new HashSet<>();
        for(int i=0;i<s.length();i++){
            strArrap.add(s.charAt(i));
        }
        for(int i=0;i<s.length();i++) {
            if (strArrap.contains(Character.toLowerCase(s.charAt(i))) &&
                    strArrap.contains(Character.toUpperCase(s.charAt(i)))) {
                continue;
            }
            String prev = longestSubString(s.substring(0, i));
            String next = longestSubString(s.substring(i+1));

return prev.length()>=next.length()?prev:next;
        }
        return s;
    }
}
