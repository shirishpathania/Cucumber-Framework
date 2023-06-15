package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utils.CommonDriver;
import Utils.Wait;

import java.time.Duration;

public class SignInPage extends CommonDriver
{


    WebDriverWait wait1;
    By signInButton = By.xpath("//a[contains(@class,'item')]");
    By emailTextbox = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/input");
    By passwordTextbox = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/input");
    By rememberMeCheckbox = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div/input");
    By loginButton = By.xpath("/html/body/div[2]/div/div/div[1]/div/div[4]/button");




    public SignInPage()
    {

        wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));

    }



    public void SignInActions()
    {
        Wait.WaitToBeClickable(driver, "XPath", "//a[contains(@class,'item')]", 10);
        driver.findElement(signInButton).click();

        // Enter valid username in TextBox

        Wait.WaitToBeVisible(driver, "XPath", "/html/body/div[2]/div/div/div[1]/div/div[1]/input", 5);
        driver.findElement(emailTextbox).sendKeys("ivica.cuncic@gmail.com");

        // Enter valid password in TextBox
        driver.findElement(passwordTextbox).sendKeys("mars123");

        //Identify remember me checkbox and click
        driver.findElement(rememberMeCheckbox).click();

        // Click on Login
        driver.findElement(loginButton).click();
        Wait.WaitToBeClickable(driver, "XPath", "//*[@id='account-profile-section']/div/section[1]/div/div[2]/a", 10);


    }


}



