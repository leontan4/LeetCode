//Optimal Solution (HastMap/Math)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int count=0;
        
        if(nums.length <= 1){
            return count;
        }
        
        Map<Integer, Integer> arr = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            if(arr.containsKey(nums[i])){
                arr.put(nums[i], arr.get(nums[i])+1);
                if(arr.get(nums[i])>2){
                    count+=arr.get(nums[i]) - 2;
                }
                count++;
            } else{
                arr.put(nums[i], 1);
            }
        }
        return count;
    }
}

//Optimal Solution (Counting)
class Solution {
    public int numIdenticalPairs(int[] A) {
        int res = 0, count[] = new int[101];
	
	// Same thing, loop through the elements
        for (int a: A) {	

            res += count[a]++; 
	    // Will add each occurence of same element by 1.
	    // Example 1: when 1 occurs the second time for array[1, 2, 3, 1]
	    // [0, 0, 0, 1]

	    // Example 2: when 1 occurs the third time for array[1, 2, 3, 1, 4, 1]
	    // [0, 0, 0, 1, 0, 2]
	   
        }
        return res;
    }
}

// Optimal Solution (Code is too long)
class Solution {
    public int numIdenticalPairs(int[] nums) {
        int mod = 0, div = 0, count = 0;

        HashMap<Integer, Integer> dict = new HashMap<Integer, Integer>();

        for (int i=0; i<nums.length; i++){
            int a = nums[i];

            if(dict.containsKey(a)) {
                dict.put(a, dict.get(a)+1);
            }
            else {
                dict.put(a, 1);
            }
        }

        for (int n : dict.values()) {
            mod = n%2;
            div = n/2;

            if(mod == 1){
                count += div * n;
            }
            else {
                count += div * (n-1);
            }
        }
        
        return count;
    }
}