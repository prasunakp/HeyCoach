package linkedlist;

public class RemoveLinkedListElements {
    public static void main(String[] args){
        ListNode head = new ListNode(3);
        ListNode next1 = new ListNode(3);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(3);
        ListNode next4= new ListNode(4);
        ListNode next5 = new ListNode(4);
        ListNode next6 = new ListNode(3);
        head.next=next1;
        next1.next=next2;
        next2.next=next3;
        next3.next=next4;
        next4.next=next5;
        next5.next=next6;
        int val =3;
        ListNode dummy = head;
        ListNode prev=new ListNode();
        prev.next=dummy;
        while (dummy!=null){
            if(dummy.val==val){
                if(dummy==head)
                    head=dummy.next;
                prev.next=dummy.next;
                dummy=dummy.next;
            }
            else{
                prev=dummy;
                dummy=dummy.next;
            }
        }

        ListNode dummy1=head;
        while (dummy1!=null){
            System.out.println("values are "+dummy1.val);
            dummy1=dummy1.next;
        }
    }
}
