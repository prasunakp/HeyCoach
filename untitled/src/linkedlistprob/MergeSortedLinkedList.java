package linkedlistprob;

public class MergeSortedLinkedList {

    public static void main(String[] args){

        ListNode head = new ListNode(1);
        ListNode h1 =  new ListNode(2);
        ListNode h2 = new ListNode(4);
        head.next = h1;
        h1.next = h2;

        ListNode hl = new ListNode(1);
        ListNode h11= new ListNode(3);
        ListNode h12= new ListNode(4);

        hl.next = h11;
        h11.next = h12;
        ListNode mergedhead = mergeTwoLinkedList(head,hl);
        while (mergedhead!=null){
            System.out.print(""+mergedhead.val);
            mergedhead = mergedhead.next;
        }

    }

    public static ListNode mergeTwoLinkedList(ListNode head, ListNode hl) {
     ListNode dummy = new ListNode(0);
     ListNode curr = dummy;
     while (head!=null && hl!=null){
         if(head.val<hl.val){
             curr.next = head;
             head = head.next;

         }
         else{
             curr.next = hl;
             hl = hl.next;
         }
         curr = curr.next;

     }
        curr.next =  head!=null ? head:hl;
     return dummy.next;
    }
}
