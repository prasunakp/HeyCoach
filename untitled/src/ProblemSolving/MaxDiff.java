package ProblemSolving;

import java.util.Arrays;

public class MaxDiff {
    public static void main(String[] args){
        int[] arr = {3, 6 ,9 ,1};
   int diff = 0;
        Arrays.sort(arr);
        for(int i = 0;i<arr.length -1;i++){
            if((arr[i+1] - arr[i]) > diff)
            diff  = arr[i+1] - arr[i];
        }

    }
}
