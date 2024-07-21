class Solution {
    public boolean isSubsequence(String s, String t) {
        int s_ptr = 0;
        int t_ptr = 0;

        while(s_ptr <= s.length()-1 && t_ptr <= t.length()-1){
            if(s.charAt(s_ptr) == t.charAt(t_ptr)){
                s_ptr++;
            }
            t_ptr++;
        }
        return s_ptr == s.length() ? true : false;
    }
}