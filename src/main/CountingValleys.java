package main;

import java.util.Arrays;

public class CountingValleys {
    public static int countingValleys(int steps, String path) {
        int stepsFromSealevel = 0;
        boolean previouslyDescended = false;
        char[] pathOfChars = path.toCharArray();
        int valleyCounter = 0;

        for (char step : pathOfChars){
            if (step == 'D'){
                stepsFromSealevel -= 1;
                previouslyDescended = true;
            } else {
                stepsFromSealevel += 1;
                previouslyDescended = false;
            }
            if (stepsFromSealevel == 0 && !previouslyDescended){
                valleyCounter += 1;
            }
        }
        return valleyCounter;
    }

//    public static int countingValleysReloaded(int steps, String path){
//
////        nu merge
//
//        ValleyAcc initialAcc = new ValleyAcc(0, 0, false);
//        ValleyAcc finalAcc = path.chars().reduce(initialAcc, (ValleyAcc acc, char direction) -> {
//            var newAltitude = direction == 'U'? acc.altitude + 1 : acc.altitude - 1;
//            var newAscended = direction == 'U';
//            var newValleys = newAscended && newAltitude == 0? acc.valleys + 1 : acc.valleys;
//            return new ValleyAcc(newAltitude, newValleys, newAscended);
//        });
//        return finalAcc.valleys;
//    }
//
//    record ValleyAcc(int altitude, int valleys, boolean ascended) {}
}


