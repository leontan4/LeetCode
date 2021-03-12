// Brute Force - Time O(n), Space O(1)
// Sliding Window
class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double max = Integer.MIN_VALUE;
        if(nums.length <= 1) return nums[0];
        
        int winStart = 0;
        double sum = 0;
        for(int winEnd = 0; winEnd < nums.length; winEnd++){
            sum += nums[winEnd];
            
            if(winEnd >= k - 1){
                max = Math.max(max, sum/k);
                sum -= nums[winStart];
                winStart++;
            }
        }
        return max;
    }
}
