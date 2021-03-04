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
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        
        List<List<Integer>> outer = new LinkedList<>();
        if(root == null) return outer;
        
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        int count = 0;

        while(!q.isEmpty()){
            int size = q.size();
            List<Integer> inner = new ArrayList<>();
            
            for(int i=0; i<size; i++){
                TreeNode curr = q.poll();    
                
                if(count % 2 != 0){
                    inner.add(0, curr.val);
                } else{
                    inner.add(curr.val);
                }
                
                if(curr.left != null) q.add(curr.left);
                if(curr.right != null) q.add(curr.right);
            }
            
            outer.add(inner);
            count++;
        }
        return outer;
    }
}
