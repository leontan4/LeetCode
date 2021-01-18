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

//Optimal Solution - Time O(n), Space O(n)
//Recursion Method
class Solution {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        int max = 1 + Math.max(left, right);
        return max;
    }
}

//Brute Force - Time O(n), Space O(n)
//Breadth First Search (BFS)
class Solution {
    public int maxDepth(TreeNode root) {
        
        if(root == null){
            return 0;
        }
        
        Queue <TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int count=0;
        
        while(!queue.isEmpty()){
            int size = queue.size();

            for(int i=0; i<size; i++){
                TreeNode curr = queue.poll();

                if(curr.left != null){
                    queue.add(curr.left);
                }

                if(curr.right != null){
                    queue.add(curr.right);
                }
            }
            count++;
        }
        return count;
    }
}