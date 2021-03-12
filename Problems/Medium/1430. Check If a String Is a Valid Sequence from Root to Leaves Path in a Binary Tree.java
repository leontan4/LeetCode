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
// Brute Force - Time O(n), Space O(n)
// Depth First Search + Recursion
class Solution {
    public boolean isValidSequence(TreeNode root, int[] arr){
        if(root == null) return false;
        return valid(root, index, arr);
    }
    
    private boolean valid(TreeNode root, int index, int[] arr){
        if(root.val != arr[index] || index >= arr.length) return false;
        if(root.val == arr[index] && root.left == null && root.right == null) return true;
        return (valid(root.left, index + 1, arr) || valid(root.right, index + 1, arr));
    }
}
