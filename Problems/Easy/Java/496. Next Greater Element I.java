// Brute Force
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        if(nums1.length < 1){
            return nums1;
        }
        
        for(int i=0; i<nums1.length; i++){
            for(int j=0; j< nums2.length; j++){
                int start = j+1;
                if(nums1[i] == nums2[j]){
                    while(start < nums2.length){
                        if(nums2[start] > nums2[j]){
                            nums1[i] = nums2[start];
                            break;
                        }
                        start++;
                    }
                    if(nums1[i] >= nums2[j] && start == nums2.length){
                        nums1[i]=-1;
                    }
                    break;
                }
            }
        }
        return nums1;
    }
}