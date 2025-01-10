class Solution {

    public:
     static bool isSubset(int temp[], int words2MaxFreq[]){
        for(int i = 0; i<26; i++){
        //if freq doesn't match retun false as it not the word we are looking for
            if(temp[i] < words2MaxFreq[i]){
               return false;
            }
        }
        return true;
    }
public:
    vector<string> wordSubsets(vector<string>& words1, vector<string>& words2) {
        //List to strore the ans
       std::vector<std::string> ans;

       //The words2Freq array is used to track the maximum frequency of each character that is encountered across all words in words2.
       int words2MaxFreq[26] = {0};
       
       //travrese the words2 words
       for(std::string s : words2){
        //The temp array is used to count the frequencies of characters in the current word (s) being processed from words2 and reinitialized for every next word
        int temp[26] = {0};
        for(char ch : s){
            temp[ch - 'a']++;
            words2MaxFreq[ch-'a'] = std::max(words2MaxFreq[ch-'a'],temp[ch-'a']);
        }
       }

       //freq check for words1
       for(std::string s : words1){
        int temp[26] = {0};
        //convert words to char array 
        for(char ch : s){
            temp[ch-'a']++;
        }
        //check for each word
         if(isSubset(temp,words2MaxFreq)){
            ans.emplace_back(s);
         }
       }
       return ans;
    }
};