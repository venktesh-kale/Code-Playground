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
        ListNode temp = new ListNode(0);
        temp = head;
        ListNode  head2 = null;
        ListNode temp2 = head;
        int count = 0;
        if(head == null || head.next == null) return head;
        while(temp != null){
            temp = temp.next;
            count +=1;
        }
        temp = head;
        while(count >= 0){
            int cnt = count;
            temp = head;
           while(temp.next != null && cnt != 0){
               temp = temp.next;
               cnt--;
           }
           ListNode newnode = new ListNode();
           newnode.val = temp.val;
           if(head2 == null){
               head2 = newnode;
               temp2 = head2;
           } 
           else{
               temp2.next = newnode;
               temp2 = newnode;
           }
            count--; 
        }
        return head2.next;
    }
}