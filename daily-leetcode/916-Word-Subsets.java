class Solution {

    public static boolean isSubset(int[] temp, int[] words2MaxFreq){
        for(int i = 0; i<26; i++){
        //if freq doesn't match retun false as it not the word we are looking for
            if(temp[i] < words2MaxFreq[i]){
               return false;
            }
        }
        return true;
    }
    public List<String> wordSubsets(String[] words1, String[] words2) {
        
       //List to strore the ans
       List<String> ans = new ArrayList<>();

       //The words2Freq array is used to track the maximum frequency of each character that is encountered across all words in words2.
       int[] words2MaxFreq = new int[26];
       
       //travrese the words2 words
       for(String s : words2){
        //The temp array is used to count the frequencies of characters in the current word (s) being processed from words2 and reinitialized for every next word
        int[] temp = new int[26];
        for(char ch : s.toCharArray()){
            temp[ch - 'a']++;
            words2MaxFreq[ch-'a'] = Math.max(words2MaxFreq[ch-'a'],temp[ch-'a']);
        }
       }

       //freq check for words1
       for(String s : words1){
        int[] temp = new int[26];
        //convert words to char array 
        for(char ch : s.toCharArray()){
            temp[ch-'a']++;
        }
        //check for each word
         if(isSubset(temp,words2MaxFreq)){
            ans.add(s);
         }
       }
       return ans;
    }
}