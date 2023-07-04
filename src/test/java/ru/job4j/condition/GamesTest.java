package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.assertj.core.api.Assertions.assertThat;

class GamesTest {

    @Test
    void whenHavePermissionANDHaveMoney() {
        boolean allowByParent = true;
        boolean hasMoney = true;
        String expectedOutput = "I can go to the computer club.";
        String actualOutput = getPermissionOutput(allowByParent, hasMoney);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenHavePermissionNOTHaveMoney() {
        boolean allowByParent = true;
        boolean hasMoney = false;
        String expectedOutput = "I can't.";
        String actualOutput = getPermissionOutput(allowByParent, hasMoney);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenNOTHavePermissionANDHaveMoney() {
        boolean allowByParent = false;
        boolean hasMoney = true;
        String expectedOutput = "I can't.";
        String actualOutput = getPermissionOutput(allowByParent, hasMoney);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenNOTHavePermissionNOTHaveMoney() {
        boolean allowByParent = false;
        boolean hasMoney = false;
        String expectedOutput = "I can't.";
        String actualOutput = getPermissionOutput(allowByParent, hasMoney);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    private String getPermissionOutput(boolean allowByParent, boolean hasMoney) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;

        System.setOut(printStream);
        Games.permission(allowByParent, hasMoney);
        System.setOut(originalOut);

        return outputStream.toString().trim();
    }
}