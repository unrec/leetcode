/*
https://leetcode.com/problems/add-two-numbers/
#2
*/

package list;

public class AddTwoNumbers {

  public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
    ListNode node = new ListNode(0);
    ListNode current = node;
    int carry = 0;

    while (l1 != null || l2 != null) {
      int x = (l1 != null) ? l1.val : 0;
      int y = (l2 != null) ? l2.val : 0;
      int sum = carry + x + y;
      current.next = new ListNode(sum % 10);
      current = current.next;
      carry = sum / 10;

      if (l1 != null) {
        l1 = l1.next;
      }
      if (l2 != null) {
        l2 = l2.next;
      }
    }
    if (carry > 0) {
      current.next = new ListNode(carry);
    }
    return node.next;
  }

  static class ListNode {

    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
      this.val = val;
    }

    ListNode(int val, ListNode next) {
      this.val = val;
      this.next = next;
    }
  }
}