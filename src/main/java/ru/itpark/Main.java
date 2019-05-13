package ru.itpark;

public class Main {
    public static void main(String[] args) {
        NpsServicece servicece = new NpsServicece();
        int[] servises = {10,10,10,10};

        int nps = servicece.calculate(servises);
        System.out.println(nps);
        System.out.println(nps + 10);

    }
}

