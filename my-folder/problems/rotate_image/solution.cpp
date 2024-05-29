class Solution {
public:
    void rotate(vector<vector<int>>& matrix) {
    //Transpose Of The Matrix
     for(int i = 0; i<=matrix.size()-1; i++){
        for(int j = i; j<=matrix[0].size()-1; j++){
            int temp = matrix[i][j];
            matrix[i][j] = matrix[j][i];
            matrix[j][i] = temp;
        }
     }
     //reverse the each row
      for(int i = 0; i<=matrix.size()-1; i++){
        std::reverse(matrix[i].begin(),matrix[i].end());
      }
    }
};