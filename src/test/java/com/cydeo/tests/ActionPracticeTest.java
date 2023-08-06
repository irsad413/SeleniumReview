package com.cydeo.tests;

import com.cydeo.pages.ActionPracticePage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

import javax.swing.*;

public class ActionPracticeTest {

    ActionPracticePage actionPracticePage = new ActionPracticePage() ;

    Actions actions = new Actions(Driver.getDriver()) ;

    @Test
    public void hoverOverTest(){

        Driver.getDriver().get("https://practice.cydeo.com/hovers");



        actions.moveToElement(actionPracticePage.img1).perform();

        Assert.assertTrue(actionPracticePage.img1.isDisplayed() , "Name 1 did not appear1");


        actions.moveToElement(actionPracticePage.img2).perform();

        Assert.assertTrue(actionPracticePage.img2.isDisplayed() , "Name 1 did not appear2");


        actions.moveToElement(actionPracticePage.img3).perform();

        Assert.assertTrue(actionPracticePage.img3.isDisplayed() , "Name 1 did not appear3");


    }


    @Test
    public void rightClickTest(){

        Driver.getDriver().get("https://practice.cydeo.com");

        actions.contextClick(actionPracticePage.abTesting)
                .sendKeys(Keys.ARROW_DOWN , Keys.ARROW_DOWN , Keys.RETURN)
                .perform();

        Assert.assertEquals(Driver.getDriver().getTitle() , "No A/B Test");
    }

    @Test
    public void jsExecutorScrollingTest(){

        Driver.getDriver().get("https://practice.cydeo.com");

        JavascriptExecutor js = ((JavascriptExecutor)Driver.getDriver()) ;

        js.executeScript("arguments[0].scrollIntoView(true)" , actionPracticePage.cydeolink , actionPracticePage.homeLink) ;

        BrowserUtils.sleep(3);

        js.executeScript("arguments[1].scrollIntoView(true)" , actionPracticePage.cydeolink , actionPracticePage.homeLink) ;


    }
}
