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
// Brute Force
// DFS + Reverse Linked List
class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        
        TreeNode left = invertTree(root.right);
        TreeNode right = invertTree(root.left);
        TreeNode curr = root.left;
        root.left = root.right;
        root.right = curr;
        
        return root;
    }
}