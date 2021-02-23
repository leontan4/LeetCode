// Brute Force
// Fast & Slow Pointers
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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        
        if(head.next == null){
            return head;
        }
        
        ListNode slow = head;
        ListNode fast = head;
        ListNode curr = head;
        
        while(left < right){
            while(left > 1){
                slow = slow.next;
                left--;
            }
        
            while(right > 1){
                fast = fast.next;
                right--;
            }
            
            reverse(slow, fast);
            
            while(slow != head && curr.next != slow){
                curr=curr.next;
            }
            
            if(slow != head){
                curr.next = fast;
                return head;
            }
            else {
                return fast;
            }    
        }
        
        return head;
    }
    
    public ListNode reverse(ListNode head, ListNode fast){
        ListNode prev = fast.next;
        ListNode curr = head;
        
        while(curr != head.next){
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}