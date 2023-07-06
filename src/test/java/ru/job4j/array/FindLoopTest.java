package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class FindLoopTest {
    @Test
    public void whenArrayHas5Then0() {
        int[] data = new int[]{5, 10, 3};
        int el = 5;
        int result = FindLoop.indexOf(data, el);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHas18Then3() {
        int[] data = new int[]{5, 10, 3, 18, 27, 9};
        int el = 18;
        int result = FindLoop.indexOf(data, el);
        int expected = 3;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenArrayHasNot95ThenMinus1() {
        int[] data = new int[]{5, 10, 3, 18, 27, 9};
        int el = 95;
        int result = FindLoop.indexOf(data, el);
        int expected = -1;
        assertThat(result).isEqualTo(expected);
    }
}