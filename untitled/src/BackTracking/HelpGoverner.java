package BackTracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class HelpGoverner {
    public static void main(String[] args){
        List<Integer> votes = new ArrayList<>();
        votes.add(4);
        votes.add(3);
        votes.add(2);
        votes.add(1);
        votes.add(2);
        votes.add(1);
        List<Integer> v1 = new ArrayList<>();
        HashMap<Integer,Integer> count = new HashMap<>();
        for(Integer v: votes){
count.put(v,count.getOrDefault(v,0)+1);
        }

        for(Map.Entry<Integer,Integer> entrySet : count.entrySet()){
            if(entrySet.getValue()>1)
                v1.add(entrySet.getKey());
        }
        System.out.println("answer is "+v1);
    }
}
