// Optimal Solution - Boyer-Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int pos = nums[0], counter = 1;
        
        for (int i=1; i<nums.length; i++){
            if(counter == 0){
                pos = nums[i];
            }
            
            if(nums[i] == pos){
                counter++;
            }
            else{
                counter--;
            }
        }
        
        return pos;
    }
}