//Brute Force Solution- Time O(n^2) and Space O(n)
//Insertion method
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=0; i<nums.length; i++){
            arr.add(index[i], nums[i]);
        }

        int [] newArr = new int[nums.length];
        
        for(int i=0; i<nums.length; i++){
            newArr[i] = arr.get(i);
        }
        
        return newArr;
    }
}