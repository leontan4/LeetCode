//Optimal Solution - Time O(m+n), Space O(n) 
class Solution {
    public boolean backspaceCompare(String S, String T) {
        String s = newStack(S);
        String t = newStack(T);
        
        return s.equals(t);
    }

    // Implementing second method
    public static String newStack(String str){
        char[] stack = new char[str.length()];
        int top=0;

        for(int i=0; i<str.length(); i++){
            char temp = str.charAt(i);

            if(temp == '#'){
                if(top>0){
                    stack[top-1] = 'O';
                    top--;
                } else if(top==0){
                    continue;
                }
            }
            else{
                stack[top++] = temp;
            }
        }
        return new String(stack, 0, top);
    }
}