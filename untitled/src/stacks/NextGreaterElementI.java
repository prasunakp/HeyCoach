package stacks;

import java.util.*;

public class NextGreaterElementI {
    public static void main(String[] args){
        int[] nums1 = {2,4};
        int nums2[] = {1,2,3,4};
        int[] ans = new int[nums1.length];
        Stack<Integer> ansStack = new Stack<>();
        HashMap<Integer,Integer> indexMap= new HashMap<>();
       List<Integer> ansList = new ArrayList<>(Arrays.stream(nums2).boxed().toList());

        for(int i=0;i<nums1.length;i++){
            int index = ansList.indexOf(nums1[i]);
            for(int j=index;j< nums2.length;j++){
                if(nums2[j]>nums1[i]){
                    ans[i] = nums2[j];
                    break;
                }
            }
            if(ans[i]==0){
                ans[i]=-1;
            }
        }

for(int i=0;i< ans.length;i++){
    System.out.println("ans is "+ans[i]);
}
    }
}
