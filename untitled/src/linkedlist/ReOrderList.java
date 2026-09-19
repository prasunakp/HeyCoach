package linkedlist;

public class ReOrderList {
    int n=2;
    //divide the list in to two parts
    // reverse the second part
    //merge first part and second part.
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
      //next3.next = next4;
       //next4.next = next5;
       //next5.next = next6;
        ListNode dummy = head;
ListNode newHead = populateLinkedList(dummy);
     ListNode reverseList = reverseLinkedList(newHead);
ListNode dummyreverse = reverseList;
 dummy=head;
while (dummyreverse!=null){
    ListNode temp = dummy.next;
    ListNode temp1= dummyreverse.next;
    dummy.next=dummyreverse;
    dummyreverse.next=temp;
    dummy=temp;
    dummyreverse=temp1;
}
//dummy.next=null;
while (head!=null){
    System.out.println(""+head.val);
    head=head.next;
}

    }

    private static ListNode populateLinkedList(ListNode head) {
        ListNode slowpointer = head;
        ListNode fastpointer = head.next;
        head=head.next;
        while (head!=null){
            slowpointer=head;
            if(fastpointer.next!=null)
            fastpointer=fastpointer.next.next;
            else
                fastpointer = fastpointer.next;
            if(fastpointer==null) {
                ListNode temp1= slowpointer.next;
                slowpointer.next=null;
                return temp1;
            }
            head = head.next;
        }
        return slowpointer.next;
    }

    private static ListNode reverseLinkedList(ListNode head1) {
        ListNode prev = new ListNode();
        prev.next=head1;
        ListNode current = head1;
        while (current!=null){
ListNode next = current.next;
current.next=prev;
prev=current;
current=next;
        }
       head1.next=null;
        return prev;
    }
}
