package linkedlist;

public class OddEvenLinkedList {
    //soplit the list in two one for odd and oine for even
    //and make odd.next=even .head
    public static void main(String[] args){
        ListNode head = new ListNode(0);
        ListNode next1 = new ListNode(1);
        ListNode next2 = new ListNode(2);
        ListNode next3 = new ListNode(3);
        ListNode next4 = new ListNode(5);
      ListNode next5 = new ListNode(6);
    ListNode next6 = new ListNode(7);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        //next3.next = next4;
    // next4.next = next5;
   //  next5.next = next6;
        ListNode dummy = head;
int size=0;
while(dummy!=null){
    dummy=dummy.next;
    size++;
}

ListNode oddpointer =head;
ListNode evenpointer = head.next;
ListNode even = evenpointer;
boolean evenNUmber = size%2==0?true:false;
while (evenNUmber?(size-1)/2>0:(size-1)/2>0){
    if(oddpointer!=null && oddpointer.next!=null) {
        ListNode temp = oddpointer.next.next;
        if(temp==null){
            oddpointer.next=null;
            break;
        }
        oddpointer.next = temp;
        oddpointer=temp;
    }
    if(evenpointer!=null && evenpointer.next!=null) {
        ListNode temp2 = evenpointer.next.next;
        evenpointer.next = temp2;
        evenpointer=temp2;
    }
  size--;
}
oddpointer.next=even;
while (head!=null){
    System.out.println("values are "+head.val);
    head=head.next;
}

//even number (size-1)/2>1
        //oddnumber (size-1)/2>0
    }
}
