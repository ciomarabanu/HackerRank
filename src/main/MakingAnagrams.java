package main;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Stream;
import java.lang.Math;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.counting;

public class MakingAnagrams {
    public static void main(String[] args) {
        System.out.println(makeAnagram("abzsdccfgh", "cdefgh"));
    }
    public static int makeAnagram(String a, String b) {

        var mappedA = Stream.of(a.split(""))
                    .collect(groupingBy(Function.identity(), counting()));
        var mappedB = Stream.of(b.split(""))
                    .collect(groupingBy(Function.identity(), counting()));

        long [] result = new long[26];

        for (int i = 0; i < 26; i++){
            var currentLetter = Character.toString((char)(i +'a'));
            if (mappedA.containsKey(currentLetter)){
                result[i] += mappedA.get(currentLetter);
            }
            if (mappedB.containsKey(currentLetter)){
                result[i] -= mappedB.get(currentLetter);
            }

        }
        var r =  (int)Arrays.stream(result)
                .map(Math::abs)
                .reduce(0L, Long::sum);
        return r;
    }
}
