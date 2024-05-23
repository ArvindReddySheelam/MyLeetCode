class Solution {
public:
    vector<int> twoSum(vector<int>& nums, int target) {
        std::vector<int> vec{-1,-1};
        std::unordered_map<int,int> un_map;
        for(int i = 0; i<nums.size(); i++){
            int b = target - nums[i];
            if(un_map.find(b) != un_map.end()){
                vec[0] = un_map[b];
                vec[1] = i;
                return vec;
            }
            un_map[nums[i]] = i;
        }
        return vec;
    }
};