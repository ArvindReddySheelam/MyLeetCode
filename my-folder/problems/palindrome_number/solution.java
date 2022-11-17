class Solution {
    public boolean isPalindrome(int x) {
         if(x<0)
            return false;
        int rev=0; int y=x;
        while(y>0)
        {
            int z=y%10;
            rev=rev*10+z;
            y=y/10;
        }
        if(rev==x)
            return true;
        else 
            return false;
    }
    }