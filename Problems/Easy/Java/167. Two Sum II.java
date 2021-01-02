//Optimal Solution - Two Pointers
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        int i=0, j=nums.length-1;
        
        while(nums[i] + nums[j] != target){
            if(nums[i]+nums[j] > target){
                j--;
            } 
            else{
                i++;
            }
        }
        
        return new int[] {i+1, j+1};
    
    }
}

//Brute Force Solution
class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        Map<Integer, Integer> map = new HashMap<>();
        int[] pos = new int[2];
        
        for(int i=0; i<nums.length; i++) {
            int x = target - nums[i];
            
            if(map.containsKey(x)){
                pos[0] = map.get(x)+1;
                pos[1] = i+1;
                return pos;
            }
            
            map.put(nums[i], i);
        }
        return pos;
    }
}