//Optimal Solution 
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
         for (int i=0; i<S.length(); i++) {
            for (int k = 0; k < J.length(); k++) {
                if (J.charAt(k) == S.charAt(i)) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}

// Brute Force
class Solution {
    public int numJewelsInStones(String J, String S) {
        int count = 0;
        Map<Character, Integer> dict = new HashMap<>();

        for (int i=0; i<J.length(); i++){
            char temp = J.charAt(i);
            if(dict.containsKey(temp)){
                dict.put(temp, dict.get(temp)+1);
            } else{
                dict.put(temp, 1);
            }
        }

        for (int i=0; i<S.length(); i++){
            char temp = S.charAt(i);
            if(dict.containsKey(temp)){
                dict.put(temp, dict.get(temp)+1);
                count++;
            }
        }
        return count;
    }
}