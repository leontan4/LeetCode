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
// Depth First Search + Recursion
class Solution {
    public int sumNumbers(TreeNode root) {
        return allSums(root, 0);
    }
    
    private int allSums(TreeNode root, int sum){
        if(root == null) return 0;
        sum = (sum * 10) + root.val;
        
        if(root.left == null && root.right == null) return sum;
        int left = allSums(root.left, sum);
        int right = allSums(root.right, sum);
        
        return left + right;
    }
}
