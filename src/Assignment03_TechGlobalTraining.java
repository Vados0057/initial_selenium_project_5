import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.TechGlobalUtil;

import java.util.List;

public class Assignment03_TechGlobalTraining {
    public static void main(String[] args) {
            /*
            TEST CASE 1
            Go to https://techglobal-training.netlify.app/
            Select "Frontend Testing" from the "Practices" dropdown
            Select the "Xpath-CSS Locators" card
            Validate the Programming Languages list items below
            Java
            JavaScript
            C#
             */

            /*
            TEST CASE 2
            Go to https://techglobal-training.netlify.app/
            Select "Frontend Testing" from the "Practices" dropdown
            Select the "Xpath-CSS Locators" card
            Validate the Automation Tools list items below
            Selenium WebDriver
            WebDriverIO
            Cypress
            Playwright
            */
        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        TechGlobalUtil.getFrontEndTesting();
        TechGlobalUtil.clickOnCard(2);
        List<WebElement> languages1 = driver.findElements(By.xpath("(//div//ul)[2]/li"));

        System.out.println("Test Case 1:");
        for (WebElement element : languages1) {
            System.out.println(element.isDisplayed());
            System.out.println(element.getText());
            System.out.println("--------------------");
        }

        System.out.println("\nTest Case 2:");
        List<WebElement> languages2 = driver.findElements(By.xpath("(//div//ul)[3]/li"));
        for (WebElement webElement : languages2) {
            System.out.println(webElement.isDisplayed());
            System.out.println(webElement.getText());
            System.out.println("--------------------");
        }

        Driver.quitDriver();
    }
}
