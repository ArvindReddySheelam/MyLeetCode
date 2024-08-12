class Solution {
    public int[] productExceptSelf(int[] nums) {
        if(nums.length == 0 || nums.length == 1){
            return nums;
        }
        int[] arr = new int[nums.length];
        int[] left = new int[nums.length];
        int[] right = new int[nums.length];

        left[0] = 1;
        for(int i = 1; i<=nums.length-1; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.length-1] = 1;
        for(int i = nums.length-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0; i<=nums.length-1; i++){
            arr[i] = left[i] * right[i];
        }

        return arr;
    }
}