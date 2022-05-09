package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class BidimensionalArrays {
    public static void main(String[] args) {
        List<List<Integer>> arr = new ArrayList<>();
        arr.add(Arrays.asList(-9, -9, -9, 1, 1, 1 ) );
        arr.add(Arrays.asList( 0, -9,  0, 4, 3, 2 ) );
        arr.add(Arrays.asList(-9, -9, -9, 1, 2, 3 ) );
        arr.add(Arrays.asList( 0,  0,  8, 6, 6, 0 ) );
        arr.add(Arrays.asList( 0,  0,  0,-2, 0, 0 ) );
        arr.add(Arrays.asList( 0,  0,  1, 2, 4, 0 ) );
        System.out.println(hourglassSum(arr));
    }
    public static int hourglassSum(List<List<Integer>> arr) {

        int hgSum = 0;
        int row = 0;
        int col = 0;
        List<Integer>sums = new ArrayList<>();

        do {
            hgSum = arr.get(row).get(col) + arr.get(row).get(col + 1) + arr.get(row).get(col + 2)
                    + arr.get(row + 1).get(col + 1)
                    + arr.get(row + 2).get(col) + arr.get(row + 2).get(col + 1) + arr.get(row + 2).get(col + 2);
            sums.add(hgSum);
            if (col == 3) {
                col = 0;
                row += 1;
            }else{
                col += 1;
            }

        } while (row <= 3);

        int hourglassSum = 0;
    return Collections.max(sums);
    }
}
