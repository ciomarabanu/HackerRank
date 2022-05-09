package main;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class MinAbsDiffArr {

    public static int minimumAbsoluteDifference(List<Integer> arr) {
        int result = Integer.MAX_VALUE;
        Collections.sort(arr);
        for (int i = 0; i < arr.size()-1; i++){
            int absDiff = Math.abs(arr.get(i) - arr.get(i+1));
            if (result > absDiff){
                result = absDiff;
            }
        }
        return result;
    }
}
