class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();
        int[] arr = new int[2];
        for(int i = 0; i<=nums.length-1; i++){
            int ans = target - nums[i];
            if(map.containsKey(ans)){
                arr[0] = map.get(ans);
                arr[1] = i;
                break;
            }else{
                map.put(nums[i],i);
            }
        }
            return arr;
    }
}