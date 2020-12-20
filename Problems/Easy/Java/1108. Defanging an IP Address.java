//Brute Force
class Solution {
    public String defangIPaddr(String address) {
        StringBuilder str = new StringBuilder();

        for(int i=0; i<address.length(); i++){
            char temp = address.charAt(i);

            if(temp != '.'){
                str.append(temp);
            }

            if(temp == '.'){
                str.append("[.]");
            }
        }
        
        return str.toString();
    }
}