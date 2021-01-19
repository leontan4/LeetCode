// Brute Force O(n*m)
class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
        for(int i=0; i<arr.length; i++){

            int row = arr[i].length-1;
            int col = 0;

            while(col < row) {
                int temp = arr[i][col];
                arr[i][col] = arr[i][row];
                arr[i][row] = temp;

                col++;
                row--;
            }
        }

        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){

                if(arr[i][j] == 1){
                    arr[i][j] = 0;
                } else{
                    arr[i][j] = 1;
                }
            }
        }
        return arr;
    }
}