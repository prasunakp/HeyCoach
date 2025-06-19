package test.classes;

import java.util.ArrayList;
import java.util.Arrays;

public class KingsLand {

    public static void main(String[] args){
      //  int[] arr = {4, 3, 5, 1, 2};
        ArrayList<Integer> arr1 = new ArrayList<>();
        arr1.add(4);
        arr1.add(3);
        arr1.add(5);
        arr1.add(1);
        arr1.add(2);

        int[] ans = new int[arr1.size()];
        for(int i = 0;i<arr1.size();i++){
            int sum = arr1.get(i);
           for(int j=i+1;j< arr1.size();j++){
               if(arr1.get(i)>arr1.get(j))
                   sum += arr1.get(j);
               else
                   break;
           }
           for(int j=i-1;j>=0;j--){
               if(arr1.get(i)>arr1.get(j))
                   sum+=arr1.get(j);
               else break;
           }
           ans[i] =  sum;
        }
        for(int i =0; i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}
