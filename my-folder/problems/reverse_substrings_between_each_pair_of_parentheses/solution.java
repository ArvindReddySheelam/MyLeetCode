class Solution {
    public String reverseParentheses(String str) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> pq = new LinkedList<>();

        for(int i = 0; i<=str.length()-1; i++){
            if(str.charAt(i) != ')'){
                stack.push(str.charAt(i));
            }else{
              while(stack.peek() != '('){
                    pq.add(stack.pop());
                }
               stack.pop();
               while(pq.size() > 0){
                 stack.push(pq.remove());
               }
            }
        }
        //printing them in reverse order
       char[] ch = new char[stack.size()];
       int i = ch.length-1;
       while(i >= 0){
        ch[i] = stack.pop();
        i--;
       }
       return String.valueOf(ch);
    }
}