// Opetimal Solution - Time O(n), Space O(1)
// for-loop
class Solution {
    public int xorOperation(int n, int start) {
        int end = 0;
        
        for(int i=0; i<n; i++){
            end ^= start + (2 * i);
        }
        return end;
    }
}

// Optimal Solution - Time O(n), Space O(1)
// while-loop - increment
class Solution {
    public int xorOperation(int n, int start) {
        int c = start;
        int a = 1;
        
        while(a < n){
            int b = start + (2*a);
            c ^= b;
            a++;
        }
        return c;
    }
}

// Optimal Solution - Time O(n), Space O(1)
// while-loop - decrement
class Solution {
    public int xorOperation(int n, int start) {
        int c = start;
        int a = n-1;
        
        while(a > 0){
            int b = start + (2*a);
            c ^= b;
            a--;
        }
        return c;
    }
}
