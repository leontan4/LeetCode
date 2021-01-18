// Optimal Solution
public class Solution {
    public boolean isPalindrome(String s) {
        int start = 0; 
        int end = s.length() - 1;
        while(start <= end) {
            while(start <= end && !Character.isLetterOrDigit(s.charAt(start))) {
                start++;
            }
            while(start <= end && !Character.isLetterOrDigit(s.charAt(end))) {
                end--;
            }
            if(start <= end && Character.toLowerCase(s.charAt(start)) != Character.toLowerCase(s.charAt(end))) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

// Brute Force
class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        
        int i = 0, j = s.length()-1;
        
            while(j>i){
                if(s.charAt(i) != s.charAt(j)){
                    return false;
                }
                else{
                    i++;
                    j--;
                }
            }
         return true;
    }
}