//Optimal Solution
class Solution {
    public String reverseStr(String s, int k) {

        char[] ch = s.toCharArray();

        for (int i = 0; i < ch.length; i += (2 * k)) // Reverse the first k characters for every 2k characters
            reverse(ch, i, Math.min(ch.length - 1, (i + k - 1))); // If there are less than k characters left, reverse the remaining characters

        return String.valueOf(ch);
    }

    private void swap(char[] ch, int i, int j) {
        char temp = ch[i];
        ch[i] = ch[j];
        ch[j] = temp;
    }

    private void reverse(char[] ch, int i, int j) {
        while (i < j) {
            swap(ch, i, j);
            i++;
            j--;
        }
    }
}

// Brute Force Solution
class Solution {
    public String reverseStr(String s, int k) {
        
        char[] c = s.toCharArray();
        int len = s.length();
        
        for (int i=0; i<len; i+=2*k){
            int start = i, end = Math.min(i + k - 1, len - 1);

            while (start < end) {
                char temp = c[start];
                c[start++] = c[end];
                c[end--] = temp;
            }
        }
        
        return String.valueOf(c);
    }
}