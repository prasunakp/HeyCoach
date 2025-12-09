package ArraysLC;

import java.util.Arrays;

public class MaximumProductofTwoElementsinanArray {

    public static void main(String[] args){
        int[] nums = {3,4,5,2};
        Arrays.sort(nums);
        int product = (nums[nums.length-1]-1)*(nums[nums.length-2]-1);
        System.out.println("product "+product);
    }
}
