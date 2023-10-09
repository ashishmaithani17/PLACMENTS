package LINKEDLIST.MEDIUM;

public class middle {
     public Node middleNode(Node head) {
          Node slow = head, fast = head;
          while (fast != null && fast.next != null) {
              slow = slow.next;
              fast = fast.next.next;
          }
          return slow;
      }
}
public class Node {
    int val;
      Node next;
      Node() {}
      Node(int val) { this.val = val; }
      Node(int val, Node next) { this.val = val; this.next = next; }
  }