class Solution {
    public String reverseVowels(String s) {
        if (s.isEmpty()) {
            return "";
        }
        Set<Character> vowels = new HashSet<>();
        vowels.add('a'); vowels.add('e'); vowels.add('i'); vowels.add('o');
        vowels.add('u'); vowels.add('A'); vowels.add('E'); vowels.add('I'); 
        vowels.add('O'); vowels.add('U');

        char[] ch = s.toCharArray();
        int left_ptr = 0;
        int right_ptr = ch.length - 1;

    while (left_ptr < right_ptr) {
      
       while(!vowels.contains(ch[left_ptr]) && left_ptr < right_ptr) {
                left_ptr++;
            } 
       while(!vowels.contains(ch[right_ptr])  && left_ptr < right_ptr) {
                right_ptr--;
            } 
            
                char c = ch[left_ptr];
                ch[left_ptr] = ch[right_ptr];
                ch[right_ptr] = c;
            
            left_ptr++;
            right_ptr--;
        }
        return String.valueOf(ch);
    }
}