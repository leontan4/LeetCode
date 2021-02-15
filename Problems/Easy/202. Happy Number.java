// Brute Force - Time O(n^2), Space O(n)
// HashMap + Math
class Solution {
    public boolean isHappy(int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        while(!map.containsKey(n)){
            map.put(n, 1);
            int sum=0;

            if(n == 1) return true;
            while(n >= 1){
                int m = n%10;
                n /= 10;
                sum += m * m;
            }
            n = sum;
        }
        return false;
    }
}
