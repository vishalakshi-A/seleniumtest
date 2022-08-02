package org.example;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class TestNGDay2 {

    @Test(groups = {"Kids Wear"})
    public void test1()
    {
        SoftAssert softAssert= new SoftAssert();
        softAssert.assertEquals("One","Two");
        System.out.println("Print true or not");
        softAssert.assertEquals("One","One");
        softAssert.assertEquals("Two","Two");
        System.out.println("Print true or not after");
        softAssert.assertAll("Test Message");
        System.out.println("a1bc");
    }

    @Test(groups ={"Fashion"} )
    public void test2()
    {
        System.out.println("ab2c");
    }

@Parameters(value = {"browser"})
    @Test
    public void test3(String browser)
    {
        Assert.assertTrue(true);
        System.out.println("abc3"+browser);
    }

}
