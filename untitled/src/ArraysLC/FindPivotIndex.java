package ArraysLC;

public class FindPivotIndex {
    public static void main(String[] args){
        int[] nums = {1,7,3,6,5,6};
        int indexOfPivot  ;

        for(int i =0;i<nums.length;i++){
            int leftsum = 0;
            int rightsum = 0;
            for(int j=i-1;j>=0;j--){
                leftsum+=nums[j];
            }
            for(int j=i+1;j< nums.length;j++){
                rightsum+=nums[j];
            }
            if(rightsum==leftsum){
                System.out.println("answer is "+i);
                break;
            }
        }
    }
}
