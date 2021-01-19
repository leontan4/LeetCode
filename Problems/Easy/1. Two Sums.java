//Optimal Solution - Time and Space O(n)
//HashMap
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int x, y;

        Map<Integer, Integer> calc = new HashMap<>();
        
        for (int i=0; i<nums.length; i++){
            y = nums[i];
            x = target - y;
            
            if(calc.containsKey(x)){
                return new int[] {calc.get(x), i};
            }
            
            else {
                calc.put(y, i);
            }
        }
        
        throw new IllegalArgumentException("No two sum solution");
    
    }
}
