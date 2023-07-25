class Solution {
    public boolean containsDuplicate(int[] nums) {
       Set<Integer> set = new HashSet<>();
       for(int i = 0; i<=nums.length-1; i++){
           int element = nums[i];
           if(!set.contains(element)){
               set.add(element);
           }else{
                   set.remove(element);
                   return true;
           }
       }
       return false;
    }
}