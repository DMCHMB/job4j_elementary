package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to93then7dot07() {
        double expected = 7.07;
        int x1 = 2;
        int y1 = 4;
        int x2 = 9;
        int y2 = 3;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus53to219then17dot46() {
        double expected = 17.46;
        int x1 = -5;
        int y1 = 3;
        int x2 = 2;
        int y2 = 19;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27to09then2dot82() {
        double expected = 2.82;
        int x1 = 2;
        int y1 = 7;
        int x2 = 0;
        int y2 = 9;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }
}
