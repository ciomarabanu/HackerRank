package main;

import java.util.*;

public class LuckBalance {
    public static void main(String[] args) {
        List<List<Integer>> input = new ArrayList<>();
        input.add(Arrays.asList(5,1) );
        input.add(Arrays.asList(2,1) );
        input.add(Arrays.asList(8,1) );
        input.add(Arrays.asList(1,1) );
        input.add(Arrays.asList(10,0) );
        input.add(Arrays.asList(5,0) );
        System.out.println(luckBalance(3, input));
    }
    public static int luckBalance(int k, List<List<Integer>> contests) {
        Comparator<List<Integer>> cmp = new Comparator<List<Integer>>() {
            @Override
            public int compare(List<Integer> contest1 , List<Integer> contest2) {
                return Integer.compare(contest1.get(0), contest2.get(0));
            }
        };
        contests.sort(Collections.reverseOrder(cmp));

        int luckBalance = 0;
        for (List<Integer> contest : contests){
            if (contest.get(1) == 0){
                luckBalance += contest.get(0);
            }
            if (contest.get(1) == 1){
                if  (k > 0) {
                    luckBalance += contest.get(0);
                    k -= 1;
                }else {
                    luckBalance -= contest.get(0);
                }
            }
        }
        return luckBalance;
    }
}
