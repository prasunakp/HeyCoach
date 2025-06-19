package test.classes;

import java.util.Stack;

public class MaxWidthRamp {

    public static void main(String[] args){

        Stack<Integer> indices = new Stack<>();
        int[] arr = {6, 0, 8, 2 ,1 ,5};
     /*   for(int i=arr.length-1;i>=0;i--){
            if(indices.empty())
           indices.push(i);
            else{
                if(arr[indices.peek()]>=arr[i])
                    indices.push(i);
            }
        }
        int strtindex = indices.peek();
        int endIndex = 0;
        while (!indices.empty()){
            endIndex = indices.peek();
            indices.pop();
        }
System.out.print("answer "+(endIndex-strtindex));*/

        for(int i=0;i< arr.length;i++){
            if(indices.empty())
                indices.push(i);
           else if(arr[indices.peek()]>arr[i])
               indices.push(i);
        }
        int maxwidth = 0;
      while (!indices.empty()) {
            for (int i = arr.length - 1; i >= 0; i--) {
                if (arr[i] >= arr[indices.peek()] && (i - indices.peek()) >= maxwidth)
                    maxwidth = i - indices.peek();
            }
        indices.pop();
       }
        System.out.print("answer is"+maxwidth);
    }
}
