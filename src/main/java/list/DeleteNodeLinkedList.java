/*
https://leetcode.com/problems/delete-node-in-a-linked-list
#237
*/

package list;

public class DeleteNodeLinkedList {

  public void deleteNode(ListNode node) {
    node.val = node.next.val;
    node.next = node.next.next;
  }

  static class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
      val = x;
    }
  }
}
