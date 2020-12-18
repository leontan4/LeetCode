//Brute Force
class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Map<Character, Integer> dict = new HashMap<Character, Integer>();

        for(int i=0; i< allowed.length(); i++){
            char temp = allowed.charAt(i);

            if(dict.containsKey(temp)) {
            }
            else {
                dict.put(temp, 1);
            }
        }
        int count = 0;
        for (int i=0; i< words.length; i++){
            int sum = 0;
            for(int j=0; j<words[i].length(); j++){
                char temp = words[i].charAt(j);
                if(dict.containsKey(temp)){
                    sum ++;
                }
            }

            if(sum == words[i].length()){
                count++;
            }
        }
        return count;
    }
}