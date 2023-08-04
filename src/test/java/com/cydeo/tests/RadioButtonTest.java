package com.cydeo.tests;

import com.cydeo.pages.RadioButtonPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RadioButtonTest {

    RadioButtonPage radioButtonPage = new RadioButtonPage() ;

    @Test
    public void radioButtonTest() {

        Driver.getDriver().get("https://practice.cydeo.com/radio_buttons");

        Assert.assertTrue(radioButtonPage.blueButton.isSelected() );

        

        Assert.assertTrue(!radioButtonPage.footballButton.isSelected());

        radioButtonPage.footballButton.click();

        Assert.assertTrue(radioButtonPage.footballButton.isSelected());



        radioButtonPage.redButton.click();

        Assert.assertTrue(radioButtonPage.redButton.isSelected());

        Assert.assertTrue(!radioButtonPage.blueButton.isSelected());


        Assert.assertTrue(!radioButtonPage.greenButton.isEnabled() , "Green button is disable");


    }
}
