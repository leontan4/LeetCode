// Optimal Solution
class Solution {
    public String interpret(String command) {
        StringBuilder str = new StringBuilder();
        
        for(int i=0; i<command.length(); i++) {
            char temp = command.charAt(i);
            
            if(temp == 'G') {
                str.append("G");
            }
            else if(temp == '(') {
                if (command.charAt(i+1) == ')') {
                    str.append("o");
                    i++;
                } 
                else if(command.charAt(i+1) == 'a') {
                    str.append("al");
                    i+=3;
                }
            }
            
        }
        
        return str.toString();
    }
}