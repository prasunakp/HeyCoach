package test.classes;

import java.util.Arrays;

public class ReduceSum {

    public static  void main(String[] args){
int[] nums = {3,8,20};
        Arrays.sort(nums);
        int sumOfArr =0;
        for(int i =0; i<nums.length;i++){
            sumOfArr += nums[i];
        }
        sumOfArr = sumOfArr/2;
        int index =0;
while(sumOfArr>=0){
    sumOfArr -= nums[index]/2;
    nums[index] = nums[index]/2;
    if(sumOfArr<nums[index])
        index++;
}

    }
}
