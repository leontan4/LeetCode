// Optimal Solution - Time O(n), Space O(1)
// Cyclic Sort
class Solution {
    public int findDuplicate(int[] nums) {
        int i=0;
        while(i < nums.length){
            int j=nums[i] - 1;
            if(nums[i] != nums[j]){
                swap(nums, i, j);
            }
            else if(i != j && nums[i] == nums[j]){
                return nums[j];
            }
            else {
                i++;
            }
        }
        return -1;
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Brute Force - Time O(n), Space O(n)
// HashMap
class Solution {
    public int findDuplicate(int[] nums) {
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                return nums[i];
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return 0;
    }
}
