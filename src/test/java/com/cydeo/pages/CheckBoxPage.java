package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CheckBoxPage {

    public CheckBoxPage(){

        PageFactory.initElements(Driver.getDriver() , this);

    }

    @FindBy(id = "box1")
    public WebElement checkBox1 ;

    @FindBy(id = "box2")
    public WebElement checkBox2 ;


}
