package com.practice_package;

public class SudokuChecker {

    public static boolean isValidSudoku(char[][] board) {
        // Check rows
        for (int i = 0; i < 9; i++) {
            if (!isValidRow(board, i)) {
                return false;
            }
        }

        // Check columns
        for (int j = 0; j < 9; j++) {
            if (!isValidColumn(board, j)) {
                return false;
            }
        }

        // Check sub-matrices
        for (int i = 0; i < 9; i += 3) {
            for (int j = 0; j < 9; j += 3) {
                if (!isValidSubMatrix(board, i, j)) {
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean isValidRow(char[][] board, int row) {
        boolean[] visited = new boolean[9];

        for (int j = 0; j < 9; j++) {
            if (board[row][j] != '.') {
                int num = board[row][j] - '0';
                if (visited[num - 1]) {
                    return false;
                }
                visited[num - 1] = true;
            }
        }

        return true;
    }

    private static boolean isValidColumn(char[][] board, int col) {
        boolean[] visited = new boolean[9];

        for (int i = 0; i < 9; i++) {
            if (board[i][col] != '.') {
                int num = board[i][col] - '0';
                if (visited[num - 1]) {
                    return false;
                }
                visited[num - 1] = true;
            }
        }

        return true;
    }

    private static boolean isValidSubMatrix(char[][] board, int startRow, int startCol) {
        boolean[] visited = new boolean[9];

        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '0';
                    if (visited[num - 1]) {
                        return false;
                    }
                    visited[num - 1] = true;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (isValidSudoku(board)) {
            System.out.println("The Sudoku is correct!");
        } else {
            System.out.println("The Sudoku is not correct.");
        }
    }
}

/* PYTHON CODE FOR THE ABOVE JAVA PROGRAM ----- HAS SOME COMPILER ERRORS
#code
def isValidSudoku(board):

    #checking rows
    i = 0
    while i < 9:
        if isValidRow(board, i)==False:
            return False
        i += 1

    #checking columns
    i = 0
    while i < 9:
        if isValidColumn(board, i)==False:
            return False
        i += 1

    #checking submatrices
    i = 0
    j = 0
    while i < 9:
        while j < 9:
            if isValidSubMatrix(board, i, j)==False:
                return False
            j += 3
        i += 3

    #sudoku is valid
    return True

#validate row
def isValidRow(board, row):
    visited = [None]*9
    j = 0
    while j < 9:
        if board[row][j] != '.'==True:
            if visited[num - 1]==True:
                return False
            visited[num - 1] = True
        j += 1
    return True

#validate column
def isValidColumn(board, col):
    visited = [None]*9
    i = 0
    while i < 9:
        if board[i][col] != '.'==True:
            if visited[num - 1]==True:
                return False
            visited[num - 1] = True
        i += 1
    return True

#validate submatrix
def isValidSubMatrix(board, startRow, startCol):
    visited = [None]*9
    i = startRow
    while i < startRow + 3:
        while j < startCol + 3:
            if board[i][j] != '.'==True:
                if visited[num - 1]==True:
                    return False
                visited[num - 1] = True
            j += 1
        i += 1
    return True

board = [
    ['5', '3', '.', '.', '7', '.', '.', '.', '.'],
    ['6', '.', '.', '1', '9', '5', '.', '.', '.'],
    ['.', '9', '8', '.', '.', '.', '.', '6', '.'],
    ['8', '.', '.', '.', '6', '.', '.', '.', '3'],
    ['4', '.', '.', '8', '.', '3', '.', '.', '1'],
    ['7', '.', '.', '.', '2', '.', '.', '.', '6'],
    ['.', '6', '.', '.', '.', '.', '2', '8', '.'],
    ['.', '.', '.', '4', '1', '9', '.', '.', '5'],
    ['.', '.', '.', '.', '8', '.', '.', '7', '9']
]

if isValidSudoku(board)==True:
    print("The Sudoku is correct!")
else:
    print("The Sudoku is not correct.")

*/
