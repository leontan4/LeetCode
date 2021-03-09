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
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> pre = new LinkedList<>();
        if(root == null) return pre;
        
        Stack <TreeNode> stack = new Stack<>();
        
        while(root != null || !stack.isEmpty()){
            while(root != null){
                stack.push(root);
                pre.add(root.val);
                root = root.left;
            }
            
            root = stack.pop();
            root = root.right;
        }
        return pre;
    }
}

// Optimal Solution - Time O(n), Space O(n)
// Depth First Search + Helper Function + Recursion
class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List <Integer> pre = new LinkedList<>();
        helper(root, pre);
        return pre;
    }
    
    public void helper(TreeNode root, List<Integer> pre){
        if(root == null) return;
        pre.add(root.val);
        
        if(root.left != null) helper(root.left, pre);
        if(root.right != null) helper(root.right, pre);
    }
}
