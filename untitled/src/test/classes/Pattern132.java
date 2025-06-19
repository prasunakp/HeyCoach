package test.classes;

import java.util.Stack;

public class Pattern132 {
    public static void main(String[] args){
        Stack<Integer> elements = new Stack<>();
        int[] arr = {-1 ,2 ,3 ,0};

        int thridele = Integer.MIN_VALUE;
       for(int i = arr.length-1;i>=0;i--){

           if(!elements.empty() && arr[i]<elements.peek() && arr[i]<thridele)
               System.out.print("true");
           if(!elements.empty() && elements.peek()<arr[i]){
               thridele= elements.peek();
               elements.pop();
           }
           elements.push(arr[i]);
       }

    }
}
