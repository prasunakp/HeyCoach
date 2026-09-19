package Strings;

import java.util.HashMap;
import java.util.HashSet;

public class CheckIfAllCharactersHaveEqualNumberOfOccr {
    public static void main(String[] args){
        String  s = "aaacbc";
        HashMap<Character,Integer> ansMap =new HashMap<>();
for(char ch : s.toCharArray()){
    ansMap.put(ch,ansMap.getOrDefault(ch,0)+1);
}
        HashSet<Integer> values = new HashSet<>(ansMap.values());
boolean isValid = values.size()==1?true:false;
System.out.println("ans is "+isValid);
    }
}
