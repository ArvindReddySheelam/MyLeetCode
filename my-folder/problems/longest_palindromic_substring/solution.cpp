class Solution {
public:
    string longestPalindrome(string s) {
         if(s.length() <= 1){
            return s;
        }
        string LPS = "";

        for(int i = 1; i<s.length(); i++){
           
           //consider for odd length
           int low = i;
           int high = i;
          
           while(low >=0 && high <= s.length() && s[low] == s[high]){
             low--;
             high++;
            
            //if any one of the pointer reaches out of start or end just break
             if(low == -1 || high == s.length()){
                break;
             }

           }
           
           //at the end check for length and update the LPS with
           //current palindrome you found.
           string palindrome = s.substr(low+1,high - low - 1);
             if(palindrome.length() > LPS.length()){
                LPS = palindrome;
             }
            
            //consider for even length do the same stuff as above.
            low = i - 1;
            high = i;
            
            while(low >= 0 && high < s.length() && s[low] == s[high]){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substr(low+1,high - low - 1);
             if(palindrome.length() > LPS.length()){
                LPS = palindrome;
             }
        }

        return LPS;
 
    }
};