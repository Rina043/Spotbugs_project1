package ru.netology.stats;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StatsServiceTest {
    @Test
    void findMaxAtFirstPosition() {
        StatsService service = new StatsService();

        long[] incomesInBillions = {12, 5, 8, 4, 5, 3, 8, 6, 11, 11, 12};
        long expected = 12;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }
    @Test
    void findMaxNotAtFirstPosition () {
        StatsService service = new StatsService();

        long[] incomesInBillions = {1, 5, 8, 4, 5, 3, 8, 6, 11, 11, 15};
        long expected = 15;
        long actual = service.findMax(incomesInBillions);

        assertEquals(expected, actual);
    }

}