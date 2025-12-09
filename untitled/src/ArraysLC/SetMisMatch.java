package ArraysLC;

import java.security.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class SetMisMatch {
    public static void main(String[] args){
        int[] nums = {1,2,2,4};
       // HashMap<Integer,Integer> keyValues = new HashMap<>();
List<Integer> values = new ArrayList<>();
int repeatedNum = 0;
int arraySum =0;
        for(int num : nums){
           if(!values.contains(num)){
               values.add(num);
           }
           else {
               repeatedNum = num;
           }
           arraySum+=num;
        }

        int misNUmber = (nums.length*(nums.length+1)/2)+repeatedNum -arraySum;
        System.out.println("Nans is "+misNUmber);
    }
}
