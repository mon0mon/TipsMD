package arrayLoop;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ArrayLoop {
    public static void main(String[] args) {
        int[][] ary2d = new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        for (int i = 0; i < ary2d.length; i++) {
            for (int j = 0; j < ary2d[i].length; j++) {
                System.out.print(ary2d[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (int[] holder :
                ary2d) {
            for (int item :
                    holder) {
                System.out.print(item + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println(Arrays.deepToString(ary2d));
    }
}