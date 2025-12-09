package ArraysLC;

import java.util.Arrays;

public class FindFirstPalindromicStringintheArray{
    public static void main(String[] args){
        String[] arr = {"abc","car","ada","racecar","cool"};
        for(String a : arr){
if(a.equalsIgnoreCase((new StringBuffer(a)).reverse().toString())){
    System.out.println("Palindrome Exists for "+a);
}
        }
    }
}
