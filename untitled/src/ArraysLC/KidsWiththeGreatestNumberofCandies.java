package ArraysLC;

import sessiontests.PrefixSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class KidsWiththeGreatestNumberofCandies {
    public static void main(String[] args){
      int[] nums = {2,3,5,1,3};
      int extraCandidates = 3;
      List<Boolean> ans = new ArrayList<>();
      int MaxCandies = 0;
      for(int num : nums){
          if(num > MaxCandies){
              MaxCandies  =  num;
          }
      }
 for(int num :  nums){
     ans.add(num+ extraCandidates >=MaxCandies);

        }
 for(Boolean an : ans){
     System.out.println(an);
 }

    }
}
