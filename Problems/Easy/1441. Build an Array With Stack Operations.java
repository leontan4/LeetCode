//Optimal Solution?
class Solution {
    public List<String> buildArray(int[] target, int n) {
        ArrayList<String> arr = new ArrayList<>();
        
        int top=1, j=0;
        
        while(top<=n && j<target.length){
            arr.add("Push");
            
            if(target[j] != top){
                arr.add("Pop");
                top++;
            }
            else {
                top++;
                j++;
            }
        }
        return arr;
    }
}