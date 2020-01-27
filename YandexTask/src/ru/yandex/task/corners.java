package ru.yandex.task;

public class corners {

    /* algorithm for the first left top value */
    public static void first_cell_top(int[][] matrix) {
        int one = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == 0 && j == 0){
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[0][0] == 1 && one < 2) {
            matrix[0][0] = 0;
        } else if (matrix[0][0] == 1 && one > 3) {
            matrix[0][0] = 0;
        } else if (matrix[0][0] == 0 && one == 3) {
            matrix[0][0] = 1;
        }
    }

    /* algorithm for the last right top value */
    public static void last_cell_top(int[][] matrix) {
        int one = 0;
        int stop = matrix[0].length - 3;
        for (int i = 0; i < 3; i++) {
            for (int j = matrix[i].length - 1; j >= stop; j--) {
                if (i == 0 && j == matrix[i].length - 1) {
                    j--;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[0][matrix[0].length - 1] == 1 && one < 2) {
            matrix[0][matrix[0].length - 1] = 0;
        } else if (matrix[0][matrix[0].length - 1] == 1 && one > 3) {
            matrix[0][matrix[0].length - 1] = 0;
        } else if (matrix[0][matrix[0].length - 1] == 0 && one == 3) {
            matrix[0][matrix[0].length - 1] = 1;
        }
    }

    /* algorithm for the first left bottom value */
    public static void first_cell_bot(int[][] matrix) {
        int one = 0;
        int stop = matrix.length - 3;
        for (int i = matrix.length - 1; i >= stop; i--) {
            for (int j = 0; j < 3; j++) {
                if (i == matrix.length - 1 && j == 0) {
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[matrix.length - 1][0] == 1 && one < 2) {
            matrix[matrix.length - 1][0] = 0;
        } else if (matrix[matrix.length - 1][0] == 1 && one > 3) {
            matrix[matrix.length - 1][0] = 0;
        } else if (matrix[matrix.length - 1][0] == 0 && one == 3) {
            matrix[matrix.length - 1][0] = 1;
        }
    }

    /* algorithm for the last right bottom value */
    public static void last_cell_bot(int[][] matrix) {
        int one = 0;
        int stop_h = matrix.length - 3;
        int stop_l = matrix[0].length - 3;
        for (int i = matrix.length - 1; i >= stop_h; i--){
            for (int j = matrix[i].length - 1; j >= stop_l; j--){
                if (i == matrix.length - 1 && j == matrix[i].length - 1){
                    j--;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] == 1 &&
                one < 2) {
            matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] = 0;
        } else if (matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] == 1 &&
                one > 3) {
            matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] = 0;
        } else if (matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] == 0 &&
                one == 3) {
            matrix[matrix.length - 1][matrix[matrix.length - 1].length - 1] = 1;
        }
    }
}
