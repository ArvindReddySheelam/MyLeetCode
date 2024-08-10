class Solution {
    public int myAtoi(String s) {
        int i = 0, sign = 1, res = 0;
        int max = Integer.MAX_VALUE / 10, min = Integer.MIN_VALUE / 10;

        // Ignore leading whitespace
        while (i < s.length() && Character.isWhitespace(s.charAt(i))) {
            i++;
        }

        // Handle sign
        if (i < s.length() && (s.charAt(i) == '+' || s.charAt(i) == '-')) {
            sign = (s.charAt(i++) == '-') ? -1 : 1;
        }

        // Convert digits
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i++) - '0';
            // Check for overflow
            if (res > max || (res == max && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + digit;
        }

        return sign * res;
    }
}

