package TreeProblems;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BookAllocationProblem {

    public  static  void main(String[] args){
        int[] arr = {12,34,67,90};
        int noOfStudents = 2;
        int maxPages = 0;
        for(int page : arr){
            maxPages+= page;
        }
        System.out.println("ans is"+maxPages);
        int start =0;
        int end = maxPages;

int mid =0;
int ans =0;
      while (start<= end){
          mid = (start+end)/2;
          if(isValid(mid,noOfStudents,arr)){
              ans = mid;
              end = mid-1;
          }
          else{
              start = mid+1;
          }
      }
System.out.println("answer is "+ans);
    }

    public static boolean isValid(int mid, int noOfStudents, int[] arr){
      int reqStudents =1;
        int bookAlloc = 0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]>mid){
                return false;
            }
      if((bookAlloc + arr[i])>mid){
          reqStudents ++;
          bookAlloc = arr[i];
      }
      else{
          bookAlloc += arr[i];
      }
        }
      if(reqStudents>noOfStudents){
          return false;
      }
      else {
          return true;
      }
    }
}

