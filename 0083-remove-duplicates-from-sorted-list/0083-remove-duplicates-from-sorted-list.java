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
    public ListNode deleteDuplicates(ListNode head) {

    ListNode temp1 = head;
    ListNode head2 = new ListNode();
    ListNode temp = head2;
    if(head == null) return head;
    head2.val = head.val;
       while(temp1 != null){
           if(temp1.val > temp.val){
               ListNode NewNode = new ListNode(temp1.val);
               temp.next = NewNode;
               temp = NewNode;
           }
           temp1 = temp1.next;
       } 

       return head2;
    }
}