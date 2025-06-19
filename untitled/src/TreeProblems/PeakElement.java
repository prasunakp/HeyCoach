package TreeProblems;

import java.util.ArrayList;
import java.util.List;

public class PeakElement {
    public static void main(String[] args){
        List<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(1);
       // nums.add(9);
        int maxIndex = 0;
        for(int i =1;i<nums.size();i++){
         if((i+1)<nums.size()){
             if((nums.get(i) > nums.get(i-1) && nums.get(i) > nums.get(i+1)) && nums.get(maxIndex)<nums.get(i))
                 maxIndex = i;
         }
         else if (nums.get(i-1)<nums.get(i) && nums.get(maxIndex)<nums.get(i))
             maxIndex = i;

        }
        System.out.println("answer is "+maxIndex);
    }
}
