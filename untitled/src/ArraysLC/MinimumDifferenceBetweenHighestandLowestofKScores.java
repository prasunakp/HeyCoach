package ArraysLC;

import java.util.Arrays;

public class MinimumDifferenceBetweenHighestandLowestofKScores {
    public static void main(String[] args){
int[] arr = {9,4,1,7};
int k=2;
int min = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for(int i=0;(i+k)<=arr.length;i++){
         if(Math.abs(arr[i]-arr[i+k-1])<min){
             min = Math.abs(arr[i]-arr[i+k-1]);
           }
        }
        System.out.println("ans "+min);
    }
}
