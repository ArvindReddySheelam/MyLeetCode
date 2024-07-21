class Solution {
    public String mergeAlternately(String word1, String word2) {
       if(word1.isEmpty()){
        return word2;
       }if(word2.isEmpty()){
        return word1;
       }
       int word1_ptr = 0;
       int word2_ptr = 0;
       StringBuilder sb = new StringBuilder();
       while(word1_ptr <= word1.length()-1 && word2_ptr <= word2.length()-1){
          sb.append(word1.charAt(word1_ptr)).append(word2.charAt(word2_ptr));
          word1_ptr++;
          word2_ptr++;
       }
       while(word1_ptr <= word1.length()-1){
       sb.append(word1.charAt(word1_ptr));
        word1_ptr++;
       }
       while(word2_ptr <= word2.length()-1){
        sb.append(word2.charAt(word2_ptr));
        word2_ptr++;
       }

       return sb.toString();
    }
}