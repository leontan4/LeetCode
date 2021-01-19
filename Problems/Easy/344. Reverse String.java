// Optimal Solution
// Two Pointers
class Solution {
    public void reverseString(char[] s) {
        
        String test = String.valueOf(s);
        int i = 0, j = test.length() - 1;

        while(j > i){
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;
            
            i++;
            j--;
        }
    }
}