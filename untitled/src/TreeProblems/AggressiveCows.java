package TreeProblems;

import java.util.Arrays;

public class AggressiveCows {

    public static void main (String[] args){
        int[] arr = {1,2,3,4,5,6};
      int k =3;
        Arrays.sort(arr);
        int start =0;
        int end = arr[arr.length-1]-arr[0];
        int mid = 0;
        int ans =0;
        while (start<=end){
            mid = (start+end)/2;
                if(isValid(mid,k,arr)){
                        ans = mid;
                        start = mid+1;
                }
                else{
                     end = mid-1;
                }
        }
System.out.println("answer is "+ans);
    }
    public static boolean isValid(int mid, int noOfCows, int[] arr){
        int prevPlacedCow = arr[0];
        int cows =1;
        for(int i=1;i<arr.length;i++){
          if((arr[i]-prevPlacedCow) >= mid){
              prevPlacedCow = arr[i];
              cows++;
                }
            }
     if(cows<noOfCows){
         return false;
     }
        return true;
    }
}
