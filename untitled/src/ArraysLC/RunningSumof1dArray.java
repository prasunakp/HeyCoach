package ArraysLC;

public class RunningSumof1dArray {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] prefix = new int[nums.length];
        prefix[0]=nums[0];
        for(int i=1;i<nums.length;i++){
            prefix[i] = nums[i]+prefix[i-1];
        }
        for(int num : prefix){
            System.out.println(""+num);
        }
    }
}
