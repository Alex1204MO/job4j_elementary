package ru.job4j.array;

import java.util.Arrays;

public class Machine {
    public static int[] change(int money, int price) {
        int[] coins = {10, 5, 2, 1}, rsl = new int[100];
        int size = 0, oddMoney = money - price;
        for (int coin : coins) {
            while (oddMoney >= coin) {
                rsl[size++] = coin;
                oddMoney -= coin;
            }
        }
        return Arrays.copyOf(rsl, size);
    }
}

