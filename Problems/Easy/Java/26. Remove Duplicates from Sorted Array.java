//Brute Force Solution - Time O(n), Space O(1)
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0, j = 1, counter = 0;

        while(j < nums.length) {
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];
                j++;
                counter++;
            }
            else{
                j++;
            }
            index = i;
        }
        
        return counter + 1;
    }
}