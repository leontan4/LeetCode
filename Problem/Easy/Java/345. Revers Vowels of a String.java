class Solution {
    public String reverseVowels(String s) {
        
        char[] c = s.toCharArray();
        int len = s.length(), j = 0;

        ArrayList<Character> vowels= new ArrayList<Character>();
        for (int i=0; i<len; i++){
            if(c[i] == 'a' || c[i] == 'e' ||c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u' || c[i] == 'A' || c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U') {
                vowels.add(c[i]);
            }
        }

        for (int i=len-1; i>=0; i--){
            if(c[i] == 'a' || c[i] == 'e' ||c[i] == 'i' ||c[i] == 'o' ||c[i] == 'u' || c[i] == 'A' || c[i] == 'E' ||c[i] == 'I' ||c[i] == 'O' ||c[i] == 'U') {
                c[i] = vowels.get(j);
                j++;
            }
        }
        
        return String.valueOf(c);
        
    }
}