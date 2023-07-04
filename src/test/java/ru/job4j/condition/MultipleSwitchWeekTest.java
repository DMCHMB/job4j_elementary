package ru.job4j.condition;

import org.junit.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class MultipleSwitchWeekTest {

    @Test
    public void whenMondayThen1() {
        String day = "Понедельник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 1;
        assertThat(result).isEqualTo(expected);

        day = "Monday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenTuesdayThen2() {
        String day = "Вторник";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 2;
        assertThat(result).isEqualTo(expected);

        day = "Tuesday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenWednesdayThen3() {
        String day = "Среда";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 3;
        assertThat(result).isEqualTo(expected);

        day = "Wednesday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenThursdayThen4() {
        String day = "Четверг";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 4;
        assertThat(result).isEqualTo(expected);

        day = "Thursday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenFridayThen5() {
        String day = "Пятница";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 5;
        assertThat(result).isEqualTo(expected);

        day = "Friday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSaturdayThen6() {
        String day = "Суббота";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 6;
        assertThat(result).isEqualTo(expected);

        day = "Saturday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenSundayThen7() {
        String day = "Воскресенье";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = 7;
        assertThat(result).isEqualTo(expected);

        day = "Sunday";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }

    @Test
    public void whenOtherThenMinus1() {
        String day = "Job4j";
        int result = MultipleSwitchWeek.numberOfDay(day);
        int expected = -1;
        assertThat(result).isEqualTo(expected);

        day = "Усталость";
        result = MultipleSwitchWeek.numberOfDay(day);
        assertThat(result).isEqualTo(expected);
    }
}