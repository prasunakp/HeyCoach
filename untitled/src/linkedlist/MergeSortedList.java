package linkedlist;

public class MergeSortedList {
  public static void main(String[] args){
      ListNode head1 = new ListNode(1);
      ListNode next1 = new ListNode(1);
      ListNode next2 = new ListNode(3);
      ListNode next3 = new ListNode(4);
      ListNode head2 = new ListNode(2);
      ListNode next5 = new ListNode(5);
      ListNode next6 = new ListNode(7);
      head1.next = next1;
      next1.next = next2;
      next2.next = next3;
      //next3.next = next4;
      head2.next = next5;
      next5.next = next6;

      ListNode ans = new ListNode();
      ListNode Dummy = ans;
      while (head1!=null && head2!=null){
          if(head1.val<=head2.val){
              ans.next=head1;
              head1=head1.next;
          }
          else {
              ans.next=head2;
              head2=head2.next;
          }
         ans=ans.next;
      }
      while (head1!=null){
          ans.next=head1;
          head1=head1.next;
          ans=ans.next;
      }
      while (head2!=null){
          ans.next=head2;
          head2=head2.next;
          ans=ans.next;
      }
      ans=Dummy.next;
      while (ans!=null){
          System.out.println(" value"+ans.val);
          ans=ans.next;
      }
  }
}
