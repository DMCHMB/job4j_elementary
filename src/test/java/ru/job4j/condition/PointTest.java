package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 2;
        Point a = new Point(0, 0);
        Point b = new Point(2, 0);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when24to93then7dot07() {
        double expected = 7.07;
        Point a = new Point(2, 4);
        Point b = new Point(9, 3);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenMinus53to219then17dot46() {
        double expected = 17.46;
        Point a = new Point(-5, 3);
        Point b = new Point(2, 19);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when27to09then2dot82() {
        double expected = 2.82;
        Point a = new Point(2, 7);
        Point b = new Point(0, 9);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when275to093then2dot82() {
        double expected = 3.46;
        Point a = new Point(2, 7, 5);
        Point b = new Point(0, 9, 3);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when000to034then5() {
        double expected = 5;
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 3, 4);
        double out = a.distance3d(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}
