package com.cydeo.tests;

import com.cydeo.pages.UploadFilePage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadFileTest {

    @Test
    public void uploadFileTest(){

        Driver.getDriver().get("https://practice.cydeo.com/upload");

        UploadFilePage uploadFilePage = new UploadFilePage() ;

        uploadFilePage.choseFileBtn.sendKeys("/Users/irsadartus/Desktop/2.png");

        uploadFilePage.uploadBtn.click();

        Assert.assertEquals(uploadFilePage.headerText.getText() , "File Uploaded!");


    }
}
