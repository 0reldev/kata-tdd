package com.wildcodeschool;

import static org.junit.Assert.assertTrue;

import org.junit.Assert;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void test1() {

        Assert.assertEquals(0, App.add(""));
        Assert.assertEquals(0, App.add("0"));
        Assert.assertEquals(1, App.add("1"));
        Assert.assertEquals(42, App.add("42"));
        Assert.assertEquals(3, App.add("1,2"));
        Assert.assertEquals(42, App.add("0,42"));
    }

    @Test
    public void test2() {

        Assert.assertEquals(3, App.add("0,1,2"));
        Assert.assertEquals(10, App.add("0,1,2,5,2"));
    }

    @Test
    public void test3() {

        Assert.assertEquals(6, App.add("1\n2,3"));

    }
}
