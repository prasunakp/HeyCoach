package test.classes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;

public class ReverseQueue {
    public static void main(String[] args){
        Queue<Integer> e = new LinkedList<>();
        e.add(1);
        e.add(9);
        e.add(11);
        e.add(3);
        e.add(2);
ArrayList<Integer> temp = new ArrayList<>();
        int k =4;
        int size = e.size();
        for(int i =0;i<size;i++){
          temp.add(e.element());
          e.remove();
        }
       for(int i=k-1;i>=0;i--){
           e.add(temp.get(i));
       }
       for(int i = k ;i<size;i++){
           e.add(temp.get(i));
       }

System.out.println("element is "+e);
    }
}
