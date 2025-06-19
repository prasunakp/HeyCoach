package linkedlistprob;

public class MiddleOfLinkedList {

    public static void main(String[] args){
ListNode head = new ListNode(1);
ListNode h1 = new ListNode(2);
ListNode h2 = new ListNode(3);
ListNode h3 = new ListNode(4);
ListNode h4 = new ListNode(5);
head.next = h1;
h1.next = h2;
h2.next = h3;
h3.next = h4;
h4.next = null;

ListNode current = head;
ListNode prev = null;
ListNode temp = null;
while(current!=null){
    ListNode nextTemp = current.next; // Store next node
    current.next = prev; // Reverse current node's pointer
    prev = current; // Move prev to current
    current = nextTemp;
}
temp=prev;
while (temp!=null){
    System.out.print(temp.val);
    temp = temp.next;
}

    }
}
