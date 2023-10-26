class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> result = new ArrayList<>();
        int i = 0;
        while(i<nums.length){
      int correct_index = nums[i] - 1;
      if(nums[i] != nums[correct_index]){
     int temp = nums[i];
     nums[i] = nums[correct_index];
     nums[correct_index] = temp;
      }
      else{
          i++;
      }
        }
        for(int j  = 0; j<nums.length; j++){
             if(nums[j] != j+1){
      result.add(j+1);
             }
        }
        return result;
    }
}