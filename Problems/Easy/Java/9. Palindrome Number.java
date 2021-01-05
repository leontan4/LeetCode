//Optimal Solution

class Solution {
    public boolean isPalindrome(int x) {
        int y = x;
        
	// Base Case
        if(x < 0){
            return false;
        }
        
        int result=0;
        
        while(x!=0){
            int lastDigit = x%10;
            int newResult = lastDigit + result*10;
            
            result = newResult;
            x/=10;
        }
        return y==result;
    }
}