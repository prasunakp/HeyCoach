package Strings;

import java.util.ArrayList;
import java.util.List;

public class LetterCasePermutation {

    public static void main(String[] args){
        String s= "a1b2";
        List<String> ansList= new ArrayList<>();
        char[] charArray = s.toCharArray();
        for(int i=0;i<charArray.length;i++){
            if(Character.isLetter(charArray[i])){
                char ch = charArray[i];
                charArray[i] = Character.toLowerCase(charArray[i]);
                ansList.add(new String(charArray));
                charArray[i] = Character.toUpperCase(charArray[i]);
                ansList.add(new String(charArray));
            }
        }
        for(String ans : ansList){
            System.out.println(" "+ans+" ");
        }
    }
}
