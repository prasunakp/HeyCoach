package linkedlist;
//https://www.youtube.com/watch?v=eFPFwwojxGU
public class RemoveDuplicatesfromSortedListTwo {

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
       ListNode next2 = new ListNode(3);
    ListNode next3 = new ListNode(3);
       ListNode next4= new ListNode(4);
       ListNode next5 = new ListNode(4);
        ListNode next6 = new ListNode(5);
        head.next=next1;
        next1.next=next2;
      next2.next=next3;
     next3.next=next4;
       next4.next=next5;
        next5.next=next6;
ListNode dummy = new ListNode(0);
dummy.next = head;
ListNode prev = dummy;
ListNode current = head;
while (current!=null){
  if(current.next!=null && current.val==current.next.val){
        while (current.next!=null && current.val==current.next.val){
current=current.next;
        }
        prev.next=current.next;
  }
  else{
      prev=current;
  }
    current=current.next;
}
while(dummy.next!=null){
    System.out.println("value is "+dummy.next.val);
    dummy=dummy.next;
}

    }
}
