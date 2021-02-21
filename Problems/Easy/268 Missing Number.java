// Optimal Solution - Time O(n), Space O(1)
// Gauss' Method (Math)
class Solution {
    public int missingNumber(int[] nums) {        
        int elemSum=0, indexSum=nums.length;;
        for(int i=0; i<nums.length; i++){
            elemSum += nums[i];
            indexSum += i;
        }
        return indexSum - elemSum;
    }
}

// Optimal Solution - Time O(n), Space O(1)
// Bit Manipulation
class Solution {
    public int missingNumber(int[] nums) {        
        int missing=nums.length;
        for(int i=0; i<nums.length; i++){
            missing ^= i ^ nums[i];
        }
        return missing;
    }
}

// Better Solution - Time O(n), Space O(1)
// Cyclic Sort
class Solution {
    public int missingNumber(int[] nums) {        
        int i = 0;
        
        while(i < nums.length){
            if(nums[i] < nums.length && nums[i] != nums[nums[i]]){
                swap(nums, i, nums[i]);
            }
            else {
                i++;
            }
        }
        
        for(int j=0; j<nums.length; j++){
            if(j != nums[j]){
                return j;
            }
        }
        return nums.length;
    }
    
    private static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

// Brute Force 1 - Time O(n), Space O(n)
// Arrays.sort()
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

// Brute Force 2- Time O(n), Space O(n)
// "Bucket" method
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