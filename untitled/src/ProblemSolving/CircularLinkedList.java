package ProblemSolving;

import java.util.Calendar;

public class CircularLinkedList {

    public static void main(String[] args){
       Node n4 = new Node(5);
       Node n3 = new Node(4);
       n3.next = n4;
       Node n2 = new Node(3);
       n2.next = n3;
       Node n1 = new Node(2);
       n1.next =n2;
       Node n0 = new Node(1);
       n0.next=n1;
       n4.next = n0;

       Node head = n0;
Node[] nodesArray = new Node[2];
boolean foundEnd = false;
int size = 1;
while(!foundEnd){
   if(head.next == n0){
      foundEnd = true;
   }
   else{
      size++;
      head = head.next;
   }
}
System.out.print("size is "+size);

head = n0;
for(int i=0; i<size;i++){
nodesArray[i] = head;
nodesArray[i+1]= head.next;
head=nodesArray[i+1].next;
nodesArray[i].next = head;
}
    }
}
