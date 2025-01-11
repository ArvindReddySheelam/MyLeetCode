class Solution {
public:
    int majorityElement(vector<int>& nums) {
        if(nums.size() == 0 || nums.empty()){
            return -1;
        }
        //Naive approach is O(n^2) Better Using HashMap but tc = O(nlogn) + O(n)
        //optimal using Moor's Voting Algorithm

        int count = 0;
        int element = 0;
        for(int i = 0; i<=nums.size()-1; i++){
            if(count == 0){
                //set count - 1 and take ele at i
                count = 1;
                element = nums[i];
            }
            else if(nums[i] == element){
                count++;
            }else{
                count--;
            }
        }
        
        //Now my count holds certain frequency of the element and my ele holds certain element.
        //from the array so now i need check in-total how many time the     particular element has appeard in my array after that check the condition of n/2. 
        int count1 = 0;
        for(int i = 0; i<=nums.size()-1; i++){
            if(nums[i] == element){
                count1++;
            }
        }
        
        return (count1 > (nums.size()/2)) ? element : -1;
    }
};