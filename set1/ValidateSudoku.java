package set1;

import java.util.List;
import java.util.ArrayList;

public class ValidateSudoku {

    int se[][] = {{0, 0}, {0, 3}, {0, 6}, {3, 0}, {3, 3}, {3, 6}, {6, 0}, {6, 3}, {6, 6}};
    List<java.util.List<Character>> missingNumber = new ArrayList();

    public void missingNumber(char board[][]) {

        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));
        missingNumber.add(new java.util.LinkedList(java.util.Arrays.asList(new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9'})));

        for (int i = 0; i < se.length; i++) {

            for (int m = se[i][0]; m < se[i][0] + 3; m++) {
                for (int n = se[i][1]; n < se[i][1] + 3; n++) {
                    java.util.List<Character> temp = missingNumber.get(i);
                    temp.remove(new Character(board[m][n]));
                }
            }

        }
    }

    public boolean isValid(char c[][], int i, int j) {
        for (int m = 0; m < 9; m++) {
            if (m != i && c[m][j] == c[i][j]) {
                return false;
            }
            if (m != j && c[i][m] == c[i][j]) {
                return false;
            }
        }
        return true;
    }

    public void solver(char c[][], int index) {

        if (index == 9) {
            if(isValid(c))disp(c);
            return;
        }

        for (int m = se[index][0]; m < se[index][0] + 3; m++) {
            for (int n = se[index][1]; n < se[index][1] + 3; n++) {
                if (c[m][n] == ' ') {
                    for (int i = 0; i < missingNumber.get(index).size(); i++) {
                        c[m][n] = missingNumber.get(index).remove(i);
                        if (isValid(c, m, n)) {
                            solver(c, index);
                        }
                        missingNumber.get(index).add(c[m][n]);
                        c[m][n] = ' ';
                    }
                }
            }
        }

        solver(c, index + 1);
    }

    public boolean isValid(char grid[][]) {

        java.util.Set<String> set = new java.util.HashSet();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (grid[i][j] != ' ') {
                    String b = "(" + grid[i][j] + ")";
                    if (!set.add(b + i) || !set.add(j + b) || !set.add(i / 3 + b + j / 3)) {
                        return false;
                    }
                } else return false;
            }
        }

        return true;
    }

    public void disp(char c[][]) {
        System.out.println("====================================");
        for (char ch[] : c) {
            System.out.println(java.util.Arrays.toString(ch));
        }
        System.out.println(missingNumber);
        System.out.println("====================================");
    }

    public void init() {

        char[][] grid
                = {
                {'5', ' ', ' ', ' ', '3', ' ', ' ', ' ', '4'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'8', ' ', ' ', ' ', '9', ' ', ' ', ' ', '7'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'2', ' ', ' ', ' ', '6', ' ', ' ', ' ', '1'}};

        missingNumber(grid);
        solver(grid, 0);
    }

    public static void main(String art[]) {
        new ValidateSudoku().init();
    }
}
