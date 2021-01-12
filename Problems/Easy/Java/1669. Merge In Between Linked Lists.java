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
//Optimal Solution Time O(n), Space O(1)
// For Loops + Two Pointers (Leaving the pointers at given position when conditions met)
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode node_a = list1;
        ListNode node_b = list1;
        
        for(int i=0; i<a-1; i++){
            node_a = node_a.next;
        }
        
        for(int i=0; i<b+1; i++){
            node_b = node_b.next;
        }
        
        node_a.next = list2;
        while(list2.next != null){
            list2 = list2.next;
        }
        
        list2.next = node_b;
        
        return list1;
    }
}

//Brute Force
class Solution {
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode prev = list1;
        ListNode curr = list1.next;
        int count1=0;
        int count2=1;
        
        while(prev.next != null){
            if(count1+1 == a){
                prev.next = list2;
                break;
            }
            count1++;
            count2++;
            prev = prev.next;
            curr = curr.next;
        }
        
        while(curr.next != null){
            if(count2 == b){
                while(prev.next!=null){
                    prev = prev.next;
                }
                prev.next = curr.next;
                break;
            }
            count2++;
            curr=curr.next;
        }
        return list1;
    }
}