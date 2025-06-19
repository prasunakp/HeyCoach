package HashMaps;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MostFrequentElement {

    public static void main(String[] args){

        int[] arr = {7 ,532, 16, 932, 99, 2, 4, 8, 12};
        Arrays.sort(arr);
        HashMap<Integer,Integer> maps = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            maps.put(arr[i],maps.getOrDefault(arr[i],0)+1);
        }
        int max=0;
        int maxKey = 0;
        for(int a : arr){
           if((maps.get(a)>max)){
               max=maps.get(a);
               maxKey = a;
           }
        }
        System.out.println("value ois"+maxKey);
    }
}
