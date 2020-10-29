// Brute Force Solution
class Solution {
    public List<Boolean> kidsWithCandies(int[] nums, int extraCandies) {
        int max= nums[0];
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        ArrayList<Boolean> res = new ArrayList();
        
        for (int j = 0; j<nums.length; j++){
           
            if(nums[j] + extraCandies >= max){
               res.add(true);
            } else {
              res.add(false);
            }
        }   
        return res;
    }
}