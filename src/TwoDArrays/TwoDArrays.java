package TwoDArrays;

import java.util.Arrays;

public class TwoDArrays {
    public static void main(String[] args) {

        char[][] board = new char [3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j || j == i){
                    board[i][j] = 'o';
                }else {
                    board[i][j] = '-';
                }
            }
        }
        System.out.println(Arrays.deepToString(board));
    }
}
