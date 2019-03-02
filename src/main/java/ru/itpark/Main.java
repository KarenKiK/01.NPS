package ru.itpark;

public class Main {
    public static void main(String[] args) {
        // массив - это объект (объект.свойство, объект.метод())
        int[] scores = {9, 1, 9}; // Java сама вычислит, что это массив из 3 элементов

        int firstScore = scores[0]; // scores[0] - читаем первый элемент
        int secondScore = scores[1];
        int thirdScore = scores[2];

        int promoters = 0; // мы ещё не считали
        int neutrals = 0; // мы ещё не считали
        int detractors = 0; // мы ещё не считали

        if (firstScore >= 9 && firstScore <= 10) {
            promoters++; // увеличение значения на 1
        }
        if (firstScore >= 7 && firstScore <= 8) {
            neutrals++; // увеличение значения на 1
        }
        if (firstScore >= 0 && firstScore <= 6) {
            detractors++; // увеличение значения на 1
        }

        if (secondScore >= 9 && secondScore <= 10) { // alt + shift + click
            promoters++; // увеличение значения на 1
        }
        if (secondScore >= 7 && secondScore <= 8) {
            neutrals++; // увеличение значения на 1
        }
        if (secondScore >= 0 && secondScore <= 6) {
            detractors++; // увеличение значения на 1
        }

        if (thirdScore >= 9 && thirdScore <= 10) { // alt + shift + click
            promoters++; // увеличение значения на 1
        }
        if (thirdScore >= 7 && thirdScore <= 8) {
            neutrals++; // увеличение значения на 1
        }
        if (thirdScore >= 0 && thirdScore <= 6) {
            detractors++; // увеличение значения на 1
        }

        int nps = (promoters - detractors) * 100 / scores.length; // .length - кол-во элементов (или длина массива)
        System.out.println(nps);
    }
}
