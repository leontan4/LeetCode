//Brute Force 
class Solution {
    public int maximumWealth(int[][] arr) {
        int max=0;
        for (int i=0; i<arr.length; i++){
            int sum = 0;
            for (int j=0; j<arr[i].length; j++){
                sum += arr[i][j];
            }
            if(sum >= max){
                max = sum;
            }
        }
        
        return max;
    }
}