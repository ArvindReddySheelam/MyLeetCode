class Solution {
public:
   vector<int> nextPermutation(vector<int> &arr)
{
    //  Write your code here.
    int n = arr.size();
    int index = -1;
    for(int i = n-2; i>=0; i--){
        if(arr[i] < arr[i+1]){
            index = i;
            break;
        }
    }
    if(index == -1){
        reverse(arr.begin(),arr.end());
        return arr;
    }

    for(int i = n-1; i>=0; i--){
        if(arr[i] > arr[index]){
            std::swap(arr[i],arr[index]);
            break;
        }
    }
   std:: reverse(arr.begin() + index + 1, arr.end());
    return arr;
}
};