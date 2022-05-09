package main;

import java.util.Arrays;
import java.util.List;

public class JumpingOnTheClouds {
    public static void main(String[] args) {
        System.out.println(jumpingOnClouds(Arrays.asList(0,1,0,0,0,1,0)));
    }
    public static int jumpingOnClouds(List<Integer> c) {
        int jumps = 0;
        int maximumJump = 2;
        int i = 0;
        while (i < c.size()-2){
            if (i+2 == c.size()){
                jumps += 1;
                break;
            }
            if (c.get(i+2) == 0){
                i += 2;
            } else if (c.get(i+1) == 0){
                i += 1;
            }
            jumps += 1;
        }

        return jumps;
    }
}
