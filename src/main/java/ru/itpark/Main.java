package ru.itpark;

public class Main {
    public static void main(String[] args) {
        int firstScore = 9; // 0 - 10
        int secondScore = 1;
        int thirdScore = 9;

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

        int nps = (promoters - detractors) * 100 / 3;
        System.out.println(nps);
    }
}
