package Strings;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class SubStringsofSizeThreeWithDistinctCharacters {
    public static void main(String[] args){
        String s = "x";
        int k=3;
        List<Character> ansChar = new ArrayList<>();
        int cnt =0;
        boolean isValid = true;
        if(s.length()<3){
            cnt=cnt+1;
        }
       else {
            for (int i = 0; i < 3; i++) {
                if (ansChar.contains(s.charAt(i))) {
                    isValid = false;
                }
                ansChar.add(s.charAt(i));
            }
            cnt = isValid ? cnt + 1 : cnt;
            for (int i = k; i < s.length(); i++) {
                ansChar.remove(0);
                if ((new HashSet<>(ansChar).size() == ansChar.size()) && !ansChar.contains(s.charAt(i))) {
                    cnt++;
                }
                ansChar.add(s.charAt(i));
            }
        }
        System.out.println("ans is "+cnt);
    }
}
