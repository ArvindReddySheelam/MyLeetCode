class Solution {
public:
    string kthDistinct(vector<string>& arr, int k) {

       std::unordered_map<std::string,int> umap;

       for(int i = 0; i<=arr.size()-1; i++){
          umap[arr[i]]++;
       }

       for(auto ele : arr){
          if(umap[ele] == 1){
            k--;
          }
          if(k == 0){
            return ele;
          }
       }
       return "";
    }
};