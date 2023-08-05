package com.cydeo.tests;

import com.cydeo.pages.WindowHandlePracticePage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Set;

public class WindowHandlePracticeTest {

    WindowHandlePracticePage windowHandlePracticePage = new WindowHandlePracticePage() ;

    @Test
    public void windowHandleTest(){

        Driver.getDriver().get("https://practice.cydeo.com/windows");

        String currentWindow =Driver.getDriver().getWindowHandle() ;

        System.out.println("currentWindow = " + currentWindow);


        Assert.assertEquals(Driver.getDriver().getTitle() , "Windows");

        windowHandlePracticePage.clickHereLink.click();

        windowHandlePracticePage.cydeoLink.click();

        Set<String> allWindowsHandle = Driver.getDriver().getWindowHandles() ;

        for (String eachWindow : allWindowsHandle) {

            Driver.getDriver().switchTo().window(eachWindow) ;
            System.out.println("eachWindow = " + eachWindow);
            System.out.println("Driver.getDriver().getTitle() = " + Driver.getDriver().getTitle());

            if (Driver.getDriver().getTitle().equals("Cydeo")){
                break;
            }

        }

        Assert.assertEquals(Driver.getDriver().getTitle() , "Cydeo");

        Driver.getDriver().switchTo().window(currentWindow) ;
        Assert.assertEquals(Driver.getDriver().getTitle() , "Windows");


    }
}
