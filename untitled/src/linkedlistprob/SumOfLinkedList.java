package linkedlistprob;

public class SumOfLinkedList {
    public static  void main(String[] args){
        ListNode l1= new ListNode(2);
        ListNode l11= new ListNode(0);
        ListNode l12 = new ListNode(1);
l1.next = l11;
l11.next = l12;
l12.next = null;
        ListNode l2 = new ListNode(1);
        ListNode l21 = new ListNode(9);
        ListNode l22 = new ListNode(9);
        ListNode l23 = new ListNode(9);
        l2.next  = l21;
        l21.next =l22;
        l22.next = l23;
        l23.next = null;

        String s1 = "";
        String s2 ="";
        ListNode temp1 = l1;
        while(temp1!=null){
s1 += temp1.val;
temp1= temp1.next;
        }
temp1=l2;
        while(temp1!=null){
            s2 += temp1.val;
            temp1= temp1.next;
        }
System.out.print("answer is"+(Integer.valueOf(s1)+Integer.valueOf(s2)));
    }
}
