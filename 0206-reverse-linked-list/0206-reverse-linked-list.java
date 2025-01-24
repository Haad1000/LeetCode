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
        ListNode newList = new ListNode();
        int len = 0;
        if (head == null) {
            return null;
        }
        else if (head.next == null) {
            return head;
        }
        else {
            ListNode tempListNode = head;
            while (tempListNode.next != null) {
                tempListNode = tempListNode.next;
                len++;
            }
            ListNode tail = tempListNode;

            ListNode newHead = tail;
            ListNode newTail = head;
            ListNode tempNodeStop = tail;
            ListNode tempNode = head;
            // for [1,2] if i <= len it means it will loop twice, else once.
            for (int i = 0; i < len; i++) {
                while (tempNode.next != tempNodeStop && tempNodeStop != head.next) {
                    tempNode = tempNode.next;
                }
                tempNode.next = null;
                tempNodeStop.next = tempNode;
                tempNodeStop = tempNodeStop.next;
                tempNode = head;
            }
            return newHead;

        }
    }
}