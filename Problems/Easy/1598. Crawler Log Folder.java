//Optimal Solution - Time O(n), Space O(n)
//Using count (Do not need to add to stack or anything)
class Solution {
    public int minOperations(String[] arr) {
        int top=0;

        for(int i=0; i<arr.length; i++){
            if(arr[i].equals("../")){
                if(top > 0){
                    top--;
                }
            }
            else if(arr[i].equals("./")) {
                continue;
            }
            else{
                top++;
            }
        }
        
        return top;
    }
}

//Better Brute Force- Time O(n), Space O(n)
//Using Two Pointers
class Solution {
    public int minOperations(String[] logs) {
        String[] stack = new String[logs.length];
        int top=0;

        for(String log : logs){
            if(top>0 && log.equals("../")){
                stack[top]="0";
                top--;
            }
            else if(log.equals("./") || top==0 && log.equals("../")) {
                continue;
            }
            else{
                stack[top] = log;
                top++;
            }
        }
        
        return top;
    }
}

//Brute Force - Time O(n), Space O(n)
//Creating extra Stack
class Solution {
    public int minOperations(String[] logs) {
        Stack <String> stack = new Stack<>();

        for(String log : logs){
            if(!stack.isEmpty() && log.equals("../")){
                stack.pop();
            }
            else if(log.equals("./") || stack.isEmpty() && log.equals("../")) {
                continue;
            }
            else{
                stack.push(log);
            }
        }
        
        return stack.size();
    }
}