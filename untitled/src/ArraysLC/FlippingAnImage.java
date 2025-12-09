package ArraysLC;

import java.util.Arrays;

public class FlippingAnImage {

    public static void main(String[] args){
        int[][] arr = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};
        int length = arr.length;
        int[][] ansarr =new int[length][length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j< arr.length;j++) {
                if(j< arr.length-1)
                    ansarr[i][arr.length-1-j] = arr[i][j]^1;
                else
                    ansarr[i][0] = arr[i][j]^1;
            }
        }
        for(int i=0;i<arr.length;i++) {
            for (int j = 0; j < arr.length; j++) {

System.out.println(ansarr[i][j]);
            }
        }
    }
}
