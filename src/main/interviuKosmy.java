package main;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

public class interviuKosmy {
    public static void main(String[] args) {
        List<String> input = new ArrayList<>();
//        ac, ba, aab, caa, ddd, dd, ca
        input.add("ac");
        input.add("ba");
        input.add("aab");
        input.add("caa");
        input.add("ddd");
        input.add("dd");
        input.add("ca");

        stringSet(input);
    }
    public static void stringSet(List<String> s){
        List<List<String>> result =  new ArrayList<>();
        for (String word : s){
            boolean groupFound = false;
            for (int i = 0; i < result.size(); i++){
                var group = result.get(i);
                if (charset(word).equals(charset(group.get(0)))){
                    group.add(word);
                    groupFound = true;
                }
            }
            if (!groupFound){
                var newGroup = new ArrayList<String>();
                newGroup.add(word);
                result.add(newGroup);
            }
        }
//        System.out.println(result.get(0).get(0));
        for (var group: result){
            System.out.println(group.get(0) + ": " + String.join(", ", group));
        }
    }

    private static Set<Integer> charset(String obosit){
        return obosit.chars().boxed().collect(Collectors.toSet());
    }
}
