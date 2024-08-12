class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        if(nums.size() == 0 || nums.size() == 1){
            return nums;
        }
         int n = nums.size();
         std::vector<int> arr;
         arr.reserve(n);
         std::vector<int> left;
         left.reserve(n);
         std::vector<int> right;
         right.reserve(n);

        left[0] = 1;
        for(int i = 1; i<=nums.size()-1; i++){
            left[i] = left[i-1] * nums[i-1];
        }

        right[nums.size()-1] = 1;
        for(int i = nums.size()-2; i>=0; i--){
            right[i] = right[i+1] * nums[i+1];
        }

        for(int i = 0; i<=nums.size()-1; i++){
            int res = left[i] * right[i];
            arr.emplace_back(res);
        }

        return arr;
    }
};