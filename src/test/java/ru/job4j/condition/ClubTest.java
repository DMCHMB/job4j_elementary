package ru.job4j.condition;

import org.junit.jupiter.api.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import static org.assertj.core.api.Assertions.assertThat;

class ClubTest {

    @Test
    void whenHaveMoneyANDBeFriend() {
        boolean hasMoney = true;
        boolean beFriend = true;
        String expectedOutput = "I can go to the club.";
        String actualOutput = getPermissionOutput(hasMoney, beFriend);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenHaveMoneyANDNOTBeFriend() {
        boolean hasMoney = true;
        boolean beFriend = false;
        String expectedOutput = "I can go to the club.";
        String actualOutput = getPermissionOutput(hasMoney, beFriend);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenNOTHaveMoneyANDBeFriend() {
        boolean hasMoney = false;
        boolean beFriend = true;
        String expectedOutput = "I can go to the club.";
        String actualOutput = getPermissionOutput(hasMoney, beFriend);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    @Test
    void whenNOTHaveMoneyANDNOTBeFriend() {
        boolean hasMoney = false;
        boolean beFriend = false;
        String expectedOutput = "I can't.";
        String actualOutput = getPermissionOutput(hasMoney, beFriend);
        assertThat(expectedOutput).isEqualTo(actualOutput);
    }

    private String getPermissionOutput(boolean hasMoney, boolean beFriend) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        PrintStream printStream = new PrintStream(outputStream);
        PrintStream originalOut = System.out;

        System.setOut(printStream);
        Club.permission(hasMoney, beFriend);
        System.setOut(originalOut);

        return outputStream.toString().trim();
    }
}