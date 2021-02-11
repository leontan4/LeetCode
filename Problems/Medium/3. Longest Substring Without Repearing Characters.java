// Brute Force - Time O(n), Space O(n)
// HashMap + Sliding Window
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1){
            return 0;
        }
        
        HashMap<Character, Integer> map = new HashMap<>();
        map.put(s.charAt(0), 1);

        int max = Integer.MIN_VALUE, start=0;

        for(int end=1; end<s.length(); end++){
            char temp = s.charAt(end);

            if(map.containsKey(temp)){
                map.put(temp, map.get(temp) + 1);
            }
            else{
                map.put(temp, 1);
            }

            if(map.size() > 1){
                while(map.get(s.charAt(start)) > 1 || map.get(temp) > 1){
                    map.put(s.charAt(start), map.get(s.charAt(start))- 1);

                    if(map.get(s.charAt(start)) == 0){
                        map.remove(s.charAt(start));
                    }
                    start++;
                }
                max = Math.max(max, end - start + 1);
            }
        }

        if(max < 1){
            max = 1;
        }
        
        return max;
    }
}
