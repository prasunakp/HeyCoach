package linkedlist;

public class RemoveNthNodeFromList {
    public static void main(String[] args){
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
        int n=2;
        int size=0;
        ListNode dummy = head;
        while (dummy!=null){
            size++;
            dummy=dummy.next;
        }
        ListNode prev = new ListNode();
         dummy = head;
         prev.next=head;
        while (dummy!=null){
            if(size==n){
                prev.next=dummy.next;
                dummy=dummy.next;
            }
            else{
                prev=dummy;
                dummy=dummy.next;
            }
            size--;
        }
dummy=head;
        while (dummy!=null){
            System.out.println("values arew "+dummy.val);
            dummy=dummy.next;
        }

    }
}
