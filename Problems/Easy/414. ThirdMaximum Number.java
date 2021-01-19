//Brute Force
class Solution {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums);
        
        if(nums.length<=2){
            return nums[nums.length-1];
        }
        
        HashMap<Integer, Integer> arr = new HashMap<Integer, Integer>();

        int max = nums[nums.length-1], count = 2;
        arr.put(max, 1);
        for(int i=nums.length-2; i>=0; i--){
            if(arr.containsKey(nums[i])){
                arr.put(nums[i], arr.get(nums[i])+1);
            }
            else{
                arr.put(nums[i], 1);
                count--;
            }

            if(count == 0){
                max = nums[i];
                break;
            }
            
            if(count != 0 && i == 0){
                return max;
            }
        }
        return max;
    }
}