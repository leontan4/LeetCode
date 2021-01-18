// Optimal Solution - Time O(nlogn), Space O(1)
// Sorting and Two Pointers
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-1; ++i){
            if(nums[i] == nums[i+1]){
               return true;
            }
        }
        return false;
    }
}

// Brute Force - Time O(n), Space O(n)
// HashMap
class Solution {
    public boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> dict = new HashMap<Integer, Integer>();

        for(int i=0; i<nums.length; i++){
            if(dict.containsKey(nums[i])){
                return true;
            } else{
                dict.put(nums[i], 1);
            }
        }
        
        return false;
    }
}