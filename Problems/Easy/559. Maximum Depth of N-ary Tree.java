/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};
*/

// Brute Force
class Solution {
    public int maxDepth(Node root) {
        if(root == null) return 0;
        
        Queue <Node> q = new LinkedList<>();
        int count=0;
        
        q.offer(root);
        
        while(!q.isEmpty()) {
            int size = q.size();
            
            for(int i=0; i<size; i++){
                Node curr = q.poll();
                
                for(Node child : curr.children){
                    q.add(child);
                }
            }
            count++;
        }
        return count;
    }
}
