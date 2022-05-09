package main;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MarkAndToys {
    public static int maximumToys(List<Integer> prices, int k) {
        Collections.sort(prices);
        int toysBought = 0;
        int walletDrainer = 0;
        for (int price : prices){
            walletDrainer += price;
            if (walletDrainer > k){
                break;
            } else {
                toysBought += 1;
            }
        }
        return toysBought;
    }
}
