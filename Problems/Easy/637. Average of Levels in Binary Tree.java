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
// Breadth First Search + Queue
class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List <Double> average = new ArrayList<>();
        
        Queue <TreeNode> q = new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            double count = 0;
            int size = q.size();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();
                count += curr.val;
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            average.add(count / size);
        }
        return average;
    }
}
