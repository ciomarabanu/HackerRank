package main;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;


public class BeautifulPairs {
    public static void main(String[] args) {
        var A = new ArrayList<Integer>();
        var B = new ArrayList<Integer>();
        A.add(3);
        A.add(5);
        A.add(7);
        A.add(11);
        A.add(5);
        A.add(8);

        B.add(5);
        B.add(7);
        B.add(11);
        B.add(10);
        B.add(5);
        B.add(8);

        System.out.println(beautifulPairs(A,B));
    }

    public static int beautifulPairs(List<Integer> A, List<Integer> B) {
        var parsedA = A.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        var parsedB = B.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(parsedA);
        System.out.println(parsedB);

        return 0;
    }
}
