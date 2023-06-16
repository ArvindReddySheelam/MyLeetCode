class Solution {
    public int reverse(int x) {
    
     long y = 0;
      while(x != 0){
          int d = x%10;
            y = y*10+d;
          x = x/10;
      }
   
      if(y>Integer.MAX_VALUE ||y<Integer.MIN_VALUE){
            return 0;
      }
       if(x<0){
          return(int)(-1*y);
      }
      return (int)y;
    }
}