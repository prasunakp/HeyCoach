package linkedlist;

public class PartitionList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(1);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4 = new ListNode(2);
        ListNode next5 = new ListNode(6);
        ListNode next6 = new ListNode(7);
        head.next = next1;
      //  next1.next = next2;
       // next2.next = next3;
        //next3.next = next4;
        //next4.next = next5;
        //next5.next = next6;
        int x=0;
        ListNode dummy = head;
ListNode lesser= new ListNode();
ListNode greater = new ListNode();
ListNode prevLesser=lesser;
ListNode lessernext = null;
ListNode greaterLesser=greater;
      while (dummy!=null){
          if(dummy.val<x){
              ListNode n1 = new ListNode();
              n1.val=dummy.val;
              prevLesser.next=n1;
              lessernext=n1;
              prevLesser=prevLesser.next;
          }
          if(dummy.val>=x){
              ListNode n1 = new ListNode();
              n1.val=dummy.val;
              greaterLesser.next=n1;
              greaterLesser=greaterLesser.next;
          }
          dummy=dummy.next;
      }
      lesser=lesser.next;
      greater=greater.next;
if(lessernext!=null)
        lessernext.next=greater;
else
    lesser=greater;
      while (lesser!=null){
          System.out.println("lesser nest "+lesser.val);
          lesser=lesser.next;
      }
    }
}
