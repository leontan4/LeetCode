//Monotone Stack - Time O(n), Space O(n)
class Solution {
    public int[] finalPrices(int[] prices) {
        Stack<Integer> stack = new Stack<>();
        
        for(int i=0; i<prices.length; i++){
            while(!stack.isEmpty() && prices[stack.peek()] >= prices[i]){
                prices[stack.pop()] -= prices[i];
            }
            stack.push(i);
        }
        return prices;
    }
}

//Brute Force 
class Solution {
    public int[] finalPrices(int[] prices) {

        for (int i=0; i<prices.length; i++){
            for(int j=i+1; j<prices.length; j++) {
                if(prices[i] >= prices[j] && i<j) {
                    prices[i] = prices[i] - prices[j];
                    break;
                }
            }
        }
        return prices;
    }
}