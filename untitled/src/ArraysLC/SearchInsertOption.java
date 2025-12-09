package ArraysLC;

public class SearchInsertOption {
    public  static void main(String[] args){
        int[] nums = {1,3,5,6};
        int target = 7;
        int ans = nums.length;
        for(int i=0;i< nums.length;i++){
            if(nums[i]>=target){
                ans=i;
                break;
            }
        }
System.out.println("ans "+ans);
    }
}
