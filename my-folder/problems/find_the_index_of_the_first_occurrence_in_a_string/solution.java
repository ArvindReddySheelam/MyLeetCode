class Solution {
    public int strStr(String haystack, String needle) {
        if(haystack.contains(needle) == true){
            int i = haystack.indexOf(needle);
            return i;
        }
        else
        return -1;
    }
}