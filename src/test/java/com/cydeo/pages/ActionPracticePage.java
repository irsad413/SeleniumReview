package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class ActionPracticePage {

    public ActionPracticePage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }


    @FindBy(xpath = "(//img)[1]")
    public WebElement img1;

    @FindBy(xpath = "(//img)[2]")
    public WebElement img2;

    @FindBy(xpath = "(//img)[3]")
    public WebElement img3;

    @FindBy(xpath = "//h5[.='name: user1']")
    public WebElement name1;

    @FindBy(xpath = "//h5[.='name: user2']")
    public WebElement name2;

    @FindBy(xpath = "//h5[.='name: user3']")
    public WebElement name3;

    @FindBy(linkText = "A/B Testing")
    public WebElement abTesting;

    @FindBy(linkText = "CYDEO")
    public WebElement cydeolink;

    @FindBy(linkText = "Home")
    public WebElement homeLink;
}
