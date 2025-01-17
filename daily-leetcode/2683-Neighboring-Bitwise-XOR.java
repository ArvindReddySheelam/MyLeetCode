class Solution {
    public boolean doesValidArrayExist(int[] derived) {
                //so basically -> a xor b = 1
                    //    b xor c = 1
                    //    c xor a = 0
                    //Here each element is repeated twice which mean they cancel
                    //out each other therfore - X ^ X = 0(same 0)
                    //                          X ^ 0 = X(diff 1)
                    // so , if check derived 1 1 0
                    // 1 ^ 1 = 0, 1 ^ 0 = 1, 0 ^ 1 = 1 - two time repeatation
                    // so if  a xor b = 1 this want to hold true means 
                    //        b xor c = 1
                    //        c xor a = 0
                    // the a,b,c terms should cancel out each other mean they 
                    //should become zero then this holds true 
                    //                              else false

            int res = 0;
            for(int num : derived){
                res ^= num;
            }

            return (res == 0) ? true :false;
    }
}