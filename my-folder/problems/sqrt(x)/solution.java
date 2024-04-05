class Solution {
    public int mySqrt(int x) {

        if(x == 1 || x == 0){
            return x;
        }
        int low = 1;
        int high = x/2;
        int res = 0;

        while(low <= high){
            int mid = low + (high - low)/2;
            if(mid * mid == x){
                return mid;
            }else if((long)mid * mid < x){
                low = mid + 1;
                res = mid;
            }else{
                high = mid - 1;
            }
        }

        return res;
    }
}