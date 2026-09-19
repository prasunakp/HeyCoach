package ArraysLC;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumSwapstoGroupAll1sTogetherII {
    public static void main(String[] args){
        int[] arr = {0,1,1,1,0,0,1,1,0};
        int[] arr2 = new int[arr.length*2];

        System.arraycopy(arr,0,arr2,0,arr.length);
        System.arraycopy(arr,0,arr2,arr.length,arr.length);
        long cnt = Arrays.stream(arr).filter(x->x==1).count();
        //cnt = cnt/2;
        int maxSum =0;
        for(int i=0;i<cnt;i++){
            maxSum+=arr2[i];
        }
        int cs=maxSum;
        for(int i = 1; i< arr2.length-cnt; i++){
             cs = cs-arr2[i-1]+arr2[i+(int)cnt-1];
            if(maxSum<cs){
                maxSum=cs;
            }
        }
        System.out.println("cloned arrsy "+ Arrays.toString(arr2)+" ans is "+(cnt-maxSum));
    }
}
