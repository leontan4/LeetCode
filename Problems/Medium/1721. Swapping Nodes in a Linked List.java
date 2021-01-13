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
//Optimal Solution - Time O(n), Space O(1)
//Two Pointer
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode currNode=head, frontNode=null, endNode = null;
        int length = 0;
        
        while(currNode != null){
            length++;
            
            if(endNode != null){
                endNode = endNode.next;
            }
            
            if(length == k){
                frontNode = currNode;
                endNode = head;
            }
            
            currNode = currNode.next;
        }
        
        int temp = frontNode.val;
        frontNode.val = endNode.val;
        endNode.val = temp;
        
        return head;
    }
}

//Brute Force
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