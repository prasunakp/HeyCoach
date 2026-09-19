package stacks;

import java.util.Stack;
/*
       What can we notice in the problem?
We can see that we need the next greater element for every number, right?

What we can do is ->

Make a stack and push index 0 in it (because for index 0, we donot have any greater element right now)
Check for every index from 1 to n
If element less than this number is/are present in stack just keep on popping them and update in your answer array the difference in indexes of both of these (we want distance between index of these 2 numbers, right)
Push the index for which you were checking in the stack (bcoz we have not got any element greater than this element)
        */
public class DailyTemperatures {
    public static void main(String[] args){
        int[] temp = {30,40,50,60};

        int[] ans = new int[temp.length];
        Stack<Integer> stack = new Stack<>();
        for(int i = temp.length-1;i>=0;i--){
            while (!stack.isEmpty() && temp[stack.peek()]<=temp[i]){
                stack.pop();
            }
            if (!stack.isEmpty() && temp[stack.peek()]>temp[i]){
                ans[i] = stack.peek()-i;
                stack.push(i);
            }
            if(stack.isEmpty()){
                stack.push(i);
            }
        }
        for(int i =0;i<ans.length;i++){
            System.out.println("values are "+ans[i]);
        }

    }
}
