package linkedlistprob;

import java.util.ArrayList;
import java.util.Collections;

public class PalindromeList {

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(2);
        ListNode h3 = new ListNode(3);
        head.next = h1;
        h1.next = h2;
        h2.next =h3;
        h3.next = null;
        ArrayList<Integer> nodes = new ArrayList<>();
        ListNode temp = head;
        while (temp!=null){
            nodes.add(temp.val);
            temp = temp.next;
        }
      for(int i =0;i<nodes.size();i++){
          if(nodes.get(i) != nodes.get(nodes.size()-1-i))
              System.out.print("false");
      }
    }
}
