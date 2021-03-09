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
// Depth First Search + Stack
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> in = new LinkedList<>();
	if(root == null) return in;

        Stack <TreeNode> stack = new Stack<>();
        
        while(root != null || !stack.isEmpty()){
            while(root != null) {
                stack.push(root);
                root = root.left;
            }
            
            root = stack.pop();
            in.add(root.val);
            root = root.right;
        }
        return in;
    }
}

// Optimal Solution - Time O(n), Space O(n)
// Depth First search + Helper function + Recursion
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List <Integer> in = new LinkedList<>();
        helper(root, in);
        return in;
    }
    
    public void helper(TreeNode root, List <Integer> in)  {
        if(root == null) return;
        if(root.left != null) helper(root.left, in);
        in.add(root.val);
        if(root.right != null) helper(root.right, in);
    }
}
