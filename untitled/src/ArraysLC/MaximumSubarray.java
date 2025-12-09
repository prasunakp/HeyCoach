package ArraysLC;

public class MaximumSubarray {

    public  static  void main(String[] args) {
        int[] nums = {-5,-4,-1,-7,-8};
        int currenstSum =0;
        int maxSum = Integer.MIN_VALUE;

        for(int i=0;i<nums.length;i++){
         currenstSum+=nums[i];
         maxSum=Math.max(currenstSum,maxSum);
         if(currenstSum<0){
             currenstSum=0;
         }
        }
        System.out.println("Max sum "+maxSum);
    }

}
