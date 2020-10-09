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

// Optimal Solution
class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        
        ListNode head = new ListNode(0);
        ListNode pos = head;
        
        if(l1 == null && l2 != null){
            return l2;
            
        } else if(l1 != null && l2 == null){
            return l1;
            
        }
        
        while(l1 != null && l2!= null) {
            if(l1.val <= l2.val){
                pos.next = l1;
                l1 = l1.next;
                
            } 
            else {
                pos.next = l2;
                l2 = l2.next;
            }
            
            pos = pos.next;    
        }
        
        while(l1 != null) {
            pos.next = l1;
            pos = pos.next;
            l1 = l1.next;
        }
        
        while(l2 != null) {
            pos.next = l2;
            pos = pos.next;
            l2 = l2.next;
        }
    
        return head.next;
    }
}