package ru.job4j.puzzle;

public class Win {
    public static boolean check(int[][] board) {
        for (int row = 0; row < board.length; row++) {
            if (board[row][row] == 1 && (checkHorizontal(board, row)
                    || checkVertical(board, row))) {
                return true;
            }
        }
        return false;
    }

    public static boolean checkHorizontal(int[][] board, int row) {
        for (int cell = 0; cell < board[row].length; cell++) {
            if (board[row][cell] != 1) {
                return false;
            }
        }
        return true;
    }

    public static boolean checkVertical(int[][] board, int column) {
        for (int[] numbers : board) {
            if (numbers[column] != 1) {
                return false;
            }
        }
        return true;
    }
}
