package com.cydeo.tests;

import com.cydeo.pages.IframePracticePage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IframePracticeTest {

    IframePracticePage iframePracticePage = new IframePracticePage() ;

    @Test
    public void iframeTest(){

        Driver.getDriver().get("https://practice.cydeo.com/iframe");

        Driver.getDriver().switchTo().frame(0) ;  // index number
       //  Driver.getDriver().switchTo().frame("mce_0_ifr") ;  // id or name attribute value
        // Driver.getDriver().switchTo().frame(iframePracticePage.iframe) ; // locator or web element

        String actualText = iframePracticePage.contentTextArea.getText() ;
        String expectedText = "Your content goes here." ;
        Assert.assertEquals(actualText , expectedText);

        Driver.getDriver().switchTo().defaultContent() ;

        String actualHeader = iframePracticePage.headerText.getText() ;
        String expectedHeader = "An iFrame containing the TinyMCE WYSIWYG Editor" ;
        Assert.assertEquals(actualHeader , expectedHeader);
    }
}
