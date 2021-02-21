// Optimal Solution - Time O(n), Space O(1)
// Cyclic Sort
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List <Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0) return result;
        
        int i=0;
        while(i < nums.length){
            int j = nums[i] - 1;
            if(nums[i] != nums[j]){
                swap(nums, i, j);
            }
            else {
                i++;
            }
        }
        
        for(int k=0; k<nums.length; k++){
            if(k != nums[k] - 1){
                result.add(k+1);
            }
        }
        return result;
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

//Brute Force - Time O(n), Space O(n)
// HashMap
class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        Map<Integer, Integer> arr = new HashMap<>();
        List<Integer> missing = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            if(arr.containsKey(nums[i])){
                arr.put(nums[i], arr.get(nums[i])+1);
            }
            arr.put(nums[i], 1);
        }

        for(int i=0; i<nums.length; i++){
            if(!arr.containsKey(i+1)){
                missing.add(i+1);
            }
        }
        
        return missing;
    }
}