package jour03.job08;

import java.util.Arrays;

public class job08 {
    public static void main(String[] args) {
        int[][] matrix = {{5, 9, 3}, {7, 2, 8}, {1, 6, 4}};
        int[] values = new int[9];

        int pos = 0;
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix.length; y++) {
                values[pos] = matrix[x][y];
                ++pos;
            }
        }
        Arrays.sort(values);
        pos = 0;
        for (int i = 0; i < matrix.length; ++i){
            for (int j = 0; j < matrix.length; ++j){
                matrix[i][j] = values[pos];
                ++pos;
            }
        }
        System.out.print(Arrays.deepToString(matrix));
    }
}
