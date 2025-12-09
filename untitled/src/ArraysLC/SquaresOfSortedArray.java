package ArraysLC;

import java.util.Arrays;

public class SquaresOfSortedArray {
    public static void main(String[] args){
int[] nums = {-4,-1,0,3,10};

int max =0;
    for(int i=0;i<nums.length;i++){
         nums[i] = nums[i]*nums[i];
            if(nums[i]>max)
                 max=nums[i];
    }
        Arrays.sort(nums);
for(int i =0;i< nums.length;i++){
    System.out.println(nums[i]);
}
    }
}
