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

//Optimal Solution - checking if 'val' is not EQUAL
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null || head.next == null){
            return head;
        }
           
        ListNode curr = head.next;
        ListNode prev = head;
        
        while(curr != null){
            if(prev.val != curr.val){
                prev.next = curr;
                prev = curr;
            }
            
            if(curr.next == null && prev.val == curr.val){
                prev.next = curr.next;
            }
            
            curr = curr.next;
        }
        return head;
    }
}

//Optimal Solution - checking if 'val' is EQUAL
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null){
            return head;
        }
        
        ListNode current = head, temp = head.next;
        
        while(temp != null){
            
            if(current.val == temp.val){
                current.next = temp.next;
                temp = temp.next;
            } 
            else{
                current = temp;
                temp = temp.next;
            }
        }
        
        return head;
    }
}