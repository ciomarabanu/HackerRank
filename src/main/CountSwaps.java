package main;

import java.util.Collections;
import java.util.List;

public class CountSwaps {
    public static void countSwaps(List<Integer> a) {
        int swapCount = 0;
        for (int i = 0; i < a.size(); i++) {
            for (int j = 0; j < a.size() - 1; j++) {
                if (a.get(j) > a.get(j + 1)) {
                    Collections.swap(a, j, j+1);
                    swapCount += 1;
                }
            }

        }
        System.out.println("Array is sorted in " + swapCount + " swaps.");
        System.out.println("First Element: " + a.get(0)) ;
        System.out.println("Last Element: " + a.get(a.size()-1)) ;

    }
}
