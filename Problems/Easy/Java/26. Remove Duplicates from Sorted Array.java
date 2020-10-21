//Optimal Solution - Cleanr Code
class Solution {
    public int removeDuplicates(int[] nums) {
        
        int j=0;
        
        for (int i=1; i<nums.length; i++){
            if(nums[i]!=nums[j]){
		//NOTE: nums[j++], means after return nums[j], j will increment
	//nums[++j], means j will increment first, then only return nums[j].
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }
}

//Optimal Solution - Time O(n), Space O(1) (Messy Code)
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