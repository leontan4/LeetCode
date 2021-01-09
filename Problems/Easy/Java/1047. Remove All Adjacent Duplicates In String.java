//Brute Force
class Solution {
    public String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();

        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);

            if(!stack.isEmpty() && stack.peek() == temp){
                stack.pop();
            }
            else{
                stack.push(temp);
            }
        }

        String str ="";
        for(Character c : stack){
            str += c;
        }
        return str.toString();
    }
}