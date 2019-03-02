package ru.itpark;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NpsServiceTest {
    // void - метод ничего не должен возвращать
    @Test
    public void calculateAllPromoters() {
        // A-A-A
        NpsService service = new NpsService();
        int[] scores = {9, 10, 9};

        int actual = service.calculate(scores);

        assertEquals(100, actual);
    }

    @Test
    public void calculateAllDetractors() {
        // A-A-A
        NpsService service = new NpsService();
        int[] scores = {2, 6, 0};

        int actual = service.calculate(scores);

        assertEquals(-100, actual);
    }

    @Test
    public void calculateAllNeutrals() {
        // A-A-A
        NpsService service = new NpsService();
        int[] scores = {7, 8, 8};

        int actual = service.calculate(scores);

        assertEquals(0, actual);
    }
}