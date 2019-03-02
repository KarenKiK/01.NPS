package ru.itpark;

public class Main {
    public static void main(String[] args) {
        // массив - это объект (объект.свойство, объект.метод())
        int[] scores = {9, 1, 9, 9, 9}; // Java сама вычислит, что это массив из 3 элементов

        int promoters = 0; // мы ещё не считали
        int neutrals = 0; // мы ещё не считали
        int detractors = 0; // мы ещё не считали

        // iter + tab
        // для каждой оценки из scores
        for (int score : scores) {
            // score последовательно будет принимать все значения из scores
            if (score >= 9 && score <= 10) {
                promoters++; // увеличение значения на 1
            }
            if (score >= 7 && score <= 8) {
                neutrals++; // увеличение значения на 1
            }
            if (score >= 0 && score <= 6) {
                detractors++; // увеличение значения на 1
            }
        }

        int nps = (promoters - detractors) * 100 / scores.length; // .length - кол-во элементов (или длина массива)
        System.out.println(nps);
    }
}
