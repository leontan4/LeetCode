// Cleaner Solution
public int[] plusOne(int[] digits) {
        
    int n = digits.length;
    for(int i=n-1; i>=0; i--) {
        if(digits[i] < 9) {
            digits[i]++;
            return digits;
        }
        
        digits[i] = 0;
    }
    
    int[] newNumber = new int [n+1];
    newNumber[0] = 1;
    
    return newNumber;
}

// Optimal Solution
class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;
        
        for(int i=n - 1; i>=0; i--){
            if(digits[i] == 9) {
                digits[i] = 0;
                
            } else{
                digits[i]++;
                break;
            }
        }
        
        if(digits[0] == 0){
            int[] nums = new int[n+1];
            nums[0] = 1;
            return nums;
        }
        
        return digits;
    }
}