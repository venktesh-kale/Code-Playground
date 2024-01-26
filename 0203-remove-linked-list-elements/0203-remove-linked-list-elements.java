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
    public ListNode removeElements(ListNode head, int val) {
        ListNode head1 = new ListNode(0);
        ListNode temp = head1;
        if(head1 == null && head.val != val) {
            head1.val = head.val;
            head = head.next;
            temp = head1;
        }
        if(head == null) return head;
        while(head != null){
            if(head.val != val){
                ListNode newnode = new ListNode(head.val);
                temp.next = newnode;
                temp = newnode;
            }
            head = head.next;
        }
           
        return head1.next;
    }
}