class Solution {
    public void rotate(int[][] matrix) {
        // Transpose Of The Matrix
        for(int i = 0; i<=matrix.length-1; i++){
            for(int j = i; j<matrix.length; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        // Revesersing The Rows Of a Transpose Matrix
        for(int i = 0; i<=matrix.length-1; i++){
        int[] row = matrix[i];
             int start = 0;
            int end = row.length-1;
             while(start<end){
                 int temp = row[start];
                 row[start] = row[end];
                 row[end] = temp;
                 start++;
                end--;
             }
        }
    }
}