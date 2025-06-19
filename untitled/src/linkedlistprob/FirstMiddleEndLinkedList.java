package linkedlistprob;

import java.util.List;

public class FirstMiddleEndLinkedList {

    public static void main(String[] args){

        ListNode head = new ListNode(2);

        ListNode h1 = new ListNode(4);
        ListNode h2 = new ListNode(5);
       // ListNode h3 = new ListNode(-1);
int val =5;
ListNode newValue = new ListNode(val);
        ListNode midVal = new ListNode(val);
        ListNode endVal = new ListNode(val);

        head.next = h1;
        head.prev=null;
        h1.next = h2;
        h1.prev = head;
        h2.next = null;
        h2.prev = h1;


        ListNode temp = head;
        ListNode prev= temp.prev;
int cnt = -1;
        while(temp!=null){
            cnt++;
            prev=temp;
            temp = temp.next;

        }
        prev.next=endVal;
        endVal.prev= temp;
        endVal.next=null;
        temp = head;
        int i = (cnt/2);
        while (i>=0){
           if(i==0){
               temp.prev.next=midVal;
                temp.prev = midVal;
                midVal.next = temp;
           }
            i--;
           temp = temp.next;
        }
      //  System.out.print("count is "+cnt);
        newValue.next = head;
        head.prev=newValue;

        temp=newValue;
        while (temp!=null)
        {
            System.out.print(" "+temp.val+" ");
            temp=temp.next;
        }
    }

}
