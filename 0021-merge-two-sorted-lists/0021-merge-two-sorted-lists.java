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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode outputList = null;
        ListNode outputHead = null;

        if (list1 == null && list2 == null) {
            return null;
        } else if (list1 == null) {
            return list2;
        } else if (list2 == null) {
            return list1;
        } else {

            if (list1.val <= list2.val) {
                outputList = list1;
                list1 = list1.next;
                outputHead = outputList;
            } else if (list2.val < list1.val) {
                outputList = list2;
                list2 = list2.next;
                outputHead = outputList;
            }

            while (list1 != null && list2 != null) {
                if (list1.val <= list2.val) {
                    outputList.next = list1;
                    list1 = list1.next;
                    outputList = outputList.next;
                }
                else {
                    outputList.next = list2;
                    list2 = list2.next;
                    outputList = outputList.next;
                }
            }
            while (list1 != null) {
                outputList.next = list1;
                list1 = list1.next;
                outputList = outputList.next;
            }
            while (list2 != null) {
                outputList.next = list2;
                list2 = list2.next;
                outputList = outputList.next;
            }
        }
        return outputHead;

    }
}