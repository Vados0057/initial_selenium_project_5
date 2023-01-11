import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

public class _02_Recap_Validate_Google {
    public static void main(String[] args) throws InterruptedException {


            WebDriver driver = Driver.getDriver();
            driver.manage().window().maximize();

            driver.get("https://www.google.com/");

           if (driver.getCurrentUrl().equals("https://www.google.com/")) System.out.println("PASSED");
           else System.out.println("FAILED");

           if (driver.getTitle().equals("Google")) System.out.println("PASSED");
           else System.out.println("FAILED");


          WebElement search =  driver.findElement(By.className("iblpc"));
            search.sendKeys("Software Engineer in Test");

            Thread.sleep(2000);

            Driver.quitDriver();

    }
}