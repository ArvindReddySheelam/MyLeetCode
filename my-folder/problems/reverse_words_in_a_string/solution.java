class Solution {
    public String reverseWords(String s) {
        if(s.isEmpty()){
            return "";
        }
        String[] str = s.trim().split("\\s+");
         int start = 0;
         int end = str.length-1;
        
        while(start <= end){
           String str1 = str[start];
            str[start] = str[end];
            str[end] = str1;
            
            start++;
            end--;
        }
         return Arrays.stream(str).collect(Collectors.joining(" "));
    }
}