package queue;

import java.util.ArrayList;
import java.util.LinkedList;

public class DesignCircularQueue {

    private ArrayList<Integer> que ;

    private int capacity;

    public DesignCircularQueue(int k) {
que = new ArrayList<Integer>();
capacity=k;

    }

    public boolean enQueue(int value) {
      if(que.size()==capacity){
          return false;
      }
      else
          que.add(value);
      return  true;
    }

    public boolean deQueue() {
        if(que.isEmpty())
            return false;
        else
      que.remove(que.get(que.size()-1));
        return true;
    }

    public int Front() {
        if(que.isEmpty())
            return -1;
        return que.get(0);
    }

    public int Rear() {

    }

    public boolean isEmpty() {
return que.isEmpty();
    }

    public boolean isFull() {
return que.size()==capacity;
    }
}
