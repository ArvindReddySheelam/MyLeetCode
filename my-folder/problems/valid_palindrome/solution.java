class Solution {
    public static boolean isPalindrome(String s) {
        if(s.isEmpty())
        return true;
        String str = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    
    int start = 0;
    int end = str.length()-1;

    while(start <= end){
     if(str.charAt(start) != str.charAt(end)){
           return false;
        }
        else{
            start++;
            end--;
        }
    }
   return true;
    }
}