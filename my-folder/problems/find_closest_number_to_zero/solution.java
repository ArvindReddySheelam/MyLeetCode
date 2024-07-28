class Solution {
    public int findClosestNumber(int[] nums) {
        //initial closest in nums
        int closest = nums[0];

        //traverse nums and take the smallest
        for(int ele : nums){
            if(Math.abs(ele) < Math.abs(closest)){
                closest = ele;
            }
        }
        //check whether result present in nums if return abs(result)
        if(closest < 0 && isPresent(nums,closest)){
            return Math.abs(closest);
        }else{
            return closest;
        }
    }
    public static boolean isPresent(int[] nums,int closest){
        for(int ele : nums){
            if(ele == Math.abs(closest)){
                return true;
            }else{
                continue;
            }
        }
        return false;
    }
}