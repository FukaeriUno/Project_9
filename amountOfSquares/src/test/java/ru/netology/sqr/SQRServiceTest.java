package ru.netology.sqr;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SQRServiceTest {

    @ParameterizedTest
    @CsvSource(value =
            {"borderingValues,100,9801,90",
             "minBorderingValues,100,100,1",
             "maxBorderingValues,9801,9801,1",
             "valuesInBorders,101,9800,88",
             "valuesOutOfBorders,99,9802,90"}
    )
    void sqrAmount(String testName, int num1, int num2, int expected) {
        SQRService service = new SQRService();
        int actual = service.sqrAmount(num1, num2);
        assertEquals(expected, actual);
    }
}