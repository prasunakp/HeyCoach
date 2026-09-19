package linkedlist;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class SortList {
    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        ListNode next1 = new ListNode(5);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(1);
        // ListNode next4= new ListNode(7);
        //ListNode next5 = new ListNode(4);
        //ListNode next6 = new ListNode(5);
        head.next = next1;
        next1.next = next2;
        next2.next = next3;
        // next3.next=next4;
        //next4.next=next5;
        //next5.next=next6;

        int size=0;
        ListNode dummy = head;
        while (dummy!=null){
            size++;
            dummy=dummy.next;
        }
        dummy=head;

        int[] arr = new int[size];
        for(int i=0;i<size;i++){
            arr[i]= dummy.val;
            dummy=dummy.next;
        }
        for(int i=0;i<size;i++){
            for(int j=i;j<size;j++){
                if(arr[i]>arr[j]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }

        dummy=head;
        for(int i=0;i<size;i++){
            dummy.val=arr[i];
            dummy=dummy.next;
        }

    }


}
