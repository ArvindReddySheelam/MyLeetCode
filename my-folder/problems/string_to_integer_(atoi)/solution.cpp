class Solution {
public:
    int myAtoi(string s) {
        int i = 0;
        int sign = 1;
        long long result = 0;
        int max = INT_MAX;
        int min = INT_MIN;

        while(i < s.length() && isspace(s[i])){
            i++;
        }
        if(i < s.length() && (s[i] == '+' || s[i] == '-')){
            sign = (s[i++] == '-') ? -1 : 1;
        }
        while(i < s.length() && (s[i] >= '0' && s[i] <= '9')){
            int digit = s[i] - '0';

            if(result > (max - digit)/10|| (result == max && digit > 7)){
                return sign == 1 ? INT_MAX : INT_MIN;
            }
            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }
};