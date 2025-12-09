package ArraysLC;

import java.util.Arrays;

public class MaximumProductDifferenceBetweenTwoPairs {
    public static void main(String[] args){
        int[] nums = {5,6,2,7,4};
        Arrays.sort(nums);
     int diff =  Math.abs( nums[0]*nums[1] -nums[nums.length-1]*nums[nums.length-2]);
     System.out.println("answer "+diff);
    }
}
