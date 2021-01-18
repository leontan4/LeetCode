// Optimal Solution?
// Two Pointers (Finding Space)
class Solution {
    public String reverseWords(String s) {
       char[] c = s.toCharArray();
        int counter = 0, len = s.length(), j = 0, i = 0;

        int index = s.indexOf(" ");

        if (index < 0) {
            i = 0;
            j = s.length() - 1;
            while (j > i) {
                char temp = c[i];
                c[i++] = c[j];
                c[j--] = temp;
            }
        } else {

            for (int space = 0; space < len; space++) {

                if (c[space] == c[index]) {
                    i = counter;
                    j = space - 1;

                    while (j > i) {
                        char temp = c[i];
                        c[i++] = c[j];
                        c[j--] = temp;
                    }
                    counter = space + 1;
                }
            }

            i = counter;
            j = len - 1;

            while (j > i) {
                char temp = c[i];
                c[i++] = c[j];
                c[j--] = temp;
            }
        }
        return String.valueOf(c);
    }
}