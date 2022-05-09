package main;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class SalesByMatch {

    public static void main(String[] args) {
        int a = 7;

        List<Integer> list = new ArrayList<>(Arrays.asList(1, 2, 1, 2, 1, 3, 2));
        System.out.println(sockMerchant(a, list));
    }

    public static int sockMerchant(int n, List<Integer> ar) {
        return ar.stream()
                .collect(groupingBy(Function.identity(), counting()))
                .values()
                .stream()
                .map(Long::intValue)
                .reduce(0, (total, c) -> total + c / 2);
    }
}
