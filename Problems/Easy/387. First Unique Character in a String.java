//Brute Force Solution
class Solution {
    public int firstUniqChar(String s) {
        
        HashMap<Character, Integer> dict = new HashMap<Character, Integer>();

        for (int i=0; i<s.length(); i++){
            char temp = s.charAt(i);

            if (dict.containsKey((temp))) {

                dict.put(temp, dict.get(temp) + 1);
            } else{
                dict.put(temp, 1);
            }
        }
        
        for (int i=0; i<s.length(); i++){
            char temp = s.charAt(i);

            if(dict.get(temp) == 1){
                return i;
            }
        }
    
    return -1;
    }
}