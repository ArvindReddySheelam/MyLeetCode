class Solution {
public:
    bool canConstruct(string s, int k) {
        
         //Edge Cases
        if(k > s.length()) return false;
        if(s.length() == k) return true;
        
        /*we char appears even times we can build a palindrome but 
        if characters appears in odd count we need check them and they 
        shpuld be <= k */

        /*Note: {it's not about a particular character that appears odd 
        numbers of time but how many odd count characters we have and we only
        have to check for them}  */
        
        int charFreqCount[26] = {0};
        for(int i = 0; i<=s.length()-1; i++){
            charFreqCount[s[i] - 'a']++;
        }
        
        int NumofOddCharCount = 0;
        for(int i = 0; i<26; i++){
            if(charFreqCount[i]%2 != 0){
                  NumofOddCharCount++;
            }
        }
          return (NumofOddCharCount <= k) ? true : false;
    }
};