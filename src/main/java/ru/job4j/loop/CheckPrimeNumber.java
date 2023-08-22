package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int finish) {
        boolean result = true;
        if (finish < 2) {
            result = false;
        }
        for (int i = 2; i < finish; i++) {
            if (finish % i == 0) {
                result = false;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(check(12));
    }
}












