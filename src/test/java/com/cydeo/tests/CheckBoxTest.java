package com.cydeo.tests;

import com.cydeo.pages.CheckBoxPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckBoxTest {

    CheckBoxPage checkBoxPage = new CheckBoxPage() ;

    @Test
    public void checkBoxTest() {

        Driver.getDriver().get("https://practice.cydeo.com/checkboxes");

        Assert.assertTrue(!checkBoxPage.checkBox1.isSelected());

        Assert.assertTrue(checkBoxPage.checkBox2.isSelected());


        checkBoxPage.checkBox1.click();

        checkBoxPage.checkBox2.click();

        Assert.assertTrue(checkBoxPage.checkBox1.isSelected());

        Assert.assertTrue(!checkBoxPage.checkBox2.isSelected());

        Driver.closeDriver();
    }
}
