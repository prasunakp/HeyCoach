package ArraysLC;

public class ConcatenationofArray {
    public static void main(String[] args){
        int[] nums = {1,2,1};
        int[] ans = new int[nums.length*2];
        for(int i =0;i< nums.length;i++){
            ans[i]=ans[nums.length+i]=nums[i];
        }
        for(int i=0;i< ans.length;i++)
        System.out.println(ans[i]);
    }
}
