package ArraysLC;

import java.security.Key;
import java.util.HashMap;
import java.util.Map;

public class DivideArrayIntoEqualPairs {

    public static void main(String[] args)
    {
        int[] arr = {3,2,3,2,2,2};
        HashMap<Integer, Integer> count = new HashMap<>();
        for(int num : arr){
            count.put(num,count.getOrDefault(num,0)+1);
        }
        for(Map.Entry<Integer,Integer> val : count.entrySet()){
            if(!(val.getValue()%2==0)){
                System.out.println("false");
                break;
            }
        }
    }
}
