package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class SwitchWeekTest {
    @Test
    public void when1ThenMonday() {
        int dayNumber = 1;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Monday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when2ThenTuesday() {
        int dayNumber = 2;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Tuesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when3ThenWednesday() {
        int dayNumber = 3;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Wednesday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when4ThenThursday() {
        int dayNumber = 4;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Thursday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when5ThenFriday() {
        int dayNumber = 5;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Friday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when6ThenSaturday() {
        int dayNumber = 6;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Saturday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void when7ThenSunday() {
        int dayNumber = 7;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Sunday";
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenOtherThenError() {
        int dayNumber = -1;
        String result = SwitchWeek.nameOfDay(dayNumber);
        String expected = "Error";
        assertThat(result).isEqualTo(expected);
    }
}