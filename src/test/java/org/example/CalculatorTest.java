package org.example;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private static Calculator calc;

    @BeforeEach
    void setUp() {
        calc = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @DisplayName("Проверка что число положительное")
    @Test
    void isPositive() {
        final var number = 3;
        final var calc = new Calculator();
        final var actual = calc.isPositive.test(number);
        assertTrue(actual);
    }

    @DisplayName("Проверка что число возврщает положительное число")
    @ValueSource(ints = {3, -3})
    @ParameterizedTest
    void abc(int number) {
        final var expected = 3;
        final var actual = calc.abs.apply(number);
        assertEquals(actual, expected);
    }

    @DisplayName("Проверка что число не равно нулю")
    @Test
    void izZeroFalse() {
        final var number = -3;

        final var actual = calc.isZero.test(number);
        assertFalse(actual);
    }

    @DisplayName("Проверка что число равно нулю")
    @Test
    void izZeroTrue() {
        final var number = 0;

        final var actual = calc.isZero.test(number);
        assertTrue(actual);
    }
}