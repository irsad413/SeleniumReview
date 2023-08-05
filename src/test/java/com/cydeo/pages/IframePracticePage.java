package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class IframePracticePage {

    public IframePracticePage(){

        PageFactory.initElements(Driver.getDriver() ,this);
    }

    @FindBy(id="mce_0_ifr")
    public WebElement iframe;

    @FindBy(xpath = "//p[.='Your content goes here.']")
    public WebElement contentTextArea;


    @FindBy(xpath = "//h3[contains(text(),'TinyMCE')]")
    public WebElement headerText;
}
