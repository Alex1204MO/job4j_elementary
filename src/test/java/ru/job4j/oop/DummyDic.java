package ru.job4j.oop;

public class DummyDic {
    public String engToRus(String eng) {
        String text = "Неизвестное слово: " + eng;
        return text;
    }

    public static void main(String[] args) {
        DummyDic word = new DummyDic();
        String result = word.engToRus("kry-kry");
        System.out.println(result);
    }
}
