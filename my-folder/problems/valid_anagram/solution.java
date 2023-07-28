class Solution {
    public boolean isAnagram(String s, String t) {
      if(s.length() != t.length()){
          return false;
      }
      Map<Character,Integer> map1 = new HashMap<>();
      Map<Character,Integer> map2 = new HashMap<>();
      for(char c1 : s.toCharArray()){
          map1.put(c1,map1.getOrDefault(c1,0) + 1);
      }
      for(char c2 : t.toCharArray()){
          map2.put(c2,map2.getOrDefault(c2,0) + 1);
      }
        return map1.equals(map2)?true : false;
    }
}