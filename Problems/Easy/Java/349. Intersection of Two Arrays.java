//Brute Force
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Map <Integer, Integer> dict = new HashMap<Integer, Integer>();

        for(int i=0; i<nums1.length; i++){
            if(dict.containsKey(nums1[i])){
                dict.put(nums1[i], dict.get(nums1[i])+1);
            } else{
                dict.put(nums1[i], 1);
            }
        }

        HashSet<Integer> set = new HashSet<>();

        for(int j=0; j<nums2.length; j++){
            if(dict.containsKey(nums2[j])){
                set.add(nums2[j]);
            }
        }
        
        int[] arr = new int[set.size()];
            
        int k = 0;
        for (int i: set)
            arr[k++] = i;
        
        return arr;
    }
}