package ru.job4j.calculator;


import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double divideAndminus(double first, double second) {
        return divide(first, second)
                + minus(first, second);
    }

    public static double divideAndminusAndMultiplyAndsum(double first, double second) {
        return divide(first, second)
                + minus(first, second)
                + multiply(first, second)
                + sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divideAndminus(10, 20));
        System.out.println("Результат расчета равен: " + divideAndminusAndMultiplyAndsum(10, 20));
    }
}
