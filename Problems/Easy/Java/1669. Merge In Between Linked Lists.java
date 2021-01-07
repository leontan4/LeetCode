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