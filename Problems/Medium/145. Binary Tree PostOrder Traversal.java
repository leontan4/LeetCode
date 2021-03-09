/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
// Optimal Solution - Time O(n), Space O(n)
// Depth First Search + Stack + Two Pointers (One Stack)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> post = new LinkedList<>();
        if(root == null) return post;
        
        Stack <TreeNode> stack = new Stack<>();
        TreeNode curr = root, prev = null;
        
        while(!stack.isEmpty() || curr != null){
            
            // Keep on iterating towards the leftmost node
            while(curr != null){
                stack.push(curr);
                curr = curr.left;
            }
            
            // If there is no right child
            // or right child is the one that we recently visited
            // it means we have traversed all the nodes of stack.peek()
            if(stack.peek().right == null || stack.peek().right == prev){
                
                // we will update the prev node
                prev = stack.pop();
                post.add(prev.val);
            } else{
                
                // Otherwise there is a right child and
                // we will visit the right child
                curr = stack.peek().right;
            }
        }
        
        return post;
    }
}

// Optimal Solution - Time O(n), Space O(n)
// Depth First Search + Stack (Two Stacks)
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> post = new LinkedList<>();
        if(root == null) return post;
        
        Stack <TreeNode> s1 = new Stack<>();
        Stack <TreeNode> s2 = new Stack<>();
        s1.push(root);
        
        // Once it is empty, it means that we have transferred
        // all nodes to s2 in postorder
        while(!s1.isEmpty()){
            root = s1.pop();            
            s2.push(root);

            if(root.left != null) s1.push(root.left);
            if(root.right != null) s1.push(root.right);
        }
        
        while(!s2.isEmpty()){
            post.add(s2.pop().val);
        }
        
        return post;
    }
}

// Optimal Solution - TimeO(n), Space O(n)
// Depth First Search + Helper Function + Recursion
class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        List <Integer> post = new LinkedList<>();
        helper(root, post);
        return post;
    }
    
    public void helper(TreeNode root, List <Integer> post){
        if(root == null) return;
        if(root.left != null) helper(root.left, post);
        if(root.right != null) helper(root.right, post);
        post.add(root.val);
    }
}
