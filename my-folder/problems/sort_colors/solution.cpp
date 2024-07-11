class Solution {
public:
    void sortColors(vector<int>& nums) {
        int low = 0;
        int mid = 0;
        int high = nums.size() - 1;

       if(nums.size() == 0 || nums.size() == 1){
        return;
       }

       for(int i = 0; i<=nums.size()-1; i++){
         if(nums[mid] == 0){
            swap(nums[mid],nums[low]);
            low++;
            mid++;
         }else if(nums[mid] == 1){
            mid++;
         }else{
            swap(nums[mid],nums[high]);
            high--;
         }
       }
    }
};