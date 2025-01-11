class Solution {
    public int removeDuplicates(int[] nums) {

        if(nums.length == 0) return -1;

        int count = 1;
        int index = 1;

        for(int j = 1; j<=nums.length-1; j++){
            if(nums[j] == nums[j-1]){
               count++;
            }else{
                count = 1;
            }
            if(count <= 2){
              nums[index] = nums[j];
              index++;
            }
        }

        return index;
    }
}