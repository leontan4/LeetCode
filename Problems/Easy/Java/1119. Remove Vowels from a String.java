// Brute Force (Should be optimal - can only try after subscribed)

class Solution {
    public String removeVowels(String S) {

        StringBuilder noVowels = new StringBuilder();

        for(int i=0; i<S.length(); i++){
            char temp = S.charAt(i);

            if(!isVowel(temp)) {
                noVowels.append(temp);
            }
        }

        return noVowels.toString();
    }

    public static boolean isVowel(char vowel) {

        if(vowel=='a' || vowel=='e' || vowel=='i' || vowel=='o' || vowel=='u'){
            return true;
        } else{
            return false;
        }
    }
}
