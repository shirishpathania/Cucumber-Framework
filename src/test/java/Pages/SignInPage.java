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
    WebElement signInButton = driver.findElement(By.xpath("//a[contains(@class,\"item\")]"));
    WebElement emailTextbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[1]/input"));
    WebElement passwordTextbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[2]/input"));
    WebElement rememberMeCheckbox = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[3]/div/input"));
    WebElement loginButton = driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div/div[4]/button"));




    public SignInPage()
    {

        wait1 = new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.navigate().to("http://localhost:5000/");

    }



    public void SignInActions()
    {
        Wait.WaitToBeClickable(driver, "XPath", "//a[contains(@class,\"item\")]", 10);
        signInButton.click();

        // Enter valid username in TextBox

        Wait.WaitToBeVisible(driver, "XPath", "/html/body/div[2]/div/div/div[1]/div/div[1]/input", 5);
        emailTextbox.sendKeys("ivica.cuncic@gmail.com");

        // Enter valid password in TextBox
        passwordTextbox.sendKeys("mars123");

        //Identify remember me checkbox and click
        rememberMeCheckbox.click();

        // Click on Login
        loginButton.click();
        Wait.WaitToBeClickable(driver, "XPath", "//*[@id=\"account-profile-section\"]/div/section[1]/div/div[2]/a", 10);


    }


}



