class Solution {
    public int[] decompressRLElist(int[] nums) {
        int sum = 0;
        for(int i=0; i<nums.length-1; i++){
            if(i%2==0 || i==0) {
                sum+=nums[i];
            }
        }
        
        int [] freq = new int[sum];
        int index = 0;
        for(int i=0; i<nums.length-1; i++){
            if(i%2==0 || i==0) {
                for(int j=0; j< nums[i]; j++) {
                    int val = nums[i+1];
                    freq[index++] = val;
                }
            }
        }
        
        return freq;
    }
}