package stacks;

import java.util.LinkedList;

public class PalindromeLinkedList {

    public static void main(String[] args){
Node root = new Node(1);
Node one = new Node(2);
Node two = new Node(2);
Node three = new Node(1);

root.next=one;
one.next= two;
two.next=three;

StringBuffer s = new StringBuffer();
while (root!=null){
    s.append(root.val);
    root=root.next;
}
System.out.println("reverse "+s.toString().equalsIgnoreCase(s.reverse().toString()));
    }
}
