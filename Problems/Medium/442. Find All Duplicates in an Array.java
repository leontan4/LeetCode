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
