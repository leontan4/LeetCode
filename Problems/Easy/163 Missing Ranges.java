// Potential Solution
class Solution {
    public List<String> findMissingRanges(int[] nums, int lower, int upper) {
        
        ArrayList<String> newNum = new ArrayList<String>();

        if(nums[i] - lower>1 && i==0){
            newNum.add(Integer.toString(lower) + "->" + Integer.toString(nums[i]-1));
        } else{
            newNum.add(Integer.toString(lower));
        }

        while(i!=j && j<nums.length){
            diff = nums[j] - nums[i];
            if(diff==2){
                newNum.add(Integer.toString(nums[j]-1));
            } else if(diff>2){
                newNum.add(Integer.toString(nums[i]+1) + "->" + Integer.toString(nums[j]-1));
            }

            i++;
            j++;
        }

        if(nums[i] != upper){
            newNum.add(Integer.toString(nums[i]+1) + "->" + Integer.toString(upper));
        }
    }
}