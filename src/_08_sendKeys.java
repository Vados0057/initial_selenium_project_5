import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _08_sendKeys {
    public static void main(String[] args) {

        /*
        TEST CASE:
        Go to https://www.wikipedia.org/
        Search for "Tesla"
        Validate the main title of the page is "Tesla"
        NOTE: Use xpath or cssSelector to locate the web elements
         */

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://www.wikipedia.org/");

       driver.findElement(By.id("searchInput")).sendKeys("Tesla" + Keys.ENTER);
//       driver.findElement(By.cssSelector("form[class='pure-form'] button")).click();

        System.out.println(driver.findElement(By.className("mw-page-title-main")).getText());

        Driver.quitDriver();
    }
}
