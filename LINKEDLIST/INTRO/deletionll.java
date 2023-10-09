package LINKEDLIST.INTRO;

public class deletionll {
     static ListNode head, tail; // head and tail of the LinkedList

  static void PrintList() // Function to print the LinkedList
  {
    ListNode curr = head;
    for (; curr != null; curr = curr.next)
      System.out.print(curr.val + "-->");
    System.out.println("null");
  }

  static void InsertatLast(int value) // Function for creating a LinkedList
  {

    ListNode newnode = new ListNode(value);
    if (head == null) {
      head = newnode;
      tail = newnode;
    } else
      tail = tail.next = newnode;
  }

  static void DeleteLast() {
    if (head == null)
      System.out.println("There are no nodes to delete in LinkedList");

    // If there is single node, delete that and make head point to null
    if (head.next == null) {
      head = null;
    } else {

      // step1: Finding First and Second Last Node in LinkedList

      ListNode curr = head, prev = null;
      while (curr.next != null) {
        prev = curr;
        curr = curr.next;
      }

      // Step2 : Pointing prev->next to nullptr

      prev.next = null;

    }
  }

  public static void main(String args[]) {
    InsertatLast(10);
    InsertatLast(20);
    InsertatLast(30);
    InsertatLast(40);
    System.out.println("LinkedList before Deleting Last Node : ");
    PrintList();
    DeleteLast();
    System.out.println("LinkedList after Deleting Lastt Node : ");
    PrintList();
  }
}
class ListNode {

  int val;
  ListNode next;
  ListNode(int x) {
    val = x;
    next = null;
  }
}
