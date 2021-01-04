//Optimal Solution - Time O(n), Space O(1)
// Two Pointers
class Solution {
    public int[] replaceElements(int[] arr) {
        int currMax = arr[arr.length-1];
        for(int i=arr.length-2; i>=0; i--){
            if(arr[i] >= currMax){
                int prevMax = currMax;
                currMax = arr[i];
                arr[i] = prevMax;
            } else{
                arr[i] = currMax;
            }
        }

        arr[arr.length-1] = -1;
        return arr;
    }
}

//Brute Force
class Solution {
    public int[] replaceElements(int[] arr) {
        for (int i=0; i<arr.length-1; i++){
            int max = arr[i+1];
            for(int j=i+1; j<arr.length; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            arr[i] = max;
        }
        arr[arr.length-1] = -1;
        return arr;
        
    }
}