package linkedlistprob;

import java.util.ArrayList;
import java.util.List;

import static linkedlistprob.MergeSortedLinkedList.mergeTwoLinkedList;

public class MergeKSortedLinkedList {

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

        List<ListNode> nodes = new ArrayList<>();
        nodes.add(head);
        nodes.add(hl);

        ListNode sortedList = head;
        for(int i=1;i< nodes.size();i++){
            sortedList = mergeTwoLinkedList(sortedList, nodes.get(i));
        }
        while (sortedList!=null){
            System.out.print(""+sortedList.val);
            sortedList = sortedList.next;
        }
    }
}
