import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.Driver;

public class _09_getText_getAttribute {
    public static void main(String[] args) {

        /*
        Test Case:
        1. Go to https://www.techglobalschool.com/
        2. Scroll down to the bottom of the page
        3. Validate the Subscribe form
        1. Validate “Subscribe” heading2 with its text
        2. Validate ”Stay up to date!” paragraph with its text
        3. Validate “Enter your first name” input box with its placeholder
        4. Validate “Enter your last name” input box with its placeholder
        5. Validate “Add your email” input box with its placeholder
        6. Validate “SUBSCRIBE” button with its text
         */

        WebDriver driver = Driver.getDriver();
        driver.manage().window().maximize();

        driver.get("https://www.techglobalschool.com/");

        System.out.println(driver.findElement(By.id("comp-keehv7pd1")).getText());

        System.out.println(driver.findElement(By.className("color_15")).getText());

        System.out.println(driver.findElement(By.id("input_comp-khwayxk9")).getAttribute("placeholder"));
        System.out.println(driver.findElement(By.id("input_comp-khwaz4h2")).getAttribute("placeholder"));
        System.out.println(driver.findElement(By.id("input_comp-khwb0zsz")).getAttribute("placeholder"));



        driver.quit();

    }
}
