class Solution {
public:
    static bool isPalindrome(string s) {
        if (s.empty()) {
            return true;
        }

        string str;
        for (char c : s) {
            if (isalnum(c)) {
                str += tolower(c);
            }
        }

        int start = 0;
        int end = str.length() - 1;

        while (start <= end) {
            if (str[start] != str[end]) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
};
