class Solution {
public:
    bool isSubsequence(string s, string t) {
        int s_ptr = 0;
        int t_ptr = 0;

        while (s_ptr < s.length() && t_ptr < t.length()) {
            if (s[s_ptr] == t[t_ptr]) {
                s_ptr++;
            }
            t_ptr++;
        }
        return s_ptr == s.length() ? true : false;
    }
};