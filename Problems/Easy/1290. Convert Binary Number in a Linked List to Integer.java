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
// Optimal Solution - Time O(n), Space O(1)
// Counting first and then loop through LinkedList
class Solution {
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        
        int num = 0, count = 0;
        
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        
        while(head != null){
            num += head.val * ((int) Math.pow(2, count));
            head = head.next;
            count--;
        }
        return num;
    }
}
