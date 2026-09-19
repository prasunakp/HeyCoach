package linkedlist;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(1);
        ListNode next2 = new ListNode(2);
        head.next=next1;
        next1.next=next2;
        ListNode duplicateHead = head;
        while (duplicateHead!=null && duplicateHead.next!=null){
            ListNode temp = duplicateHead.next;
            while(temp!=null && (temp.val==duplicateHead.val)) {
                duplicateHead.next = temp.next;
                temp=temp.next;
            }
            duplicateHead = temp;
        }
        while (head!=null){
            System.out.println("val "+head.val);
            head= head.next;
        }
    }
}
