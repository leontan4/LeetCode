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
// Optimal Solution - time O(n), Space O(n)
// BFS
class Solution {
    public int minDepth(TreeNode root) {
        if(root == null) return 0;
        Queue <TreeNode> q = new LinkedList<>();
        
        q.offer(root);
        int count = 1;
        
        while(!q.isEmpty()){
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                if(curr.left == null && curr.right == null) return count;
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            count++;
        }
        return count;
    }
}

// Brute Force
// DFS
class Solution {
    public int minDepth(TreeNode root) {
        int min = 0;
        if(root == null) return 0;
        int left = minDepth(root.left);
        int right = minDepth(root.right);
        
        if(left == 0 && right != 0){
            min = 1 + right;
        }
        else if(right == 0 && left != 0){
            min = 1 + left;
        }
        else{
            min = 1 + Math.min(left, right);
        }
        return min;
    }
}