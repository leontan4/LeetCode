// Optimal Solution
// Recursion method
class Solution {
    public List<Integer> getRow(int row) {
        if (row == 0){
	   return List.of(1);
	}
 
        List<Integer> last = getRow(row - 1);

        // index row => len: row + 1
        List<Integer> curr = new ArrayList<>();
        curr.add(1);

        for (int i = 1;i < row;i++) {
            curr.add(last.get(i - 1) + last.get(i));
        }
        curr.add(1);
        return curr;
    }
}

// Brute Force
class Solution {
    public List<Integer> getRow(int rowIndex) {

        List<List<Integer>> triangle = new ArrayList<>();

        for(int i=0; i<=rowIndex; i++){
            List<Integer> row = new ArrayList<>();
            row.add(1);
            int count = i;
            for(int j=0; j<i; j++){
                if(count >= 2) {
                    int sum = triangle.get(i-1).get(j) + triangle.get(i-1).get(j+1); 
                    row.add(sum);
                    count--;
                } else{
                    row.add(1);
                }
            }
            triangle.add(row);
        }
        
        return triangle.get(rowIndex);
    }
}