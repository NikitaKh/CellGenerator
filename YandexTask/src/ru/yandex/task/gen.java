package ru.yandex.task;

public class gen {

        /* random map generator */
        public static void map_gen(int x, int y) {
            int[][] matrix = new int[x][y];
            for (int i = 0; i < x; i++) {
                for (int j = 0; j < y; j++) {
                    matrix[i][j] = (int) (Math.random() * 2);
                }
            }
                counter(matrix);
        }

        /* magic happen here */
        public static int counter(int[][] matrix) {
            reader.print(matrix);
                for (int i = 0; i < matrix.length; i++) {
                    for (int j = 0; j < matrix[i].length; j++) {
                        if (i == 0 && j == 0) {
                            corners.first_cell_top(matrix);
                        }
                        if (i == 0 && j == matrix[i].length - 1) {
                            corners.last_cell_top(matrix);
                        }
                        if (i == matrix.length - 1 && j == 0) {
                            corners.first_cell_bot(matrix);
                        }
                        if (i == matrix.length - 1 &&
                                j == matrix[matrix.length - 1].length - 1) {
                            corners.last_cell_bot(matrix);
                        }
                        if (i == 0 && (j >= 1 && j < matrix[i].length - 1)) {
                            lines.zero_line(matrix, j);
                        }
                        if ((i >= 1 && i < matrix.length - 1) && j == 0) {
                            lines.left_line(matrix, i);
                        }
                        if ((i >= 1 && i < matrix.length - 1) && j == matrix[i].length - 1) {
                            lines.right_line(matrix, i, j);
                        }
                        if (i == matrix.length - 1 && (j >= 1 && j < matrix[i].length - 1)) {
                            lines.last_line(matrix, i, j);
                        }
                        if ((i >= 1 && i <= matrix.length - 2) && (j >= 1 && j <= matrix[i].length - 2)) {
                            lines.middle_lines(matrix, i, j);
                        }
                    }
                }
                int[][] subMatrix = matrix;
                return(counter(subMatrix));
        }
}
