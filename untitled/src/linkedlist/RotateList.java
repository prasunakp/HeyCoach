package linkedlist;

public class RotateList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
       // ListNode next4= new ListNode(4);
       // ListNode next5 = new ListNode(4);
       // ListNode next6 = new ListNode(5);
        head.next=next1;
        next1.next=next2;
        next2.next=next3;
       // next3.next=next4;
       // next4.next=next5;
        //next5.next=next6;
int k=2;
        ListNode dummy = head;
        ListNode prev = dummy;
for(int i=0;i<k;i++) {
    while (dummy.next != null) {
        prev = dummy;
        dummy = dummy.next;
    }
    dummy.next = head;
    prev.next = null;
    prev=dummy;
    head=dummy;
}
       while (dummy!=null) {
           System.out.println("val is " + dummy.val);
           dummy = dummy.next;
       }

    }
}
