package BackTracking;

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    static int finalAns =0;
    public static void main (String[] args) {
        int[] nums = {3,4,5,6,7,8};
        List<Integer> arraySum = new ArrayList<>();
        int pos = 0;
        List<Integer> partial_ans = new ArrayList<>();
        printSubsets(nums, partial_ans, pos, arraySum);
        int finalSum = 0;
        for (int sum : arraySum) {
            finalSum+=sum;
        }
        System.out.println("ans "+finalSum);
    }

    public static void printSubsets(int[] arr, List<Integer> partial_ans,int i,List<Integer> ans){
        if(i== arr.length){
            int sum =0;
            for( int j=0 ; j<partial_ans.size() ; j++){
                sum=sum^partial_ans.get(j);
            }
            ans.add(sum);
            return ;
        }
        partial_ans.add(arr[i]);
        printSubsets(arr,partial_ans,i+1,ans);
        partial_ans.remove(partial_ans.size()-1);
        printSubsets(arr,partial_ans,i+1,ans);
    }
}
