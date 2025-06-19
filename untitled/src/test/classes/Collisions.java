package test.classes;

import java.util.Arrays;
import java.util.Stack;

public class Collisions {

    public static void main(String[] args){

        int[] arr = {3,5,-3};
        Stack<Integer> num = new Stack<>();
        for(int i =0;i< arr.length;i++) {
            if (num.empty())
                num.push(arr[i]);
           else  if (num.peek() < 0 && arr[i] < 0 || num.peek() > 0 && arr[i] > 0 || num.peek() < 0 && arr[i] > 0)
                num.push(arr[i]);
             else   if (num.peek() > 0 && arr[i] < 0) {
                    if(Math.abs(num.peek()) == Math.abs(arr[i])) {
                        num.pop();
                        continue;
                    }
                    if (Math.abs(num.peek()) > Math.abs(arr[i])) {

                        continue;
                    } else {
                        num.pop();
                        num.push(arr[i]);
                    }


            }
        }

        int[] ans = new int[num.size()];
        int length = num.size();
        for(int i=0;i<length;i++){
            ans[length-i-1] = num.peek();
        num.pop();}
        System.out.print("ans is "+ Arrays.toString(ans));
    }
}
