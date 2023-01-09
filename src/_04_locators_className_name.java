import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;
import utils.Waiter;

import java.util.HashMap;

public class _04_locators_className_name {
    public static void main(String[] args) {
        /*
        Test Case:
        1. Go to https://techglobal-training.netlify.app/
        2. Select “Frontend Testing” from the “Practices” dropdown
        3. Select the “Locators” card
        4. Validate the “Kiwi”, “Orange” and “Grapes” items are displayed
         */
        try {
            WebDriver driver = Driver.getDriver();

            driver.get("https://techglobal-training.netlify.app/");
            Waiter.pause(2);

            driver.findElement(By.id("dropdown-button")).click();
            Waiter.pause(2);
            driver.findElement(By.id("frontend-option")).click();
            Waiter.pause(2);
            driver.findElement(By.id("card-1")).click();

           if (driver.findElement(By.id("item_kiwi")).isDisplayed()) System.out.println("Kiwi item validation " +
                   "is PASSED");
           else System.out.println("Kiwi item validation " +
                   "is FAILED");

           if (driver.findElement(By.name("item_orange")).isDisplayed()) System.out.println("Orange item validation is PASSED");
           else System.out.println("Orange item validation is FAILED");

            if (driver.findElement(By.className("item_grapes")).isDisplayed()) System.out.println("Grapes item validation is PASSED");
            else System.out.println("Grapes item validation is FAILED");

//            HashMap<WebElement, Boolean> map = new HashMap<>();
//            map.put(driver.findElement(By.className("item_grapes")),driver.findElement(By.className("item_grapes")).isDisplayed());
//            map.put(driver.findElement(By.id("item_kiwi")),driver.findElement(By.id("item_kiwi")).isDisplayed());
//            map.put(driver.findElement(By.name("item_orange")),driver.findElement(By.name("item_orange")).isDisplayed());
//            System.out.println(map);

        }catch (Exception ignored){}
        finally {
            Driver.quitDriver();
        }
    }
}