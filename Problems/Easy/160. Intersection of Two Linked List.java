// Shorter way of writing
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
              
        ListNode x = headA, y=headB;
        
        if(x == null || y==null){
            return null;
        }
        
        while(x != y){
            
            x = x == null ? headB : x.next;
            y = y == null ? headA : y.next;
        }
        
        return x;
        
    }
}

// Optimal Solution
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
              
        ListNode x = headA, y=headB;
        
        if(x == null || y==null){
            return null;
        }
        
        while(x != y){
            x = x.next;
            y = y.next;
            
            if(x == y){
                return x;
            }
            
            if(x == null){
                x = headB;
            }
            
            if(y == null){
                y = headA; 
            }
        }
        
        return x;
        
    }
}