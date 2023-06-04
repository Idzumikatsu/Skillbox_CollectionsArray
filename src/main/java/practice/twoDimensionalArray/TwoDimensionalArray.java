package practice.twoDimensionalArray;

import java.util.Arrays;

public class TwoDimensionalArray {

    public static final char SYMBOL = 'X';

    public static char[][] getTwoDimensionalArray(int size) {

        char[][] arr = new char[size][size];

        for (char[] chars : arr) {
            Arrays.fill(chars, ' ');
        }
        
        for (int i = 0, j = 0, k = arr[j].length - 1 - j; i < arr.length; j++, k--, i++) {
            arr[i][j] = SYMBOL;
            arr[i][k] = SYMBOL;
        }
        return arr;
    }
}
