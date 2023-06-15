package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDriver
{

    public static WebDriver driver = new ChromeDriver();

    public static WebDriver BeforeTestRun()
    {
        driver = new ChromeDriver();
        return driver;
    }

    public static void AfterTestRun()
    {
        driver.quit();
    }



}

