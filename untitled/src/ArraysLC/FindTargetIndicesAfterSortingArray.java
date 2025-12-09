package ArraysLC;

import java.util.ArrayList;
import java.util.Arrays;

public class FindTargetIndicesAfterSortingArray {
    public static void main(String[] args){
        ArrayList<Integer> ansList = new ArrayList<>();
        int[] nums = {1,2,5,2,3};
                int target =2;
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
          if(nums[i]==target)
              ansList.add(i);
        }
       ansList.stream().forEach(x-> System.out.println(x));
    }
}
