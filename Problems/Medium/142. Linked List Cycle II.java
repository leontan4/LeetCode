// Optimal Solution
// Slow & Fast Pointers
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
 
        ListNode slow = head;
        ListNode fast = head;
        
	// Slow and Fast pointer to specific location
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            
            if(slow == fast) {
		
		// Reassign slow to head and recount from there. 
		// The next iteration where 'slow' and 'fast' meet will be the start of the cycle
                slow = head;
                while(slow != fast) {
                    slow = slow.next;
                    fast = fast.next;
                }
                return slow;
            }
        }
        return null;
    }
}
