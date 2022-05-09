package main;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

class SherlockAndTheValidString {

    public static void main(String[] args) {
        String input = "aabbccddeefghi";
        System.out.println(validOrInvalid(input));
    }

    private static String validOrInvalid(String s) {
        int lettersInAlphabet = 26;
        int[] acc = new int[lettersInAlphabet];
        s.chars().forEach(c -> acc[c - 'a'] += 1);
        Map<Integer, Long> countGroups = Arrays.stream(acc).boxed()
                .filter(elem -> elem > 0)
                .collect(groupingBy(Function.identity(), counting()));

        if (countGroups.size() > 2){
            return "NO";
        }
        if (countGroups.size() == 1){
            return "YES";
        }
        if (!countGroups.containsValue(1L)){
            return "NO";
        }
        var keys = new ArrayList<>(countGroups.keySet());
        var keysDelta = Math.abs(keys.get(0) - keys.get(1));
        if (countGroups.containsValue(1L) || keysDelta == 1 ){
            return "YES";
        }

        return "NO";
    }

}
