package ru.job4j.calculator;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double divideAndminus(double first, double second) {
        return ru.job4j.math.MathFunction.divide(first, second)
                + ru.job4j.math.MathFunction.minus(first, second);
    }

    public static double divideAndminusAndMultiplyAndsum(double first, double second) {
        return ru.job4j.math.MathFunction.divide(first, second)
                + ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.sum(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + divideAndminus(10, 20));
        System.out.println("Результат расчета равен: " + divideAndminusAndMultiplyAndsum(10, 20));
    }
}
