//Optimal Solution - Better
public boolean isValid(String s) {
	Stack<Character> stack = new Stack<Character>();
	for (char c : s.toCharArray()) {
		if (c == '(')
			stack.push(')');
		else if (c == '{')
			stack.push('}');
		else if (c == '[')
			stack.push(']');
		// The stack will 'pop()' either way and IF the right brackets are the same, the loop continues.
		else if (stack.isEmpty() || stack.pop() != c)
			return false;
	}
	return stack.isEmpty();
}

//Optimal Solution
class Solution {
    public boolean isValid(String s) {
        
	//If is not 0, then is false because brackets always have to have closings
        if(s.length()%2 != 0){
            return false;
        }
        
        Stack<Character> stack = new Stack();
        
	// Another looping method for Strings
        for(char temp: s.toCharArray()) {

            if(temp == '(' || temp == '{' || temp == '['){
                stack.push(temp);
            }else if(temp == ')' && !stack.isEmpty() && stack.peek() == '('){
                stack.pop();
            }else if(temp == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop();
            }else if(temp == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop();
            }else{
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}