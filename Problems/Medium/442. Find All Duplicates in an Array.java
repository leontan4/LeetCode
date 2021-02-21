// Optimal Solution - Time O(n), Space O(1)
// Cyclic Sort
class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List <Integer> list = new ArrayList<>();
        
        int i = 0;
        while(i < nums.length){
            int j = nums[i] - 1;
            
            if(nums[i] != nums[j]){
                swap(nums, i, j);
            }
            else if(i != j && nums[i] == nums[j]){
                i++;
            } 
            else {
                i++;
            }
        }
        
        for(int k=0; k<nums.length; k++){
            if(nums[k] != k+1){
                list.add(nums[k]);
            }
        }
        return list;
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
    public List<Integer> findDuplicates(int[] nums) {
        Map <Integer, Integer> map = new HashMap<>();
        List <Integer> arr = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++){
            if(map.containsKey(nums[i])){
                arr.add(nums[i]);
            }
            else{
                map.put(nums[i], 1);
            }
        }
        return arr;
    }
}
