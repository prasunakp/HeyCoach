package setsjava;

import java.util.ArrayList;
import java.util.List;

public class MinimumAbsoluteDiff {

    public static void main(String[] args){
List<Integer> nums = new ArrayList<>();
nums.add(1);
nums.add(2);
nums.add(3);
nums.add(4);
//nums.add(15);
int k = 3;
int minSum =Integer.MAX_VALUE;
for(int i = 0;i<nums.size();i++){
    for(int j=i;j<nums.size();j++){
        if((j+k)< nums.size() && minSum>(Math.abs(nums.get(j) - nums.get(j+k) ))){
            minSum = Math.abs(nums.get(j) -nums.get(k+j) );
        }
    }
}
System.out.println(minSum);
    }
}
