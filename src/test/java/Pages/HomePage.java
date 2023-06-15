package Pages;

import Utils.CommonDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage extends CommonDriver
{
    //private WebDriver driver;
    WebDriverWait wait1;

    public HomePage()
    {
        //driver = new ChromeDriver();
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));
    }

    public void GoToSingPage()

    {


        //Open chrome browser
        driver.manage().window().maximize();
        //Launch Mars portal
        driver.navigate().to("http://localhost:5000");






    }



}
