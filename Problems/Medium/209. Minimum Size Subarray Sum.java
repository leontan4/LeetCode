// Optimal Solution - Time O(n), Space O(n)
// Sliding Window
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE, winStart = 0, sum = 0;
        
        for(int winEnd = 0; winEnd < nums.length; winEnd++){
            sum += nums[winEnd];
            
            while(sum >= target && winStart <= winEnd){
                min = Math.min(min, winEnd - winStart + 1);
                sum -= nums[winStart++];
            }
            if(winEnd - winStart == nums.length - 1 && sum < target) return 0;
        }
        return min;
    }
}
