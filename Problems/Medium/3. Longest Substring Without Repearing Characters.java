// Optimal Solution - Time O(n), Space O(n)
// HashMap + Sliding Window + Dynamic Programming
class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1) return 0;
        HashMap <Character, Integer> map = new HashMap<>();
        int winStart = 0, max = Integer.MIN_VALUE; 
        
        for(int winEnd = 0; winEnd < s.length(); winEnd++){
            char rightChar = s.charAt(winEnd);
            
            // if map already contains the "rightChar", shrink the window from the beginning
            // so that we have only one occurence of "rightChar"
            if(map.containsKey(rightChar)){
                
                // this is tricky; in the current window, we will not have any "rightChar" after its previous index
                // and if "winStart" is already ahead of the last index of "rightChar", we'll keep "winStart"
		// basically restart the counting for unique characters
		// and reposition "winStart" before/at where "winEnd" first found the duplicate element
                winStart = Math.max(winStart, map.get(rightChar) + 1); 
            }
	    // Instead of storing the count of occurence, we store the "index" of elements
            map.put(rightChar, winEnd);
            max = Math.max(max, winEnd - winStart + 1);
        }
        return max;
    }
}

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
