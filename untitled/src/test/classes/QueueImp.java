package test.classes;

import java.util.*;
import java.util.concurrent.SynchronousQueue;

public class QueueImp {

    public static void main(String[] args){
        Vector<Integer> nums = new Vector<>();
        nums.add(1);
        nums.add(3);
        nums.add(6);
        nums.add(9);
        nums.add(8);
        Vector<Integer> nums1 = new Vector<>();
        //nums1.equals()
Collections.reverse(nums);
        System.out.print(nums);

        Queue<Integer> e = new LinkedList<>();

        for(Integer num : nums){
            e.add(num);
        }
System.out.print(e);
    }
}
