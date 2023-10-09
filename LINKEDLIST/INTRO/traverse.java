package LINKEDLIST.INTRO;

public class traverse {
     public static Node constructLL(int []arr) {
        // Write your code here
      Node head= new Node(arr[0]);

      Node curr= head;
      for (int i = 1; i < arr.length; i++) {
          Node newNode = new Node(arr[i]);
          curr.next = newNode;
          curr= curr.next;
      }

      return head;
     }
}

 class Node {
     public int data;
     public Node next;

     Node()
     {
         this.data = 0;
         this.next = null;
     }

     Node(int data)
     {
         this.data = data;
         this.next = null;
     }

     Node(int data, Node next)
     {
         this.data = data;
         this.next = next;
     }
 };