package linkedlist;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(5);
        ListNode next5 = new ListNode(6);
        ListNode next6 = new ListNode(7);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        next3.next = next4;
        next4.next = next5;
        next5.next = next6;
        ListNode prev = head;
        ListNode current = prev.next;
//make sure you have three pointers prev current and next
      while (current!=null){
     ListNode next = current.next;
          current.next=prev;
          prev=current;
          current=next;
      }
          head.next=null;
        while (prev!=null){
           System.out.println("value  are "+prev.val);
                 prev=prev.next;
       }
    }


}
