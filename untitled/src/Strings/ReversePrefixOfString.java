package Strings;

public class ReversePrefixOfString {
    public static void main(String[] args){
        String s = "abcdefd";
        char ch ='d';
       s= s.replace(s.substring(0,s.indexOf(ch)+1), reverseString(s.substring(0,s.indexOf(ch)+1)));
        System.out.println("ans is "+s);
    }
    public static String reverseString(String a){
        String ans="";
        for(int i=(a.length()-1);i>=0;i--){
            ans+=a.charAt(i);
        }
        return ans;
    }
}
