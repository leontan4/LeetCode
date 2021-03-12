// Optimal Solution - Time O(n), Space O(n)
// HashMap + Sliding Window

class Solution {
    public int LongestSubstringKDistinct(String s, int k) {
        HashMap<Character, Integer> map = new HashMap<>();
        int winStart = 0, max = Integer.MIN_VALUE;

        for (int winEnd = 0; winEnd < s.length(); winEnd++) {
            char temp = s.charAt(winEnd);

            if (map.containsKey(temp)) {
                map.put(temp, map.get(temp) + 1);
            } else {
                map.put(temp, 1);
            }

            while (map.size() > k) {
                map.put(s.charAt(winStart), map.get(s.charAt(winStart)) - 1);
                max = Math.max(max, winEnd - winStart);

                if (map.get(s.charAt(winStart)) == 0) {
                    map.remove(s.charAt(winStart));
                }

                winStart++;
            }
        }
        return max;
    }
}
