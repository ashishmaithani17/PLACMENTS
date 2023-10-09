package LINKEDLIST.INTRO;

public class searchinll {
     public static void main(String[] args) {
          
     }
     public static int searchInLinkedList(Node head, int k)
    {
        int ans=0;
        while(head!=null){
            if(head.data==k){
                ans=1;
                break;
            }
            else{
                head=head.next;
            }
        }   
        return ans;    
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