package main;

public class RepeatedString {
    public static void main(String[] args) {
        System.out.println(repeatedString("aba", 10));
    }

    public static long repeatedString(String s, long n) {
        // Write your code here
        char[] charS = s.toCharArray();
        int aCount = 0;

        long uncheckedLetters = n % s.length();
        for (char aChar : charS) {
            if (aChar == 'a') {
                aCount += 1;
            }
        }

        long aCountRepeated = aCount * (n / s.length());

        for (int i = 0; i < uncheckedLetters; i++) {
            if (charS[i] == 'a') {
                aCountRepeated += 1;
            }
        }
        return aCountRepeated;

    }
}
