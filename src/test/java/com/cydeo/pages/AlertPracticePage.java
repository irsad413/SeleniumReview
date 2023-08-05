package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AlertPracticePage {

    public AlertPracticePage(){

        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "//button[@onclick='jsPrompt()']")
    public WebElement jsAlertBtn ;

    @FindBy(id = "result")
    public WebElement resultText ;
}


