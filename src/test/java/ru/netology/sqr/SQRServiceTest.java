package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.CsvSource;
import ru.netology.sqr.SQRService;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/bonus.csv")
    public void testSQR(int expected, int min, int max) {
        SQRService service = new SQRService();

        int actual = service.calcSqrt(min, max);

        Assertions.assertEquals(expected, actual);
    }
}