//Optimal Solution (Insertion method)
class Solution {
    public void moveZeroes(int[] nums) {
        
        if (nums == null || nums.length == 0) return;  
        
        int pos = 0;
        for (int i=0; i<nums.length; i++){
            
            // pos only will increase if nums[i] is 0
            // [0, 1, 0, 3, 12] --> i = 1, nums[i] = 1, pos = 0
            // will become like this [1, 1, 0, 3, 12] and after this, pos will add by 1. 
            if(nums[i] != 0){
                nums[pos++] = nums[i]; 
            }
        }
        
        // after moving all non-zeroes to the front,  
        // all the rest starting after last non-integer, will be filled with 0's
        while (pos < nums.length){
            nums[pos++] = 0;
        }
    }
}

//Optimal Solution (Two pointers but with better implementation)
//This solution same with Question 27. Remove Elements
class Solution {
    public void moveZeroes(int[] nums) {
        
        for (int i=0, j=0; i<nums.length && j<nums.length; j++){
            if(nums[j] != 0){
                int temp = nums[i];

		// Increment after implementation
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
    }
}

//Brute Force
class Solution {
    public void moveZeroes(int[] nums) {
        int i = 0, j = 1, temp;
        
        while(j < nums.length){
            if(nums[i]==0 && nums[j] != 0){
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                
                j++;
                i++;
            } else if(nums[i]!=0 && nums[j] == 0){
                j++;
                i++;
                
            } else if(nums[i] != 0 && nums[j] != 0){
                i++;
                j++;
                
            }
            else {
                j++;
            }
        }
    }
}