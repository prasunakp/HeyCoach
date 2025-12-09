package ArraysLC;

public class CountingSort {
    public static void main(String[] args){
        int[] nums = {-4,-1,0,3,10};
        int[] ans = new int[nums.length];
        int max =0;
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
            if(nums[i]>max)
                max=nums[i];
        }
        int[] temparr = new int[max+1];
        for(int i=0;i<nums.length;i++){
            temparr[nums[i]] = temparr[nums[i]]+1;
        }
        for(int i=1;i< temparr.length;i++){
            temparr[i]=temparr[i-1]+temparr[i];
        }
        for(int i=0;i< nums.length;i++){
            ans[temparr[nums[i]]-1] = nums[i];
            temparr[nums[i]] = temparr[nums[i]]-1;

        }
      //  return ans;
    }
}
