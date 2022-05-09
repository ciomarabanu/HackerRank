package main;

import java.lang.reflect.Array;
import java.util.HashSet;
import java.util.function.Function;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class TwoStrings {
    public static void main(String[] args) {
        System.out.println(twoStrings("", "efgh"));
    }
    public static String twoStrings(String s1, String s2) {
//        var mappedS1 = Stream.of(s1.split(""))
//                .collect(groupingBy(Function.identity(), counting()));
//
//        var mappedS2 = Stream.of(s2.split(""))
//                .collect(groupingBy(Function.identity(), counting()));

        HashSet<Character> h1 = new HashSet<Character>(), h2 = new HashSet<Character>();
        for(int i = 0; i < s1.length(); i++)
        {
            h1.add(s1.charAt(i));
        }
        for(int i = 0; i < s2.length(); i++)
        {
            h2.add(s2.charAt(i));
        }
        h1.retainAll(h2);
        if (h1.isEmpty()){
            return "NO";
        }else {
            return "YES";
        }
    }
}
