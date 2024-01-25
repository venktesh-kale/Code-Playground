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
        
        ListNode list3 = new ListNode(0);
        ListNode temp = list3;
        temp = list3;
        if(list1 == null && list2 == null) return list1;
        while(list1 != null && list2 != null){
            if(list1.val <= list2.val){
                ListNode newnode = new ListNode();
                newnode.val = list1.val;
                list1 = list1.next;
                if(list3 == null){
                    list3 = newnode;
                    temp = list3;
                }
                else{
                    temp.next = newnode;
                    temp = newnode;
                }
                
            }
            else{
                ListNode newnode = new ListNode();
                newnode.val = list2.val;
                list2 = list2.next;
               if(list3 == null){
                    list3 = newnode;
                    temp = list3;
                }
                else{
                    temp.next = newnode;
                    temp = newnode;
                }
            }
        }
        if(list1 == null){
            while(list2 != null){
                ListNode newnode = new ListNode();
                newnode.val = list2.val;
                list2 = list2.next;
                temp.next = newnode;
                temp = newnode;
            }
        }
        else{
             while(list1 != null){
                ListNode newnode = new ListNode();
                newnode.val = list1.val;
                list1 = list1.next;
                temp.next = newnode;
                temp = newnode;
            }
        }
        list3 = list3.next;
        return list3;
    }
}