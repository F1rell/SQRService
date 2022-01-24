package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void testDefaultLowerAndUpperBound() {
        SQRService service = new SQRService();
        int lowerBound = 100;
        int upperBound = 1000;
        int resultSQRService = 22;
        long actual = service.bound(lowerBound, upperBound);
        assertEquals(resultSQRService, actual);
    }


    @Test
    void testWhenBoundBig() {
        SQRService service = new SQRService();
        int lowerBound = 100;
        int upperBound = 10001;
        int resultSQRService = 90;
        long actual = service.bound(lowerBound, upperBound);
        assertEquals(resultSQRService, actual);
    }
}