// Library solution - try not to use this
class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack == "" && needle == ""){
            return 0;
        } else if(haystack.contains(needle)){
            return haystack.indexOf(needle);
        } else{
            return -1;
        }
    }
}