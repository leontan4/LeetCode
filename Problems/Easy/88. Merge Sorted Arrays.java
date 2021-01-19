// Optimal Solution
class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        
        int i = m-1, j = n-1, k = m+n-1;
        
	// Important plays between i, j and k
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]){
                nums1[k--] = nums1[i--];
                
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        
	// This is in case both arrays are length of 1
	// Example: [0] and [1] will result in 1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }

	// Do not need to return
    }
}