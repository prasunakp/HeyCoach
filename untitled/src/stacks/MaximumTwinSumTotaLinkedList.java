package stacks;

import linkedlistprob.ListNode;

import java.util.ArrayList;

public class MaximumTwinSumTotaLinkedList {
    public static void main(String[] args){

Node n = new Node(4);
Node n1 = new Node(2);
Node n2 = new Node(2);
Node n3 = new Node(3);
n.next=n1;
n1.next=n2;
n2.next=n3;
Node head = n;
        ArrayList<Integer> ans = new ArrayList<>();
while (head!=null){
    ans.add(head.val);
    head=head.next;
}
int maxSum=0;
for(int i=0;i<ans.size();i++){
    if((ans.get(i)+ans.get(ans.size()-1-i))>maxSum)
        maxSum=ans.get(i)+ans.get(ans.size()-1-i);
}
System.out.println("ans is "+maxSum);

    }
}
