class Solution {
    public int lengthOfLongestSubstring(String s) {
       int i = 0;
       int j = 0;
       int maxLength = 0;
       Set<Character> set = new HashSet<>();
       while(j<s.length()){
           if(!set.contains(s.charAt(j))){
                set.add(s.charAt(j));
                j++;
           }else{
               set.remove(s.charAt(i));
               i++;
           }
            maxLength = Math.max(maxLength,j-i);
       }
      return maxLength;
      
    }
}