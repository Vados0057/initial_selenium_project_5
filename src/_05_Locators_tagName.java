import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;
import utils.TechGlobalUtil;
import utils.Waiter;

public class _05_Locators_tagName {
    public static void main(String[] args) {

    try {
        WebDriver driver = Driver.getDriver();

        TechGlobalUtil.getFrontEndTesting();

        driver.findElement(By.id("card-1")).click();

        System.out.println(driver.findElement(By.id("main_heading")).isDisplayed());
        System.out.println(driver.findElement(By.id("main_heading")).getText());

        if (driver.findElement(By.id("main_heading")).isDisplayed()) System.out.println("Heading item validation is PASSED");
        else System.out.println("Heading item validation is FAILED");

        if (driver.findElement(By.id("main_heading")).getText().equals("Locators")) System.out.println("Heading text validation is PASSED");
        else System.out.println("Heading text validation is FAILED");



    }catch (Exception e){
        System.out.println("Test failed due to: " + e.getMessage());
    }
    finally {
        Driver.quitDriver();
    }
    }
}
