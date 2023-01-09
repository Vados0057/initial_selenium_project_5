import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class _01_URL_and_Title_Validation {
    public static void main(String[] args) throws InterruptedException {

        /*
        Test Case:
        1. Go to https://www.techglobalschool.com
        2. Get current url and validate it
        3. Get title and validate it
        EXPECTED RESULT:
        URL  = https://www.techglobalschool.com/
        Title = SDET Bootcamp | TechGlobal
                 */

        System.setProperty("webdriver.chrome.driver", "/Users/ab/IdeaProjects/initial_selenium_project_5/chromedriver");

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.techglobalschool.com/");    //no caches
        //driver.navigate().to("https://www.techglobalschool.com/"); keep cache navigate has more methods

        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();

        Thread.sleep(2000);

        if (driver.getTitle().equals("SDET Bootcamp | TechGlobal")) System.out.println("Title validation PASSED");
        else System.out.println("Title validation is FAILED");

        if (driver.getCurrentUrl().equals("https://www.techglobalschool.com"))System.out.println("URL validation PASSED");
        else System.out.println("URL validation is failed");

        driver.quit();

    }
}
