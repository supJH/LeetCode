package leet240.search_2D_matrix_II;

/*Write an efficient algorithm that searches for a value in an m x n matrix. This matrix has the following properties:

        Integers in each row are sorted in ascending from left to right.
        Integers in each column are sorted in ascending from top to bottom.
        For example,

        Consider the following matrix:

        [
        [1,   4,  7, 11, 15],
        [2,   5,  8, 12, 19],
        [3,   6,  9, 16, 22],
        [10, 13, 14, 17, 24],
        [18, 21, 23, 26, 30]
        ]
        Given target = 5, return true.

        Given target = 20, return false.*/

public class Leet240 {

    public static void main(String[] args) {
        Leet240 l = new Leet240();
        int[][] matrix = {{1,   4,  7, 11, 15},{2,   5,  8, 12, 19},{3,   6,  9, 16, 22},{10, 13, 14, 17, 24},{18, 21, 23, 26, 30}};
        System.out.println(l.searchMatrix(matrix,20));
    }

    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null) return false;
        int i = matrix.length - 1;
        int j = 0;
        while (i >= 0 && j < matrix[i].length) {
            if (matrix[i][j] > target) {
                i--;
            } else if (matrix[i][j] < target) {
                j++;
            }else{
                return true;
            }
        }
        return false;
    }

}
