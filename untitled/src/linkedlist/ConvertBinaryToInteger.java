package linkedlist;

import java.util.Map;

public class ConvertBinaryToInteger {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(0);
        ListNode next2 = new ListNode(1);
        head.next = next1;
        next1.next = next2;

        int size=0;
        ListNode dummy = head;
        while (dummy!=null){
            size++;
            dummy=dummy.next;
        }
size= (int) Math.pow(2,size-1);
        int ans =0;
        dummy=head;
        while (dummy!=null){
            ans += dummy.val*size;
          size=size/2;
          dummy=dummy.next;
        }
System.out.println("ans is "+ans);
    }
}
