package math;

import java.util.Arrays;

public class MaximumNumberOfCoinsYouCanGet {
    public static void main(String[] args){
        int[] arr = {2,4,1,2,7,8};
        int ans =0;
        Arrays.sort(arr);
        if(arr.length==3){
           ans= arr[1];
        }
        else {
            for(int i=arr.length/3 ;i<arr.length-1;i=i+2){
                ans+=arr[i];
            }
        }
        System.out.println("ans are "+ans);
    }
}
