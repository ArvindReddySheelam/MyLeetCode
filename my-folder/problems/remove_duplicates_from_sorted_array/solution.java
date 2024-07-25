class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int j = 1;

        while(j <= nums.length-1){
            if(nums[i] != nums[j]){
                i++;
                nums[i] = nums[j];
            }
            j++;
        }

        return i+1;
    }
}