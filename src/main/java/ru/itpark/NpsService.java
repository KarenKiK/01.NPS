package ru.itpark;

public class NpsService {
    public int calculate(int[] scores) {
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
        return nps;
    }
}
