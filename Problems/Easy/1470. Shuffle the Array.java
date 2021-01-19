//Brute Force Solution- Time O(n), Space O(n)
class Solution
{
    public int[] shuffle(int[] nums, int n)
    {
	// Create an empty array
	// n indicates the first y element
        int[] res = new int[2*n];
        int j=0;
        
	// We are looping only to n because, we are appending two elements at the same time. So by the time we loop n times, we already appended 2*n elements.
        for(int i=0; i<n; i++){
            res[j++] = nums[i];
            res[j++] = nums[i+n];
        }
        
    return res;
    } 
}