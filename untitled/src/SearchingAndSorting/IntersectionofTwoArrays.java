package SearchingAndSorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class IntersectionofTwoArrays {
    public static void main(String[] args){
       int[] nums1 = {1,2,2,1};
       int[] nums2 = {2,2};
       List<Integer> ans = new ArrayList<>();

       nums1 = Arrays.stream(nums1).distinct().toArray();
       nums2 = Arrays.stream(nums2).distinct().toArray();
for(int i=0;i<nums1.length;i++){
    for(int j=0;j<nums2.length;j++){
if(nums1[i]==nums2[j]){
    ans.add(nums1[i]);
}
    }
}
nums1= new int[ans.size()];

for(int i=0;i<nums1.length;i++){
    nums1[i] = ans.get(i);
}

    }
}
