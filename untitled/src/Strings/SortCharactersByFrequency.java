package Strings;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SortCharactersByFrequency {
    public static void main(String[] args){

        String s = "cccaaa";
        String ans = "";
        char[] ch = s.toCharArray();
        HashMap<Character,Integer> kvpairs = new HashMap<>();
        for(Character ch1 : ch){
            kvpairs.put(ch1, kvpairs.getOrDefault(ch1,0)+1);
        }


       Stream<Map.Entry<Character,Integer>> sortedList = kvpairs.entrySet().stream().sorted(Collections.reverseOrder(Map.Entry.comparingByValue()));

        for(Map.Entry<Character,Integer> kvpair : sortedList.collect(Collectors.toList())) {
            for(int i=0;i<kvpair.getValue();i++){
                ans+=kvpair.getKey();
            }
        }
        System.out.println("value "+ans);
    }

}
