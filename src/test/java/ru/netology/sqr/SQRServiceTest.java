package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @Test
    void testDefaultLowerAndUpperBound() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerBound = 100;
        int upperBound = 1000;
        int resultSQRService = 22;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                count = count + 1;
                long actual = service.bound(lowerBound, upperBound);
                assertEquals(resultSQRService, actual);
            }
        }
    }

    @Test
    void testWhenBoundBig() {
        SQRService service = new SQRService();
        int count = 0;
        int lowerBound = 100;
        int upperBound = 10001;
        int resultSQRService = 90;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= lowerBound && i * i <= upperBound) {
                count = count + 1;
                long actual = service.bound(lowerBound, upperBound);
                assertEquals(resultSQRService, actual);
            }
        }
    }
}