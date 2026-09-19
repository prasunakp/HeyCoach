package math;

import java.util.Arrays;

public class StoneGame {
    public static void main(String[] args){
        int[] arr = {5,3,4,5};
        int ans =0;
        Arrays.sort(arr);
        if(arr.length==2){
            ans= arr[1];
        }
        else {
            for(int i=arr.length/2 ;i<arr.length;i++){
                ans+=arr[i];
            }
        }
    }
}
