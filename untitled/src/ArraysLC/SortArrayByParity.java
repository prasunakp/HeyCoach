package ArraysLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SortArrayByParity {
    public static void main(String[] args){
        int[] nums = {3,1,2,4};
        int[] ans = new int[nums.length];
       long cnt=  Arrays.stream(nums).filter(x->x%2==0).count();
       int si = 0;
       int li = Integer.valueOf(String.valueOf(cnt));
       for(int i=0;i<nums.length;i++){
          if(nums[i]%2==0){
              ans[si] = nums[i];
              si++;
          }
          else{
              ans[li] = nums[i];
              li++;
          }
       }
       System.out.println("ans is "+Arrays.toString(ans));
    }
}
