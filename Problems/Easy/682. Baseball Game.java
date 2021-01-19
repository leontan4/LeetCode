//Optimal Solution
class Solution {
    public int calPoints(String[] ops) {
        int top=0;
        int [] stack = new int[ops.length];

        for(String s : ops){
            if(s.equals("+")) {
                stack[top] = stack[top-1] + stack[top-2];
                top++;
                
            } else if(s.equals("C")){
                stack[top-1] = 0;
                top--;
            } else if(s.equals("D")){
                stack[top] = stack[top-1] * 2;
                top++;
            } else{
                stack[top] = Integer.valueOf(s);
                top++;
            }
        }

        int sum=0;
        for(Integer nums : stack){
            sum+=nums;
        }
        
        return sum;
    }
}