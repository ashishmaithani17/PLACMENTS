package LINKEDLIST.INTRO;

public class lengthofll {
     public static int length(Node head){
          //Your code goes here
  
          Node currnode=head;
          int count = 0;
          while(currnode!=null){
              count++;
              currnode=currnode.next;
          }
          return count;
      }
      public static void main(String[] args) {
          
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
 }