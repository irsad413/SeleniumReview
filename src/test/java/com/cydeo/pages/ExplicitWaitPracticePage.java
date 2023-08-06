package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ExplicitWaitPracticePage {

    public ExplicitWaitPracticePage(){

        PageFactory.initElements(Driver.getDriver() , this);
    }

    @FindBy(xpath = "//button[.='Start']")
    public WebElement startBtn ;

    @FindBy(id = "username")
    public WebElement userName ;

    @FindBy(id = "pwd")
    public WebElement password ;

    @FindBy(xpath = "//button[.='Submit']")
    public WebElement submitBtn ;

    @FindBy(xpath = "//div[normalize-space(text())='Your password is invalid!']")
    public WebElement resultText;

    @FindBy(xpath = "//strong[.='Done!']")
    public WebElement doneMsg;

    @FindBy(xpath = "//img[@alt='square pants']")
    public WebElement image;
}
