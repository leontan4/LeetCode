//Brute Force
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
    public ListNode swapNodes(ListNode head, int k) {
        if(head.next == null){
            return head;
        }
        
        int count = 1, backVal=0, frontVal=0;
        ListNode curr = head;
        
        while(curr != null){
            if(count == k){
                frontVal = curr.val;
            }
            curr = curr.next;
            count++;
        }
        
        int backCount = count-k;
        count = 1;
        curr = head;
        
        while(curr != null){
            if(count == backCount){
                backVal = curr.val;
                curr.val = frontVal;
            }
            curr =curr.next;
            count++;
        }
        
        count =1;
        curr=head;
        while(curr != null){
            if(count == k){
                curr.val = backVal;
            }
            curr=curr.next;
            count++;
        }
        return head;
    }
}