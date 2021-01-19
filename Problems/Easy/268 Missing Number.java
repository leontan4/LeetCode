//Brute Force
//Solution 1 - Arrays.sort()
class Solution {
    public int missingNumber(int[] nums) {
        int count = 0;
        Arrays.sort(nums);
        
        for(int i=0; i<nums.length; i++){
            if(count != nums[i]){
                break;
            }
            
            count++;
        }
        return count;
    }
}

//Solution 2- "bucket" method
class Solution {
    public int missingNumber(int[] nums) {
        int[] res = new int[100001];
        int count = 0;
        
        for(int i=0; i<nums.length; i++){
            res[nums[i]]++;
        }
        
        for(int i=0; i<nums.length; i++){
            
            if(res[i] == 0){
                break;
            }
            count += 1;
        }
        
        return count;
    }
}