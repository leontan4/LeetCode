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
//Better Code Implementation
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null){
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = head.next;
                
        while(even != null && even.next != null){
            odd.next = even.next;
            odd = even.next;
            even.next = odd.next;
            even = odd.next;
        }
        odd.next = curr;
        return head;
    }
}

//Brute Force - Time O(n), Space O(1)
class Solution {
    public ListNode oddEvenList(ListNode head) {
        
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        
        ListNode odd = head;
        ListNode even = head.next;
        ListNode curr = head;
        ListNode even_s = even;
        
        int count = 1;
        
        while(curr.next!=null){
            if(count % 2 == 0){
                even.next = odd.next;
                curr = odd;
                even = curr.next;
            } 
            else {
                odd.next = even.next;
                curr = even;
                odd = curr.next;
            }
            curr = curr.next;
            count++;
        }
        even.next = null;
        odd.next = even_s;
        return head;
    }
}