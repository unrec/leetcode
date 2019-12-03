/*
https://leetcode.com/problems/merge-two-sorted-lists
#21
*/

class mergeTwoSortedLists {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode output = new ListNode(0);
        ListNode node = output;

        while (true) {
            if (l1 == null) {
                node.next = l2;
                break;
            }
            if (l2 == null) {
                node.next = l1;
                break;
            }

            if (l1.val == l2.val) {
                node.next = new ListNode(l1.val);
                node.next.next = new ListNode(l1.val);
                l1 = l1.next;
                l2 = l2.next;

            } else if (l1.val < l2.val) {
                node.next = new ListNode(l1.val);
                l1 = l1.next;

            } else {
                node.next = new ListNode(l2.val);
                l2 = l2.next;
            }

            if (node.next.next != null) {
                node = node.next.next;
            } else {
                node = node.next;
            }
        }
        return output.next;
    }
}