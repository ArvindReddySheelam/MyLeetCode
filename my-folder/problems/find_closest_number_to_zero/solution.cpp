class Solution {
public:
    int findClosestNumber(vector<int>& nums) {
        int closest = nums[0];

        for (auto ele : nums) {
            if (std::abs(ele) < std::abs(closest)) {
                closest = ele;
            }
        }
        if (closest < 0 && std::find(begin(nums), end(nums),
                                     std::abs(closest)) != nums.end()) {
            return std::abs(closest);
        } else {
            return closest;
        }
    }
};