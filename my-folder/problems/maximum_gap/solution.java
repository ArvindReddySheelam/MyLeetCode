class Solution {
    public int maximumGap(int[] nums) {
        Arrays.sort(nums);
        if(nums.length<2){
            return 0;
        }
        int maxdiff = 0;
        int currentdiff = 0;
        for(int i = 0; i<nums.length-1; i++){
         currentdiff = nums[i+1] - nums[i];
          if(currentdiff>maxdiff){
            maxdiff = currentdiff;
        }
        }
        return maxdiff;
    }
}