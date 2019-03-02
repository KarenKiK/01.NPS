package ru.itpark;

public class Main {
    public static void main(String[] args) {
        NpsService service = new NpsService();

        // массив - это объект (объект.свойство, объект.метод())
        int[] scores = {9, 1, 9, 9, 9}; // Java сама вычислит, что это массив из 3 элементов
        int nps = service.calculate(scores);// ctrl + alt + v (создание локальной переменной)
        System.out.println(nps);
    }
}
