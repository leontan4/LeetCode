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
// Using one pointer instead of two pointers
class Solution {
    public boolean isPalindrome(ListNode head) {
        if(head == null) return true;
        
        ListNode ptr = head;
        int size = 0;
        
        while(ptr != null) {
            ptr = ptr.next;
            size++;
        }
        
	// Letting pointer to stop at half of the linked list
        ptr = head;
        size = size/2;
        while(size > 0) {
            ptr = ptr.next;
            size--;
        }
        
        ptr = reverse(ptr);
        while(ptr != null && head != null) {
            if(ptr.val != head.val) return false;
            ptr = ptr.next;
            head = head.next;
        }
        
        return true;
    }
    
    public ListNode reverse(ListNode head) {
        ListNode prev = null;
        ListNode next = head;
        
        while(head != null) {
            next = head.next;
            head.next = prev;
            prev = head;
            head = next;
        }
        
        return prev;
    }
}

//---------------------------------------------------------------------
// Better Solution
class Solution {
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }
        
        fast = head;
        slow = reverseList(slow);
        
        while(slow != null) {
            if(slow.val != fast.val){
                return false;
            }
            
            slow = slow.next;
            fast = fast.next;
        }
        
        return true;
    }
    
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        
        while(head != null){
            ListNode next_node = head.next;
            
            head.next = prev;
            prev = head;
            head = next_node;
        }
        return prev;
    }
}