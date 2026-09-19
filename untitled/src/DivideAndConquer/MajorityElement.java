package DivideAndConquer;

import java.util.HashMap;

public class MajorityElement {
    public static void main(String[] args){
        int[] nums = {2,2,1,1};
        HashMap<Integer,Integer> cntMap = new HashMap();
        int maxFreq=0;
        int mostFreqEle = 0;
        for(int i=0;i<nums.length;i++){
            cntMap.put(nums[i],cntMap.getOrDefault(nums[i],0)+1);
            if(cntMap.get(nums[i])>maxFreq){
                maxFreq=cntMap.get(nums[i]);
                mostFreqEle=nums[i];
            }

        }
      System.out.println("most freq ele "+mostFreqEle);
    }
}
