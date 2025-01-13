class Solution {
    public boolean canBeValid(String s, String locked) {
        //if length is odd we couldn't make valid parentheses caz if it's of odd
        //length we always left with one parentheses either of "(" or ")"
        //so inorder to make a valid one we always need pairs which are of even.
        if(s.length()%2 != 0) return false;

        Stack<Integer> OpenParenthesesStack = new Stack<>();
        Stack<Integer> UnlockedElementStack = new Stack<>();

        for(int i = 0; i<s.length(); i++){
         //push unlocked ele to stack so that even if we encounter any
        //closed parentheses at any index we can chk prev indexes for whether we
        //encounter any unlocked elem's so that we can flip those previous one's 
        //to make a valid parentheses.
            if(locked.charAt(i) == '0') { UnlockedElementStack.push(i); }
            //else if it's locked so chk if it's "(" or ")" if open push to 
            //OpenPrenthesesStack for using later to make valid parentheses.
            else if(s.charAt(i) == '(') { OpenParenthesesStack.push(i); }
            //else it's locked and closed -> ")" so chk if you encounterd any
            //unlocked elements or "(" to make it valid.
            else{
                if(!OpenParenthesesStack.isEmpty()){
                    //if it's not empty we have a "(" to make it valid 
                    //spo pop out
                    OpenParenthesesStack.pop();
                }
                //else if it's empty stack we chk unlocked stack
                else{
                    if(!UnlockedElementStack.isEmpty()){
                        UnlockedElementStack.pop();
                    }
                    //else if it's also empty i'll retunn false caz you don't have
                    //any "(" parentheses nor we have any unlocked elements to
                    //flip it so just return false
                    else{
                        return false;
                    }
                }
            }
        }
    
    //we also have case that if my openparentheses index > unlockedelement 
    //i"ll return false caz i need "(" even before i encounter ")" one so 
    //that i can place "(" in before index of ")" one to make it valid.
    while(!OpenParenthesesStack.isEmpty() && !UnlockedElementStack.isEmpty() 
    && OpenParenthesesStack.peek() < UnlockedElementStack.peek()){
        //in this case we make a valid one by matching it so pop out
        OpenParenthesesStack.pop();
        UnlockedElementStack.pop();
    }

     //else it depends on stack and evenat the end if i left with any of 
     //"(" parentheses then it's invalid so just return;

     return OpenParenthesesStack.isEmpty() ? true : false;
    }
}