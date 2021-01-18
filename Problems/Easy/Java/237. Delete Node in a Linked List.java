// Optimal Solution - Time O(1); Space O(1)
// Note: Always O(1) for time when add and remove; O(n) for searching

class Solution {
    public void deleteNode(ListNode node) {
        
        node.val = node.next.val;
        node.next = node.next.next;
        
    }
}

// Full code to write LinkedList
public class Node {
	Node next;
	int data;
	
	public Node(int data) {
		this.data = data;
	}
}

public class LinkedList {
	Node head;
}