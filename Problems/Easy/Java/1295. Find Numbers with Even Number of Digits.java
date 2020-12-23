// Optimal Solution
class Solution {
    public int findNumbers(int[] arr) {

        int count=0;
        
        for(int i=0; i<arr.length; i++){
            if((arr[i]>=10 && arr[i]<100) || (arr[i]>=1000 && arr[i]<10000) || (arr[i]==100000)){
                count ++;
            }
        }
        
        return count;
    }
}

// Brute Force
class Solution {
    public int findNumbers(int[] arr) {

        int count=0, i=0, sum=0;

        while(i < arr.length){
            if(arr[i] != 0){
                arr[i] = getDigit(arr[i]);
                count++;
            } else{
                i++;
                count=0;
            }
            if(i == arr.length){
                break;
            }
            
            if(count%2 == 0 && arr[i] == 0){
                sum++;
            }
        }

        return sum;    
    }

    public static int getDigit(int n) {
        if(n == 0){
            return n;
        }
        return n/10;
    }
}