package HashMaps;

import java.util.*;

public class QuestForVictory {
    public static void main(String[] args){
        SupportClass c1 = new SupportClass("alice",10);
        SupportClass c2 = new SupportClass("bob",5);
        SupportClass c3 = new SupportClass("alice",5);
        SupportClass c4 = new SupportClass("bob",10);

        List<SupportClass<String,Integer>> input = new ArrayList<>();
        input.add(c1);
        input.add(c2);
        input.add(c3);
        input.add(c4);
        LinkedHashMap<String,Integer> map1 = new LinkedHashMap<>();
        String ans = "";
        int value  = 0;
        for(SupportClass<String,Integer> in : input){
             map1.put(in.getKey(),map1.getOrDefault(in.getKey(),0)+in.getValue());
        }
        int maxValue = Collections.max(map1.values());
        map1.clear();

       for(SupportClass<String,Integer> in : input){
           map1.put(in.getKey(),map1.getOrDefault(in.getKey(),0)+in.getValue());
if(map1.get(in.getKey()) == maxValue){
    ans = in.getKey();
    break;
           }
       }
       System.out.println("ans is "+ans);
    }
}
