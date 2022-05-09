package main;

import java.util.ArrayList;
import java.util.List;

public class LeftRotationArray {
    public static List<Integer> rotLeft(List<Integer> a, int d) {
        var secondHalf = a.subList(d%a.size(), a.size());
        var firstHalf = a.subList(0, d%a.size());
        var result = new ArrayList<Integer>();
        result.addAll(secondHalf);
        result.addAll(firstHalf);
        return result;
    }
}
