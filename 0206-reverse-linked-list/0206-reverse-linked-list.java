/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        if (head == null) {
            return null;
        }
        if (head.next == null) {
            return head;
        }

        ListNode next = head.next;
        ListNode prev = head;

        head = next;
        next = head.next;
        head.next = prev;
        prev.next = null;
        prev = head;

        while (next != null) {
            head = next;
            next = head.next;
            head.next = prev;
            prev = head;
        }

        return head;
    }
}