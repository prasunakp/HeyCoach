package test.classes;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Vector;

public class QueueFuncImp {
    public static  void main(String[] args){
        Vector<Integer> nums = new Vector<>();
        nums.add(1);
        nums.add(9);
        nums.add(11);
        nums.add(3);
        nums.add(2);
int k =2;
        nums.remove(0);
        System.out.println(nums);
        System.out.println(nums.get(0));
        System.out.println(nums.contains(k));
        System.out.println(nums);

        Queue<Integer> e = new LinkedList<>();

        for(Integer num : nums){
            e.add(num);
        }

    }
}
