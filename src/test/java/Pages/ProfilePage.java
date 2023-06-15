package Pages;

import Pages.model.EducationInfo;
import Utils.CommonDriver;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProfilePage extends CommonDriver
{
    WebDriverWait wait1;
    By descriptionButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/div/div/div/h3/span");
    By putDescription = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/div/div/form/div/div/div[2]/div[1]/textarea");
    By saveButton = By.xpath("//button[@type='button']");
    By skillsButton = By.xpath("//a[normalize-space()='Skills']");
    By addNewButton = By.xpath("//div[@class='ui teal button']");
    By inputSkill = By.xpath("//input[@placeholder='Add Skill']");
    By selectDropDown = By.xpath("//select[@class='ui fluid dropdown']");
    By addskillLevel = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/div[2]/select/option[3]");
    By saveSkillButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/span/input[1]");
    By educationButton = By.xpath("//a[normalize-space()='Education']");
    By educationNewButton = By.xpath("//div[@class='ui bottom attached tab segment tooltip-target active']//div[contains(@class,'ui teal button')][normalize-space()='Add New']");
    By universityName = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[1]/input");
    By universityDropdown = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[2]/select");
    By countryCollegeSelect = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[2]/select");
    By titleDropdown = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[2]/div[1]/select");
    By selectTitle = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[2]/div[1]/select");
    By inputDegree = By.xpath("//input[@placeholder='Degree']");
    By YearOfgraduation = By.xpath("//select[starts-with(@class,'ui dropdown') and contains(@name,'yearOfGraduation')]");
    By selectYear = By.xpath("//select[starts-with(@class,'ui dropdown') and contains(@name,'yearOfGraduation')]");
    By addnewButtun = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[3]/div/input[1]");
    By Languagebutton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]");
    By addlanguage = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/thead/tr/th[3]/div");
    By inputLanguagesTextBox = By.xpath("//input[@placeholder='Add Language']");
    By levelLanguage = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/div/div[2]/select/option[3]");
    By Addclick = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/div/div[3]/input[1]");
    By editButton = By.xpath("//span[contains(@class,'button')]");
    By editLanguage = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[1]/input");
    By selectLanguage = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[2]/select");
    By LanguageLevel = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[2]/select/option[2]");
    By updateButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/span/input[1]");


    public ProfilePage()
    {
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public void CreateDescription()
    {
        // click Description button
        // Thread.Sleep(3000);
        driver.findElement(descriptionButton).click();
        // Description textbox
        // Thread.Sleep(3000);
        driver.findElement(putDescription).clear();
        // Thread.Sleep(3000);
        driver.findElement(putDescription).sendKeys("nothing");
        // Thread.Sleep(3000);
        // click save button on Description
        Wait.WaitToBeClickable(driver, "xpath", "//button[@type='button']", 10);
        driver.findElement(saveButton).click();

    }

    public String getAddDescription()
    {

        return driver.findElement(putDescription).getText();
    }

    public void UpdateDescription(String description)
    {
        // Description button
        // Thread.Sleep(3000);
        driver.findElement(descriptionButton).click();
        // Description textbox
        // Thread.Sleep(3000);
        driver.findElement(putDescription).clear();
        // Thread.Sleep(3000);
        driver.findElement(putDescription).sendKeys(description);
        Wait.WaitToBeClickable(driver, "xpath", "//button[@type='button']", 10);
        // click save button on Description
        driver.findElement(saveButton).click();

    }


    public String getUpdatedDescription()
    {

        return driver.findElement(putDescription).getText();
    }


    public void AddSkill()
    {
        //click on SkillS Button
        driver.findElement(skillsButton).click();
        //click on Skill ADD new button
        driver.findElement(addNewButton).click();
        // Add Skill textbox
        driver.findElement(inputSkill).sendKeys("breathing");
        //Select dropdown in Skills
        driver.findElement(selectDropDown).click();
        // Select level in Skills
        driver.findElement(addskillLevel).click();
        // Save Skills click on add button
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/span/input[1]", 10);
        driver.findElement(saveSkillButton).click();
    }


    public void AddEducation(String Country, String University, String Title, String Degree, String Graduation)
    {
        // Create Education 
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(15));
        Wait.WaitToBeClickable(driver,"xpath","//a[normalize-space()='Education']", 15);
        driver.findElement(educationButton).click();
        //click on Education add new Button
        driver.findElement(educationNewButton).click();
        // Input College/University name
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[1]/input", 10);
        driver.findElement(universityName).clear();
        driver.findElement(universityName).sendKeys(University);
        // click on Country of College/University dropdown
        driver.findElement(universityDropdown).click();
        //// Select Country of College/University dropdown
        Select selectElementSelectCountry = new Select(driver.findElement(countryCollegeSelect));
        selectElementSelectCountry.selectByValue(Country);
        // click on title dropdown
        driver.findElement(titleDropdown).click();
        // Select title
        Select selectElementSelectTitle = new Select(driver.findElement(selectTitle));
        selectElementSelectTitle.selectByValue(Title);
        // Input degree
        driver.findElement(inputDegree).clear();
        driver.findElement(inputDegree).sendKeys(Degree);
        // Select Year of graduation dropdown
        driver.findElement(YearOfgraduation).click();
        // Choose year in dropdown list
        Wait.WaitToBeClickable(driver, "xpath", "//select[starts-with(@class,'ui dropdown') and contains(@name,'yearOfGraduation')]", 10);
        Select selectElementSelectYear = new Select(driver.findElement(selectYear));
        selectElementSelectYear.selectByValue(Graduation);
        // Thread.Sleep(2000);
        driver.findElement(selectYear).click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[3]/div/input[1]", 10);
        driver.findElement(addnewButtun).click();
        Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);


    }

    //public String GetUpdatedUniversityName()
    //{
    //    By actualUniversityName = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[2]");
    //    return actualUniversityName.getText();
    //}
    //public String GetUpdatedCountryCollegeSelect()
    //{
    //    By actualCountryCollegeSelect = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[1]");
    //    return actualCountryCollegeSelect.getText();
    //}
    //public String GetEducationTitle()
    //{
    //    By actualGetEducationTitle = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[3]");
    //    return actualGetEducationTitle.getText();

    //}
    //public String GetEducationDegree()
    //{
    //    By actualGetEducationDegree = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[4]");
    //    return actualGetEducationDegree.getText();

    //}
    //public String GetEducationSelectedYear()
    //{
    //    By actualSelectedYear = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[5]");
    //    return actualSelectedYear.getText();

    //}


    public void AddCertification()
    {

        // Create Certification 

        By certificationButon = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");
        driver.findElement(certificationButon).click();


        //click on add new Button to create Certification

        By addnewButton = By.xpath("//div[@class='ui bottom attached tab segment tooltip-target active']//div[@class='ui teal button '][normalize-space()='Add New']");
        driver.findElement(addnewButton).click();


        // Input Award into textBox Certification

        By awardsTextBox = By.xpath("//input[@placeholder='Certificate or Award']");
        driver.findElement(awardsTextBox).sendKeys("NetRiders Challenge 2011");
        // Thread.Sleep(2000);

        //Input Cerfication form into textBox

        By formTextBox = By.name("certificationFrom");
        driver.findElement(formTextBox).sendKeys("pdf");
        // Thread.Sleep(2000);

        //Select certification Year dropdown

        By certificationYear = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[2]/div[2]/select");
        driver.findElement(certificationYear).click();

        //Input cerfication year

        By selectYear = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[2]/div[2]/select/option[14]");
        driver.findElement(selectYear).click();


        // click on add button to save Certification

        By ADDButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[3]/input[1]");
        driver.findElement(ADDButton).click();

    }

    public void AddLanguages()
    {
        // Create Languages 
        driver.findElement(Languagebutton).click();
        // ADD language button
        driver.findElement(addlanguage).click();
        // Input languages in textBox
        driver.findElement(inputLanguagesTextBox).sendKeys("English");
        // Choose language level
        driver.findElement(levelLanguage).click();
        driver.findElement(Addclick).click();
    }
    public String GetDescription()
    {
        By actualDescription = By.xpath("//span[contains(text(),'An organized candidate is a detail-oriented person')]");
        return driver.findElement(actualDescription).getText();

    }

    public String getSkill()
    {

        //By skillsButton = By.xpath("//a[normalize-space()='Skills']");
        driver.findElement(skillsButton).click();


        By newSkill = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[1]");
        return driver.findElement(newSkill).getText();
    }

    public String newLanguage()
    {

        By Languagebutton = By.xpath("//a[contains(@class,'item active')]");
        driver.findElement(Languagebutton).click();

        By updateLanguage = By.xpath("//div[@id='account-profile-section']//form//tbody//td[1]");
        return driver.findElement(updateLanguage).getText();

    }
    public String getCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);
        By certificationButon = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");  ////*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]
        driver.findElement(certificationButon).click();
        By newCertification = By.xpath("//td[normalize-space()='pdf']");
        return driver.findElement(newCertification).getText();

    }

    // EDIT Certification

    public void EditCertification()
    {

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);

        By certificationButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");
        driver.findElement(certificationButton).click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr[last()]/td[4]/span[1]/i", 10);
        By updateCertification = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr[last()]/td[4]/span[1]/i");
        driver.findElement(updateCertification).click();

        By CertificateOrAward = By.xpath("//input[contains(@class , 'certification-award capitalize')]");

        driver.findElement(CertificateOrAward).clear();

        driver.findElement(CertificateOrAward).sendKeys("NetRiders2012");


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[2]/input", 10);
        By certificationFrom = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[2]/input");
        driver.findElement(certificationFrom).clear();
        driver.findElement(certificationFrom).sendKeys("html");

        //Wait.WaitToBeClickable(driver, "xpath", "//select[contains(@class , 'ui fluid dropdown')]", 10);
        By certificationYearSelect = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select");
        driver.findElement(certificationYearSelect).click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select/option[11]", 10);
        By selected2014 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select/option[11]");
        driver.findElement(selected2014).click();


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td/div/span/input[1]", 10);
        By updateCertificationButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td/div/span/input[1]");
        driver.findElement(updateCertificationButton).click();
        //Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);

        By certificationButton1 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");
        driver.findElement(certificationButton1).click();

    }

    public String updatedCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@class , 'item active')]", 10);
        By certificationButton = By.xpath("//a[contains(@class , 'item active')]");
        driver.findElement(certificationButton).click();


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td[1]", 10);
        By certification1 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td[1]");
        return driver.findElement(certification1).getText();

    }
    public void deleteCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 5);
        By certificationButon1 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");
        driver.findElement(certificationButon1).click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td[4]/span[2]/i", 5);
        By deleteCertification1 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td[4]/span[2]/i");


        driver.findElement(deleteCertification1).click();

    }
    public String DeletedCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 5);
        By certificationButon1 = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]");
        driver.findElement(certificationButon1).click();

        By deleteSkill = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody/tr/td");
        return driver.findElement(deleteSkill).getText();

    }

    // Edit Language

    public void editNewLanguage()
    {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]")));
        driver.findElement(Languagebutton).click();
        Wait.WaitToBeClickable(driver, "xpath", "//span[contains(@class,'button')]", 10);
        driver.findElement(editButton).click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[1]/input", 10);
        driver.findElement(editLanguage).clear();
        // Thread.Sleep(2000);
        driver.findElement(editLanguage).sendKeys("Italian");
        // Thread.Sleep(2000);
        driver.findElement(selectLanguage).click();
        driver.findElement(LanguageLevel).click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/span/input[1]", 10);
        driver.findElement(updateButton).click();
        Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        driver.findElement(Languagebutton).click();
    }
    public String editedLanguage1()
    {
        By Languageesbutton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]");
        driver.findElement(Languageesbutton).click();

        By lastedit = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[1]");
        return driver.findElement(lastedit).getText();

    }

    public void deletedLanguage1()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]", 10);
        By Languageesbutton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]");
        driver.findElement(Languageesbutton).click();

        By languageRemoved = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[3]/span[2]/i");
        driver.findElement(languageRemoved).click();

    }
    public String getdeleteLanguage()

    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]", 10);
        By Languageesbutton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]");
        driver.findElement(Languageesbutton).click();
        By languageRemoved = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[3]/span[2]/i");
        return driver.findElement(languageRemoved).getText();
    }




    // Edit Skills


    public void editedSkills()
    {

        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@data-tab,'second')]   ", 10);
        By clickskillsButton = By.xpath("//a[contains(@data-tab,'second')]   ");
        driver.findElement(clickskillsButton).click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[3]/span[1]", 10);
        By outlineWriteIcon = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[3]/span[1]");
        driver.findElement(outlineWriteIcon).click();

        Wait.WaitToBeClickable(driver, "xpath", "//input[contains(@value, 'breathing')]", 10);
        By editskill = By.xpath("//input[contains(@value, 'breathing')]");
        driver.findElement(editskill).clear();
        driver.findElement(editskill).sendKeys("Computer skills");
        Wait.WaitToBeClickable(driver, "xpath", "//select[contains(@name,'level')]", 10);
        By selectLevel = By.xpath("//select[contains(@name,'level')]");
        driver.findElement(selectLevel).click();
        Wait.WaitToBeClickable(driver, "xpath", "//option[contains(@value,'Expert')]", 10);
        By optionSelect = By.xpath("//option[contains(@value,'Expert')]");

        Wait.WaitToBeClickable(driver, "xpath", "//input[contains(@class,'ui teal button')]", 10);
        By updateButton = By.xpath("//input[contains(@class,'ui teal button')]");
        driver.findElement(updateButton).click();

        //refresh the page            
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@data-tab,'second')]   ", 10);
        By clickskillsButton1 = By.xpath("//a[contains(@data-tab,'second')]   ");
        driver.findElement(clickskillsButton1).click();


    }
    public String newEditSkills()
    {

        By clickskillsButton = By.xpath("//a[@class='item active']");
        driver.findElement(clickskillsButton).click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[1]", 10);
        By neweditedskills = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]");
        return driver.findElement(neweditedskills).getText();


    }
    public void deleteNewSkills()
    {
        By clickskillsButton = By.xpath("//a[@class='item active']");
        driver.findElement(clickskillsButton).click();

        //Wait.WaitToBeClickable(driver, "xpath", "//*[@id="account-profile-section"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]", 10);
        By deletedNewSkills = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]");
        //driver.navigate().to("http://localhost:5000/Account/Profile");
        //driver.navigate().refresh();
        //By clickskillsButton1 = By.xpath("//a[@class='item active']");
        //clickskillsButton1.click();

    }
    public String lastDeleteSkill()
    {
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[2]", 10);
        By clickskillsButton = By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[1]/a[2]");
        driver.findElement(clickskillsButton).click();

        Wait.WaitToBeClickable(driver, "xpath", "/html/body/div[1]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[3]/span[2]", 10);
        By lastDelete = By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[3]/span[2]");
        return driver.findElement(lastDelete).getText();

    }


    public EducationInfo getEducationCountryName(String expectedCountryName)
    {
        EducationInfo educationInfo = new EducationInfo();
        var table = driver.findElement(By.xpath("//*[@id='account-profile-section']/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table"));
        // Find all rows within the table
        var rows = table.findElements(By.tagName("tr"));
        // Create a list to store the values from the table

        // Iterate over the rows (skipping the header row if applicable)
        for (int i = 1; i < rows.size(); i++)
        {
            var row = rows.get(i);
            // Find the columns within each row
            var columns = row.findElements(By.tagName("td"));
            // Add the desired column value to the list
            WebElement countryElement = columns.get(0); // Assuming the value is in the first column

            WebElement universityElement = columns.get(1); // Assuming the value is in the first column
            WebElement titleElement = columns.get(2);
            WebElement degreeElement = columns.get(3);
            WebElement graduationYearsElement = columns.get(4);


            if (expectedCountryName.equals(countryElement.getText()))
            {
                educationInfo.setCountryName(countryElement.getText());
                educationInfo.setTitleName(titleElement.getText());
                educationInfo.setDegreeName(degreeElement.getText());
                educationInfo.setGradutaiongName(graduationYearsElement.getText());
                educationInfo.setUniversityName(universityElement.getText());

            }


        }

        return educationInfo;


    }













}




