package linkedlist;

public class DeleteTheMiddleNodeOfaLinkedList {
    public static void main (String[] args){
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
       ListNode dummy = head;
       int size=0;
       while (dummy!=null){
           size++;
           dummy=dummy.next;
       }
        int cnt = size/2+1;
       dummy=head;
       ListNode prev = dummy;
        while(cnt>1){
            prev=dummy;
            dummy=dummy.next;
            cnt--;
        }
        if(dummy==null){
            prev.next=null;
        }
        else {
            prev.next = dummy.next;
        }
        dummy=head;
      while (dummy!=null){
          System.out.println("value are "+dummy.val);
          dummy=dummy.next;
      }

    }
}
