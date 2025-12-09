package ArraysLC;

public class ShuffleTheArray {
    public static void main(String[] args){
        int[] nums = {2,5,1,3,4,7};
        int[] ans = new int[nums.length];
        for(int i=0,j=nums.length/2,k=0;i<nums.length/2;i++,j++,k=k+2){
           ans[k]=nums[i];
           ans[k+1]=nums[j];
        }
        for(int i=0;i< ans.length;i++)
        System.out.println(ans[i]);
    }
}
