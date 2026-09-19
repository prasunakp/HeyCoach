package linkedlist;

public class AddTwoNumbers {
    public static void main(String[] args){
        ListNode head1 = new ListNode(2);
        ListNode next1 = new ListNode(4);
        ListNode next2 = new ListNode(3);
        ListNode next6 = new ListNode(3);
        ListNode next7 = new ListNode(3);
        ListNode next8 = new ListNode(3);
        ListNode next9 = new ListNode(3);

        ListNode head2 = new ListNode(5);
        ListNode next4 = new ListNode(6);
        ListNode next5 = new ListNode(4);
        head1.next = next1;
        next1.next = next2;
        next2.next=next6;
        next6.next=next7;
        next7.next=next8;

        head2.next = next4;
        next4.next = next5;

        ListNode ans = new ListNode();
        ListNode head = ans;
        int carry =0;
        while (head1!=null && head2!=null){
            int sum = head1.val+ head2.val+carry;
            ans.val = sum<10?sum:sum%10;
            carry = sum/10;
            ans.next=new ListNode();
            ans=ans.next;
            head1=head1.next;
            head2=head2.next;
        }
        while (head1!=null){
            int sum = head1.val+carry;
            sum = sum%10;
            carry = sum/10;
            ans.val=sum;
            ans.next=new ListNode();
            ans=ans.next;
            head1=head1.next;
        }
        while (head2!=null){
            int sum =  head2.val+carry;
            sum = sum%10;
            carry = sum/10;
            ans.val=sum;
            ans.next=new ListNode();
            ans=ans.next;
            head2=head2.next;
        }

        while (head!=null){
            System.out.println("values are "+head.val);
            if(head.next.next==null) {
                head.next = null;
            }
            head=head.next;
        }

    }
}
