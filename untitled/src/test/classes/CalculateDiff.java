package test.classes;

import java.util.Arrays;

public class CalculateDiff
{
    public static void main(String[] args){
        int[] arr = {2, 4, 8, 7, 7, 9, 3};
        int[] ls = new int[arr.length];
        //ls[0]=0;
        int[] rs = new int[arr.length];
        for(int i =1;i<arr.length;i++){
            for(int j=i-1;j>=0;j--){
              if(arr[j]<arr[i]) {
                ls[i] = arr[j];
                break;
                }
              }
            }
        for(int i =arr.length-2;i>=0;i--){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]) {
                    rs[i] = arr[j];
                    break;
                }
            }
        }
int max= 0;
        for(int i=0;i< arr.length;i++){
if(Math.abs(ls[i]-rs[i])>max){
    max= Math.abs(ls[i]-rs[i]);
}
        }

      System.out.println("ls is "+ Arrays.toString(ls));
        System.out.println("ls is "+ Arrays.toString(rs));
        System.out.println("answer is "+max);
    }
}
