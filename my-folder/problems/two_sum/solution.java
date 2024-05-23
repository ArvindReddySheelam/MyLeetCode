class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = {-1,-1};
        for(int i = 0; i<nums.length; i++){
            int b = target - nums[i];
            if(map.containsKey(b)){
              arr[1] = i;
              arr[0] = map.get(b);
              return arr;
            }
            map.put(nums[i],i);
        }
        return arr;
    }
}