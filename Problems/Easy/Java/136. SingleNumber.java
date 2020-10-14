// Brute Force - Better than Solution 1 - 3 on LeetCode
class Solution {
    public int singleNumber(int[] nums) {
        
        if(nums.length % 2 == 0) {
            return nums[0];
        }
        
        else {
            
            Arrays.sort(nums);

            int test = 0, i = 1;

            while(test < nums.length - 1) {
                if(nums[test] == nums[i]){
                    test += 2;
                    i += 2;
                } else{
                    break;
                }
            }

            return nums[test];
        }
    }
}