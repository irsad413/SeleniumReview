package com.cydeo.tests;

import com.cydeo.pages.AlertPracticePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AlertPracticeTest {

    AlertPracticePage alertPracticePage = new AlertPracticePage() ;

    @Test
    public void jsAlertTest(){

        Driver.getDriver().get("https://practice.cydeo.com/javascript_alerts");

        alertPracticePage.jsAlertBtn.click();

        Alert alert = Driver.getDriver().switchTo().alert() ;

        alert.sendKeys("Hello");

        alert.accept();

        String actualResultText = alertPracticePage.resultText.getText() ;
        String expectedResultText = "You entered: Hello" ;
        Assert.assertEquals(actualResultText , expectedResultText);

        Driver.closeDriver();




    }
}
