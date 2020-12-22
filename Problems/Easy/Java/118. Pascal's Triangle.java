// Brute Force

class Solution {
    public List<List<Integer>> generate(int numRows) {

        // First base case; if user requests zero rows, they get zero rows.
        if (numRows == 0) {
            return triangle;
        }

        List<List<Integer>> pascal = new ArrayList<>();

        for(int i=0; i<numRows; i++){
            List<Integer> col = new ArrayList<>();
            col.add(1);
            int count = i;
            for(int j=0; j<i; j++){
                if(count >= 2) {
                    int sum = pascal.get(i-1).get(j) + pascal.get(i-1).get(j+1); //NOTE: how to loop through arrays in arrays
                    col.add(sum);
                    count--;
                } else{
                    col.add(1);
                }
            }
            pascal.add(col);
        }
        
        return pascal;
    }
}