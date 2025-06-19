package ProblemSolving;

import java.util.Arrays;

public class ArraywithMinimumCost {

    public static void main(String[] args){
        int[] arr = {10, 3, 1, 1};
        int indexElmt = arr[0];

        Arrays.sort(arr);
       int sum = (indexElmt==arr[0])?arr[0]+arr[1]+arr[2]:indexElmt+arr[0]+arr[1];
       System.out.println("sum is "+sum);

    }
}
