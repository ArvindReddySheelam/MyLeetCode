class Solution {
    public int minimumLength(String s) {
      if(s.length() == 0 || s.length() == 1 || s.length() == 2) return s.length();
      int[] charFreq = new int[26];
      for(char ch : s.toCharArray()){
        charFreq[ch-'a']++;
      }
      int minlength = 0;
      for(int i = 0; i<26; i++){
        if(charFreq[i]>0){
        if(charFreq[i]%2 != 0) minlength += 1;
        else minlength += 2;
        }
      }
      return minlength;
    }
}