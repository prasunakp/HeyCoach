package linkedlist;

public class SplitLinkedListInParts {
    public static void main(String[] args){
        ListNode head = new ListNode(1);
        ListNode next1 = new ListNode(2);
        ListNode next2 = new ListNode(3);
        ListNode next3 = new ListNode(4);
        ListNode next4= new ListNode(5);
        ListNode next5 = new ListNode(6);
        ListNode next6 = new ListNode(7);
        head.next=next1;
        next1.next=next2;
       // next2.next=next3;
      //  next3.next=next4;
       // next4.next=next5;
        //next5.next=next6;

        int k =5;
        ListNode[] ans = new ListNode[k];
        ListNode dummy = head;
        int size =0;
        while (dummy!=null){
            size++;
            dummy=dummy.next;
        }

        int nodesinEachPart = size/k;
        int extraNodes = size%k;
        int index=0;
        dummy=head;
        while (dummy!=null){
            ListNode eachpart = new ListNode();
            eachpart = dummy;
            ans[index]=eachpart;
            for(int i=1;i<nodesinEachPart;i++){
                eachpart=eachpart.next;
            }
            if(nodesinEachPart>0 && extraNodes>0){
                eachpart=eachpart.next;
                extraNodes--;
            }
            if(eachpart==null || eachpart!=null && eachpart.next==null){
                break;
            }
            dummy= new ListNode(eachpart.next.val,eachpart.next);
            dummy=dummy.next;
            eachpart.next=null;
            index++;
        }
     for(ListNode eachnode : ans){
         System.out.println("each node "+eachnode.val);
     }

    }
}
