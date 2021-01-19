// Optimal Solution - Time O(log n), Space O(1)
class Solution {
    public int search(int[] nums, int target) {
        int start=0, end=nums.length;
        
        while(start < end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target){
                return mid;
            }
            else if(nums[mid] < target){
                start = mid + 1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }
}