package Utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CommonDriver
{

    public static WebDriver driver = new ChromeDriver();

    public static void BeforeTestRun()
    {
//        driver = new ChromeDriver();




    }

    public static void AfterTestRun()
    {
        driver.quit();
    }



}

