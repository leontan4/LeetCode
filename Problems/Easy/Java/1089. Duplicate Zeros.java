//Optimal Solution - O(n), O(1)
class Solution {
    public void duplicateZeros(int[] arr) {
 
      int old[]=arr.clone();
        
        int i=0,j=0;
        while(j<old.length){
            arr[j]=old[i];
            if(old[i]==0 && j<old.length-1){
                j++;
                arr[j]=old[i];
            }
            j++;
            i++;
        }
        
    }
}

//Brute Force
class Solution {
    public void duplicateZeros(int[] arr) {
        for (int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                for(int j=arr.length-1; j>i; j--){
                    arr[j] = arr[j-1];
                }
                i++;
            }
        }
    }
}