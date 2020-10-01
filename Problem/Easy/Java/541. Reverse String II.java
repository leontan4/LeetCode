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