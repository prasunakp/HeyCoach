package Strings;

public class FindFirstPalindromicStringintheArray {
    public static void main(String[] args){
        String ans ="";
        String[] strArray = {"notapalindrome","racecar"};
        for(String s: strArray){
            if(checkIfPalindrome(s)){
                ans=s;
                break;
            }
        }

    }
   public static boolean checkIfPalindrome(String s){
        StringBuilder sb = new StringBuilder(s);
        if(s.equals(sb.reverse().toString())){
            return true;
        }
        return false;
    }


}
