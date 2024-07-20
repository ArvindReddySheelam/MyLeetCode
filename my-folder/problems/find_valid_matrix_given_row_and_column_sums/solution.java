class Solution {

    public static int[][] restoreMatrix(int[] row_mat, int[] col_mat) {
        int m = row_mat.length;
        int n = col_mat.length;
        int[][] valid_matrix = new int[m][n];
        int row_ptr = 0;
        int col_ptr = 0;
        while (row_ptr <= m - 1 && col_ptr <= n - 1) {
            if (row_mat[row_ptr] <= col_mat[col_ptr]) {
                valid_matrix[row_ptr][col_ptr] = row_mat[row_ptr];
                row_mat[row_ptr] -= valid_matrix[row_ptr][col_ptr];
                col_mat[col_ptr] -= valid_matrix[row_ptr][col_ptr];
                row_ptr++;
            } else {
                valid_matrix[row_ptr][col_ptr] = col_mat[col_ptr];
                col_mat[col_ptr] -= valid_matrix[row_ptr][col_ptr];
                row_mat[row_ptr] -= valid_matrix[row_ptr][col_ptr];
                col_ptr++;
            }
        }
        return valid_matrix;
    }
}
