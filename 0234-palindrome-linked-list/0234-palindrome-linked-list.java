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
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;

        if(head == null || head.next == null) return true;
        while(fast.next != null && fast.next.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverse(slow.next);
        ListNode first = head, second = newHead;
        while(second != null){
            if(first.val != second.val) {
                reverse(newHead);
                return false;
                }
                first = first.next;
                second = second.next;
        }
        reverse(newHead);
        return true;
    }
    ListNode reverse(ListNode head){
        ListNode prev = null, temp = head, front = head.next;
        if(head == null || head.next == null) return head;
        while(temp != null){
            front = temp.next;
            temp.next = prev;
            prev = temp;
            temp = front;
        }
        return prev;
    }
}