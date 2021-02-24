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

// Brute Force
// Two Pointers (Reverse Linked List)
class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head.next == null) return head;
        int count = 0;
        
        ListNode curr = head;
        while(curr!= null){
            curr=curr.next;
            count++;
        }
        
        int left = 0, right = k;
        
        ListNode prev = new ListNode(0);
        prev.next = head;
        curr = prev;

        ListNode start = prev.next;
        ListNode end = start.next;
        
        while(right <= count && end != null){
            for(int i=left+1; i<right; i++){
                start.next = end.next;
                end.next = prev.next;
                prev.next = end;
                end = start.next;
            }
            
            if(end == null){
                break;
            }
            
            prev = start;
            start = end;
            end = end.next;
            left = right;
            right += k;
        }
        return curr.next;
    }
}
