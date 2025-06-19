package test.classes;

import java.util.Arrays;

public class MaxAreaRectangle {

    public static void main(String[] args){

        int[] arr = {1, 3 ,4 ,5 ,4};
        int[] ls = new int[arr.length];
        int[] rs = new int[arr.length];
        int[] width = new int[arr.length];

        for(int i = 0;i<arr.length;i++){
            ls[i]= arr.length;
            for(int j=i;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    ls[i] = j;
                break;}
            }
        }
        for(int i = arr.length-1;i>=0;i--){
            rs[i] = -1;
            for(int j=i;j>=0;j--){
                if(arr[j]<arr[i]){
                    rs[i] = j;
                    break;
                }
            }
        }
        int max = 0;
        int index = 0;
       for(int i=0;i< arr.length;i++){
           width[i] = (ls[i]-rs[i]-1)*arr[i];
           if(width[i]>max){
               max = width[i];
           }
       }

       System.out.println("width is "+Arrays.toString(width));
System.out.println("area is"+Long.valueOf(max));

    }
}
