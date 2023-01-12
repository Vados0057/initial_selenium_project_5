package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class _11_Child_Elements_Index {
    public static void main(String[] args) {

        //.SubPageLayout_wrapper__vv3dF h3

        /*
        TEST CASE
        Go to https://techglobal-training.netlify.app/
        Select "Frontend Testing" from the "Practices" dropdown
        Select the "Xpath-CSS Locators" card
        Validate the headers below
        Programming Languages
        Automation Tools
        */

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        TechGlobalUtil.getFrontEndTesting();

        TechGlobalUtil.clickOnCard(2);

        WebElement element = driver.findElement(By.xpath("(//div[@class='SubPageLayout_content__+yqNR']//h3)[2]"));

        System.out.println(element.getText());

        Driver.quitDriver();
    }
}
