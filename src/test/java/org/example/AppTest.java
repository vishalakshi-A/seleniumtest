package org.example;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */


   @Test
       public void shouldAnswer()
    {
        System.out.println("abc");
    }
    @BeforeSuite
    public void suite()
    {
        System.out.println("Be suite");
    }
    @BeforeClass
    public void bClass()
    {
        System.out.println("Before class");
    }
    @BeforeTest
    public void bTest()
    {
        System.out.println("Before Test");
    }
        //public void shouldAnswer()



}
