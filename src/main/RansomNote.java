package main;

import java.util.List;
import java.util.function.Function;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class RansomNote {

    public static void main(String[] args) {
//        System.out.println(checkMagazine(););
    }

    public static void checkMagazine(List<String> magazine, List<String> note) {
        var hashmappedMagazine = magazine
                .stream()
                .collect(groupingBy(Function.identity(), counting()));
        var hashmappedNote = note
                .stream()
                .collect(groupingBy(Function.identity(), counting()));

        boolean hasAllWords = true;

        for (String word : hashmappedNote.keySet()){
            if (hashmappedMagazine.containsKey(word) &&
                    hashmappedNote.get(word) - hashmappedMagazine.get(word) <= 0){
                hasAllWords = true;
            } else {
                hasAllWords = false;
                break;
            }
        }
        if (hasAllWords){
            System.out.println("Yes");
        }else {
            System.out.println("No");
        }

    }
}
