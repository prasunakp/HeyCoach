package Strings;

public class ReverseWordsInaString {
    public static void main(String[] args){
        String s= "Let's take LeetCode contest";
String ans="";
for(String s1:s.split(" ")){

      ans+=reverseString(s1)+" ";
}
System.out.println("ans is "+ans.trim());
    }
    public static String reverseString(String a){
        String ans="";
        for(int i=(a.length()-1);i>=0;i--){
            ans+=a.charAt(i);
        }
        return ans;
    }
}
