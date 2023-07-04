package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class LogicNotTest {

    @Test
    public void whenNumberIsEvenThenIsEven() {
        int number = 8;
        boolean expected = true;
        boolean actual = LogicNot.isEven(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenNumberIsPositiveThenIsPositive() {
        int number = 8;
        boolean expected = true;
        boolean actual = LogicNot.isPositive(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenNumberIsNotEvenThenNotEven() {
        int number = 7;
        boolean expected = true;
        boolean actual = LogicNot.notEven(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenNumberIsNotPositiveThenNotPositive() {
        int number = -8;
        boolean expected = true;
        boolean actual = LogicNot.notPositive(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenNumberIsNotEvenAndPositiveThenNotEvenAndPositive() {
        int number = 7;
        boolean expected = true;
        boolean actual = LogicNot.notEvenAndPositive(number);
        assertThat(actual).isEqualTo(expected);
    }

    @Test
    public void whenNumberIsEvenOrNotPositiveThenEvenOrNotPositive() {
        int number = -7;
        boolean expected = true;
        boolean actual = LogicNot.evenOrNotPositive(number);
        assertThat(actual).isEqualTo(expected);
    }
}