// Brute Force Solution - Time O(n), Space O(n)
// HashMap + Sliding Window

class Solution {
    public int totalFruit(int[] tree) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int winStart=0, max=Integer.MIN_VALUE;

        for(int winEnd=0; winEnd<tree.length; winEnd++){
            int temp = tree[winEnd];

            if (map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }
            else {
                map.put(temp, 1);
            }

            while(map.size() > 2){
                map.put(tree[winStart], map.get(tree[winStart])-1);

                if(map.get(tree[winStart]) == 0) {
                    map.remove(tree[winStart]);
                }
                winStart++;
            }
            max = Math.max(max, winEnd - winStart + 1);
        }
        return max;
    }
}
