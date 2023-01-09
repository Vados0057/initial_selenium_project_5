import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class Facebook_practice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        if (driver.getTitle().equals("Facebook - Log In or Sign Up")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation is FAILED");

        if (driver.getCurrentUrl().equals("https://www.facebook.com/")) System.out.println("URL validation PASSED");
        else System.out.println("URL validation is failed");

        if (driver.findElement(By.className("fb_logo")).isDisplayed()) System.out.println("Logo validation is PASSED");
        else System.out.println("Logo validation is FAILED");

        if (driver.findElement(By.className("_8eso")).isDisplayed())
            System.out.println("heading2 validation is PASSED");
        else System.out.println("heading2 validation is FAILED");

        if (driver.findElement(By.name("email")).isDisplayed())
            System.out.println("“Email or Phone Number” input box validation is PASSED");
        else System.out.println("“Email or Phone Number” input box validation is FAILED");

        if (driver.findElement(By.id("passContainer")).isDisplayed())
            System.out.println("“Password” input box validation is PASSED");
        else System.out.println("“Password” input box validation is FAILED");

        if (driver.findElement(By.tagName("button")).isDisplayed() && driver.findElement(By.tagName("button")).isEnabled())
            System.out.println("“Log In” button " +
                    "input box validation is PASSED");
        else System.out.println("“Password” input box validation is FAILED");

        if (driver.findElement(By.linkText("Forgot password?")).isDisplayed())
            System.out.println("“Forgot password” link validation is PASSED");
        else System.out.println("“Forgot password” link validation is FAILED");

        if (driver.findElement(By.xpath("//div[@class=\"_6ltg\"]//a[@role=\"button\"]")).isDisplayed())
            System.out.println("“Create New Account” button validation is PASSED");
        else System.out.println("“Create New Account” button validation is FAILED");

        driver.quit();
    }
}