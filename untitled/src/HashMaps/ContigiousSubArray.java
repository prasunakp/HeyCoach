package HashMaps;

import java.util.HashMap;

public class ContigiousSubArray {
    public static void main(String[] args){
        int[] arr = {0, 1, 0};
        int size = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
            if(map.get(0) == map.get(1)){
                size  = i+1;
            }
        }
        System.out.println("size is"+size);
    }
}
