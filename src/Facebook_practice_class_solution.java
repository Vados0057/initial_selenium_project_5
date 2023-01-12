import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.List;

public class Facebook_practice_class_solution {
    public static void main(String[] args) {

        WebDriver driver = Driver.getDriver();

        driver.get("https://www.facebook.com/");

        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        System.out.println(driver.findElement(By.className("fb_logo")).isDisplayed());
        System.out.println(driver.findElement(By.className("_8eso")).getText());
        System.out.println(driver.findElement(By.id("email")).isDisplayed());
        System.out.println(driver.findElement(By.id("pass")).isDisplayed());
        System.out.println(driver.findElement(By.cssSelector("button[data-testid='royal_login_button']")).getText());
        System.out.println(driver.findElement(By.cssSelector("._6ltj>a")).getText());
        System.out.println(driver.findElement(By.cssSelector("a[id*='u_0_0_']")).getText());

        Driver.quitDriver();
    }
}
