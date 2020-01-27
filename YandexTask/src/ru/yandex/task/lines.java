package ru.yandex.task;

public class lines {

    /*algorithm for the first line*/
    public static void zero_line(int[][] matrix, int x) {
        int one = 0;
        int start = x - 1;
        int stop = x + 1;
        for (int i = 0; i < 3; i++) {
            for (int j = start; j <= stop; j++) {
                if (i == 0 && j == x){
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[0][x] == 1 && one < 2) {
            matrix[0][x] = 0;
        } else if (matrix[0][x] == 1 && one > 3) {
            matrix[0][x] = 0;
        } else if (matrix[0][x] == 0 && one == 3) {
            matrix[0][x] = 1;
        }
    }

    /*algorithm for the left side*/
    public static void left_line(int[][] matrix, int y) {
        int one = 0;
        int start = y - 1;
        int stop = y + 1;
        for (int i = start; i <= stop; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == y && j == 0) {
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[y][0] == 1 && one < 2) {
            matrix[y][0] = 0;
        } else if (matrix[y][0] == 1 && one > 3) {
            matrix[y][0] = 0;
        } else if (matrix[y][0] == 0 && one == 3) {
            matrix[y][0] = 1;
        }
    }

    /*algorithm for the right side*/
    public static void right_line(int[][] matrix, int y, int x) {
        int one  = 0;
        int start = y - 1;
        int stop = y + 1;
        int line_stop = x - 2;
        for (int i = start; i <= stop; i++) {
            for (int j = x; j >= line_stop; j--) {
                if (i == y && j == x){
                    j--;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[y][x] == 1 && one < 2) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 1 && one > 3) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 0 && one == 3) {
            matrix[y][x] = 1;
        }
    }

    /*algorithm for the last line*/
    public static void last_line(int[][] matrix, int y, int x) {
        int one = 0;
        int start = x - 1;
        int stop = x + 1;
        int line_stop = y - 2;
        for (int i = y; i >= line_stop; i--) {
            for (int j = start; j <= stop; j++) {
                if (i == y && j == x) {
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[y][x] == 1 && one < 2) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 1 && one > 3) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 0 && one == 3) {
            matrix[y][x] = 1;
        }

    }

    /*algorithm for the middle values*/
    public static void middle_lines(int[][] matrix, int y, int x) {
        int one = 0;
        int start_y = y - 1;
        int stop_y = y + 1;
        int start_x = x - 1;
        int stop_x = x + 1;
        for (int i = start_y; i <= stop_y; i++) {
            for (int j = start_x; j <= stop_x; j++) {
                if (i == y && j == x) {
                    j++;
                }
                switch (matrix[i][j]) {
                    case 1:
                        one++;
                        break;
                }
            }
        }
        if (matrix[y][x] == 1 && one < 2) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 1 && one > 3) {
            matrix[y][x] = 0;
        } else if (matrix[y][x] == 0 && one == 3) {
            matrix[y][x] = 1;
        }
    }
}
