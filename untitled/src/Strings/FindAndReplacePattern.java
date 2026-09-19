package Strings;

import java.util.*;

public class FindAndReplacePattern {
    public static void main(String[] args){
        String[] words = {"abcdefghijklab","abcdefghijkabl"};
        String pattern = "abcdefghijklab";
        List<Integer> ansPat = normaliZeString(pattern);
List<String> ansList = new ArrayList<>();
for(String s : words){
    if(ansPat.equals(normaliZeString(s))){
        ansList.add(s);
        System.out.println("ans "+s);
    }
}

    }
    public static List<Integer> normaliZeString(String   pattern ){
        List<Integer> ansPat= new ArrayList<>();
        int start =1;
        HashMap<Character,Integer> ansMap = new HashMap<>();
        for(char ch : pattern.toCharArray()){
            if(!ansMap.containsKey(ch)){
                ansMap.put(ch,start);
                start++;
            }
        }
        for(char ch : pattern.toCharArray()){
            ansPat.add(ansMap.get(ch));
        }
        return ansPat;
    }
}
