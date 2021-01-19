//Brute Force - Time o(n), Space O(n)
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