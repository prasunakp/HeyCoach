package linkedlistprob;

public class RotateByKNodes {

    public static  void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode h1 = new ListNode(2);
        ListNode h2 = new ListNode(3);
        ListNode h3 = new ListNode(4);
        ListNode h4 = new ListNode(5);
        int k = 2;
        head.next = h1;
        h1.prev = head;
        h1.next = h2;
        h2.prev = h1;
        h2.next=h3;
        h3.prev=h2;
        h3.next=h4;
        h4.prev=h3;
        h4.next=null;
        while (k>0) {
            ListNode temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.prev.next=null;
            temp.next=head;
            head.prev=temp;
            head=temp;
            k--;
        }
ListNode temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
    }
}
