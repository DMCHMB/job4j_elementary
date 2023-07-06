package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SortSelectedTest {
    @Test
    public void when5Sort() {
        int[] data = new int[]{3, 4, 1, 2, 5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{1, 2, 3, 4, 5};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when3Sort() {
        int[] data = new int[]{8, 3, -5};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{-5, 3, 8};
        assertThat(result).containsExactly(expected);
    }

    @Test
    public void when1Sort() {
        int[] data = new int[]{3};
        int[] result = SortSelected.sort(data);
        int[] expected = new int[]{3};
        assertThat(result).containsExactly(expected);
    }
}