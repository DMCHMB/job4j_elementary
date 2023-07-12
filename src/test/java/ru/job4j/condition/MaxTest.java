package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MaxTest {
    @Test
    public void whenMax1To2Then2() {
        int a = 1;
        int b = 2;
        int result = Max.max(a, b);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax7To7Then7() {
        int a = 7;
        int b = 7;
        int result = Max.max(a, b);
        int expected = 7;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax0And1And2Then2() {
        int a = 0;
        int b = 1;
        int c = 2;
        int result = Max.max(a, b, c);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax5And5And5Then5() {
        int a = 5;
        int b = 5;
        int c = 5;
        int result = Max.max(a, b, c);
        int expected = 5;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax10And18And7And5Then18() {
        int a = 10;
        int b = 18;
        int c = 7;
        int d = 5;
        int result = Max.max(a, b, c, d);
        int expected = 18;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenMax1And1And1And1Then1() {
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int result = Max.max(a, b, c, d);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }
}