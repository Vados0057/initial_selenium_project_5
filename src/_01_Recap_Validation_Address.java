import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class _01_Recap_Validation_Address {
    public static void main(String[] args) {
        try {
            WebDriver driver = Driver.getDriver();
            driver.manage().window().maximize();

            driver.get("https://techglobal-training.netlify.app/");

            List<WebElement> elements = driver.findElements(By.xpath("//div[@class='has-text-centered']//p"));

            String[] actualText = {"2860 S River Rd Suite 350, Des Plaines IL 60018", "© 2023 TechGlobal - All Rights Reserved"};

            for (int i = 0; i < elements.size(); i++) {
                if (elements.get(i).getText().equals(actualText[i])) System.out.println("PASSED");
                else System.out.println("FAILED");
                Thread.sleep(2000);

            }

            // Wiki search //div[@class='search-input']
            // //button[@class='pure-button pure-button-primary-progressive']

//            WebElement facebook = driver.findElement(By.id("Footer_facebook__UiT2a"));
//            WebElement instagram = driver.findElement(By.id("Footer_instagram__0NXVy"));
//
//            if (facebook.isDisplayed() && facebook.isEnabled()) System.out.println("PASSED");
//            else System.out.println("FAILED");
//
//            if (instagram.isDisplayed() && instagram.isEnabled()) System.out.println("PASSED");
//            else System.out.println("FAILED");

            List<WebElement> icons = driver.findElements(By.className("Footer_socials__7h4n1"));

            for (WebElement icon : icons) {
                if (icon.isDisplayed() && icon.isEnabled()) System.out.println("PASSED");
                else System.out.println("FAILED");
                }


        }catch (Exception ignored){}
        finally {
            Driver.quitDriver();
        }
    }
}
