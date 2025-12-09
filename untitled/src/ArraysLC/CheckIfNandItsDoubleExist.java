package ArraysLC;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class CheckIfNandItsDoubleExist {
    public static void main(String[] args){
        int[] arr = {10,2,5,3};
        boolean exists = false;
        List<Integer> elements = new ArrayList<>();
        for(int i=0;i<arr.length;i++){
               if(elements.contains(arr[i]*2)||((arr[i]%2==0)&&(elements.contains(arr[i]/2)))){
                   exists=true;
                   break;
               }
               else{
                   elements.add(arr[i]);
               }
        }
        System.out.println("ans is "+exists);
    }
}
