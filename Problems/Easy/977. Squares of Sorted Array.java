// Optimal Solution - Time O(n), Space O(1)
// Two Pointers
class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] squaredArr = new int[nums.length];
        int left=0, right=nums.length-1, k=right;

        while(left <= right){
            if(Math.abs(nums[left]) > nums[right]){
                squaredArr[k--] = nums[left] * nums[left];
                left++;
            }
            else {
                squaredArr[k--] = nums[right] * nums[right];
                right--;
            }
        }
        return squaredArr;
    }
}

// Brute Force - Time O(nlogn), Space O(1)
// Sorting
class Solution {
    public int[] sortedSquares(int[] arr) {
        for(int i=0; i<arr.length; i++){
            arr[i] = arr[i] * arr[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
