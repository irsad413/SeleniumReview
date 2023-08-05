package com.cydeo.tests;

import com.cydeo.pages.DropDownPage;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.WeakHashMap;

public class DropDownTest {

    DropDownPage dropDownPage = new DropDownPage() ;

    @BeforeMethod
    public void setUp(){
        Driver.getDriver().get("https://practice.cydeo.com/dropdown");

    }

    @Test
    public void stateDropdownTest(){



        Select stateSelect = new Select(dropDownPage.stateDropdown) ;

        stateSelect.selectByVisibleText("Hawaii");
        String actualOption = stateSelect.getFirstSelectedOption().getText() ;
        String expectedOption = "Hawaii" ;
        Assert.assertEquals(actualOption , expectedOption);

        stateSelect.selectByValue("CA");
        actualOption = stateSelect.getFirstSelectedOption().getText() ;
        expectedOption = "California" ;
        Assert.assertEquals(actualOption , expectedOption);


        stateSelect.selectByIndex(10);
        actualOption = stateSelect.getFirstSelectedOption().getText() ;
        expectedOption = "Florida" ;
        Assert.assertEquals(actualOption , expectedOption);






    }


    @Test
    public void dateOfBirthDropdownTest(){

        Select yearSelect = new Select(dropDownPage.yearDropdown) ;
        yearSelect.selectByVisibleText("1994");
        String actualOption = yearSelect.getFirstSelectedOption().getText() ;
        String expectedOption = "1994" ;
        Assert.assertEquals(actualOption , expectedOption , "Year selection did not pass!");

        Select monthSelect = new Select(dropDownPage.monthDropdown) ;
        monthSelect.selectByValue("3");
        actualOption = monthSelect.getFirstSelectedOption().getText() ;
        expectedOption = "April" ;
        Assert.assertEquals(actualOption , expectedOption,"Month selection did not pass!");

        Select daySelect = new Select(dropDownPage.dayDropdown) ;
        daySelect.selectByIndex(14);
        actualOption = daySelect.getFirstSelectedOption().getText() ;
        expectedOption = "15" ;
        Assert.assertEquals(actualOption , expectedOption,"Day selection did not pass!");



    }


    @Test
    public void languagesDropdownTest(){

        Select languagesSelect = new Select(dropDownPage.languagesDropdown) ;
        List<WebElement> languageOptions = languagesSelect.getOptions() ;

        for (WebElement eachOption : languageOptions) {

            languagesSelect.selectByVisibleText(eachOption.getText());

            System.out.println(eachOption.getText());

            Assert.assertTrue(eachOption.isSelected() , "Language option did not selected!");

        }


        languagesSelect.deselectAll();

        for (WebElement eachOption : languagesSelect.getOptions()) {
            Assert.assertTrue(!eachOption.isSelected());

        }
    }

    @AfterMethod
    public void tearDown(){

        Driver.closeDriver();

    }
}
