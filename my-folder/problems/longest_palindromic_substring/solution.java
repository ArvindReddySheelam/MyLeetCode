class Solution {
    public String longestPalindrome(String s) {

        if(s.length() <= 1){
            return s;
        }
        String LPS = "";

        for(int i = 1; i<s.length(); i++){
           
           //consider for odd length
           int low = i;
           int high = i;
          
           while(s.charAt(low) == s.charAt(high)){
             low--;
             high++;
            
            //if any one of the pointer reaches out of start or end just break
             if(low == -1 || high == s.length()){
                break;
             }

           }
           
           //at the end check for length and update the LPS with
           //current palindrome you found.
           String palindrome = s.substring(low+1,high);
             if(palindrome.length() >= LPS.length()){
                LPS = palindrome;
             }
            
            //consider for even length do the same stuff as above.
            low = i - 1;
            high = i;
            
            while(s.charAt(low) == s.charAt(high)){
                low--;
                high++;

                if(low == -1 || high == s.length()){
                    break;
                }
            }

            palindrome = s.substring(low+1,high);
             if(palindrome.length() >= LPS.length()){
                LPS = palindrome;
             }
        }

        return LPS;
    }
}