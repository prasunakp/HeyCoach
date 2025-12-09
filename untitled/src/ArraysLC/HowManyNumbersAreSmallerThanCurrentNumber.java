package ArraysLC;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Objects;

public class HowManyNumbersAreSmallerThanCurrentNumber {

    public static void main(String[] args){
        int[] arr = {8,1,2,2,3};
        int[] arr1 = Arrays.copyOf(arr,arr.length);

        int[] ans = new int[arr.length];
        Arrays.sort(arr);
System.out.println("arr 1 "+arr1[0]);
        HashMap<Integer, Integer> valueMap = new HashMap<>();
        for(int i=0;i< arr.length;i++){
         if(Objects.isNull(valueMap.get(arr[i]))){
             valueMap.put(arr[i],i);
         }
       }
       for(int i =0;i< arr1.length;i++){
           ans[i] = valueMap.get(arr1[i]);
           System.out.println("map "+ans[i]);
       }
    }
}
