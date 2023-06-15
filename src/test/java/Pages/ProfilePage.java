package Pages;

import Pages.model.EducationInfo;
import Utils.CommonDriver;
import Utils.Wait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class ProfilePage extends CommonDriver
{
    WebDriverWait wait1;
    private WebElement descriptionButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/div/div/div/h3/span"));
    private WebElement putDescription = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/div/div/form/div/div/div[2]/div[1]/textarea"));
    private WebElement saveButton = driver.findElement(By.xpath("//button[@type='button']"));
    private WebElement skillsButton = driver.findElement(By.xpath("//a[normalize-space()='Skills']"));
    private WebElement addNewButton = driver.findElement(By.xpath("//div[@class='ui teal button']"));
    private WebElement inputSkill = driver.findElement(By.xpath("//input[@placeholder='Add Skill']"));
    private WebElement selectDropDown = driver.findElement(By.xpath("//select[@class='ui fluid dropdown']"));
    private WebElement addskillLevel = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/div[2]/select/option[3]"));
    private WebElement saveSkillButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/span/input[1]"));
    private WebElement educationButton = driver.findElement(By.xpath("//a[normalize-space()='Education']"));
    private WebElement educationNewButton = driver.findElement(By.xpath("//div[@class='ui bottom attached tab segment tooltip-target active']//div[contains(@class,'ui teal button')][normalize-space()='Add New']"));
    private WebElement universityName = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[1]/input"));
    private WebElement universityDropdown = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[2]/select"));
    private WebElement countryCollegeSelect = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[2]/select"));
    private WebElement titleDropdown = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[2]/div[1]/select"));
    private WebElement selectTitle = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[2]/div[1]/select"));
    private WebElement inputDegree = driver.findElement(By.xpath("//input[@placeholder='Degree']"));
    private WebElement YearOfgraduation = driver.findElement(By.xpath("//select[starts-with(@class,\"ui dropdown\") and contains(@name,\"yearOfGraduation\")]"));
    private WebElement selectYear = driver.findElement(By.xpath("//select[starts-with(@class,\"ui dropdown\") and contains(@name,\"yearOfGraduation\")]"));
    private WebElement addnewButtun = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[3]/div/input[1]"));
    private WebElement Languagebutton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]"));
    private WebElement addlanguage = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/thead/tr/th[3]/div"));
    private WebElement inputLanguagesTextBox = driver.findElement(By.xpath("//input[@placeholder='Add Language']"));
    private WebElement levelLanguage = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/div/div[2]/select/option[3]"));
    private WebElement Addclick = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/div/div[3]/input[1]"));
    private WebElement editButton = driver.findElement(By.xpath("//span[contains(@class,\"button\")]"));
    private WebElement editLanguage = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[1]/input"));
    private WebElement selectLanguage = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[2]/select"));
    private WebElement LanguageLevel = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[2]/select/option[2]"));
    private WebElement updateButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/span/input[1]"));


    public ProfilePage()
    {
        wait1 = new WebDriverWait(driver, Duration.ofSeconds(15));

    }

    public void CreateDescription()
    {
        // click Description button
        // Thread.Sleep(3000);
        descriptionButton.click();
        // Description textbox
        // Thread.Sleep(3000);
        putDescription.clear();
        // Thread.Sleep(3000);
        putDescription.sendKeys("nothing");
        // Thread.Sleep(3000);
        // click save button on Description
        Wait.WaitToBeClickable(driver, "xpath", "//button[@type='button']", 10);
        saveButton.click();

    }

    public String getAddDescription()
    {

        return putDescription.getText();
    }

    public void UpdateDescription(String description)
    {
        // Description button
        // Thread.Sleep(3000);
        descriptionButton.click();
        // Description textbox
        // Thread.Sleep(3000);
        putDescription.clear();
        // Thread.Sleep(3000);
        putDescription.sendKeys(description);
        Wait.WaitToBeClickable(driver, "xpath", "//button[@type='button']", 10);
        // click save button on Description
        saveButton.click();

    }


    public String getUpdatedDescription()
    {

        return putDescription.getText();
    }


    public void AddSkill()
    {
        //click on SkillS Button
        skillsButton.click();
        //click on Skill ADD new button
        addNewButton.click();
        // Add Skill textbox
        inputSkill.sendKeys("breathing");
        //Select dropdown in Skills
        selectDropDown.click();
        // Select level in Skills
        addskillLevel.click();
        // Save Skills click on add button
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/div/span/input[1]", 10);
        saveSkillButton.click();
    }


    public void AddEducation(String Country, String University, String Title, String Degree, String Graduation)
    {
        // Create Education 
        WebDriverWait wait2 = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait2.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[normalize-space()='Education']")));
        educationButton.click();
        //click on Education add new Button
        educationNewButton.click();
        // Input College/University name
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[1]/div[1]/input", 10);
        universityName.clear();
        universityName.sendKeys(University);
        // click on Country of College/University dropdown
        universityDropdown.click();
        //// Select Country of College/University dropdown
        Select selectElementSelectCountry = new Select(countryCollegeSelect);
        selectElementSelectCountry.selectByValue(Country);
        // click on title dropdown
        titleDropdown.click();
        // Select title
        Select selectElementSelectTitle = new Select(selectTitle);
        selectElementSelectTitle.selectByValue(Title);
        // Input degree
        inputDegree.clear();
        inputDegree.sendKeys(Degree);
        // Select Year of graduation dropdown
        YearOfgraduation.click();
        // Choose year in dropdown list
        Wait.WaitToBeClickable(driver, "xpath", "//select[starts-with(@class,\"ui dropdown\") and contains(@name,\"yearOfGraduation\")]", 10);
        Select selectElementSelectYear = new Select(selectYear);
        selectElementSelectYear.selectByValue(Graduation);
        // Thread.Sleep(2000);
        selectYear.click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/div/div[3]/div/input[1]", 10);
        addnewButtun.click();
        Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);


    }

    //public String GetUpdatedUniversityName()
    //{
    //    WebElement actualUniversityName = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[2]"));
    //    return actualUniversityName.getText();
    //}
    //public String GetUpdatedCountryCollegeSelect()
    //{
    //    WebElement actualCountryCollegeSelect = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[1]"));
    //    return actualCountryCollegeSelect.getText();
    //}
    //public String GetEducationTitle()
    //{
    //    WebElement actualGetEducationTitle = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[3]"));
    //    return actualGetEducationTitle.getText();

    //}
    //public String GetEducationDegree()
    //{
    //    WebElement actualGetEducationDegree = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[4]"));
    //    return actualGetEducationDegree.getText();

    //}
    //public String GetEducationSelectedYear()
    //{
    //    WebElement actualSelectedYear = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table/tbody[1]/tr/td[5]"));
    //    return actualSelectedYear.getText();

    //}


    public void AddCertification()
    {

        // Create Certification 

        WebElement certificationButon = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));
        certificationButon.click();


        //click on add new Button to create Certification

        WebElement addnewButton = driver.findElement(By.xpath("//div[@class='ui bottom attached tab segment tooltip-target active']//div[@class='ui teal button '][normalize-space()='Add New']"));
        addnewButton.click();


        // Input Award into textBox Certification

        WebElement awardsTextBox = driver.findElement(By.xpath("//input[@placeholder='Certificate or Award']"));
        awardsTextBox.sendKeys("NetRiders Challenge 2011");
        // Thread.Sleep(2000);

        //Input Cerfication form into textBox

        WebElement formTextBox = driver.findElement(By.name("certificationFrom"));
        formTextBox.sendKeys("pdf");
        // Thread.Sleep(2000);

        //Select certification Year dropdown

        WebElement certificationYear = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[2]/div[2]/select"));
        certificationYear.click();

        //Input cerfication year

        WebElement selectYear = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[2]/div[2]/select/option[14]"));
        selectYear.click();


        // click on add button to save Certification

        WebElement ADDButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/div/div[3]/input[1]"));
        ADDButton.click();

    }

    public void AddLanguages()
    {
        // Create Languages 
        Languagebutton.click();
        // ADD language button
        addlanguage.click();
        // Input languages in textBox
        inputLanguagesTextBox.sendKeys("English");
        // Choose language level
        levelLanguage.click();
        Addclick.click();
    }
    public String GetDescription()
    {
        WebElement actualDescription = driver.findElement(By.xpath("//span[contains(text(),'An organized candidate is a detail-oriented person')]"));
        return actualDescription.getText();

    }

    public String getSkill()
    {

        //WebElement skillsButton = driver.findElement(By.xpath("//a[normalize-space()='Skills']"));
        skillsButton.click();


        WebElement newSkill = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[1]"));
        return newSkill.getText();
    }

    public String newLanguage()
    {

        WebElement Languagebutton = driver.findElement(By.xpath("//a[contains(@class,'item active')]"));
        Languagebutton.click();

        WebElement updateLanguage = driver.findElement(By.xpath("//div[@id=\"account-profile-section\"]//form//tbody//td[1]"));
        return updateLanguage.getText();

    }
    public String getCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);
        WebElement certificationButon = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));  ////*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]
        certificationButon.click();
        WebElement newCertification = driver.findElement(By.xpath("//td[normalize-space()='pdf']"));
        return newCertification.getText();

    }

    // EDIT Certification

    public void EditCertification()
    {

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);

        WebElement certificationButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));
        certificationButton.click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr[last()]/td[4]/span[1]/i", 10);
        WebElement updateCertification = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr[last()]/td[4]/span[1]/i"));
        updateCertification.click();

        WebElement CertificateOrAward = driver.findElement(By.xpath("//input[contains(@class , 'certification-award capitalize')]"));

        CertificateOrAward.clear();

        CertificateOrAward.sendKeys("NetRiders2012");


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[2]/input", 10);
        WebElement certificationFrom = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[2]/input"));
        certificationFrom.clear();
        certificationFrom.sendKeys("html");

        //Wait.WaitToBeClickable(driver, "xpath", "//select[contains(@class , 'ui fluid dropdown')]", 10);
        WebElement certificationYearSelect = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select"));
        certificationYearSelect.click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select/option[11]", 10);
        WebElement selected2014 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td/div/div/div[3]/select/option[11]"));
        selected2014.click();


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td/div/span/input[1]", 10);
        WebElement updateCertificationButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td/div/span/input[1]"));
        updateCertificationButton.click();
        //Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 10);

        WebElement certificationButton1 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));
        certificationButton1.click();

    }

    public String updatedCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@class , 'item active')]", 10);
        WebElement certificationButton = driver.findElement(By.xpath("//a[contains(@class , 'item active')]"));
        certificationButton.click();


        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td[1]", 10);
        WebElement certification1 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody[1]/tr/td[1]"));
        return certification1.getText();

    }
    public void deleteCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 5);
        WebElement certificationButon1 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));
        certificationButon1.click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td[4]/span[2]/i", 5);
        WebElement deleteCertification1 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[5]/div[1]/div[2]/div/table/tbody/tr/td[4]/span[2]/i"));


        deleteCertification1.click();

    }
    public String DeletedCertification()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]", 5);
        WebElement certificationButon1 = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[4]"));
        certificationButon1.click();

        WebElement deleteSkill = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody/tr/td"));
        return deleteSkill.getText();

    }

    // Edit Language

    public void editNewLanguage()
    {
        WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait1.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]")));
        Languagebutton.click();
        Wait.WaitToBeClickable(driver, "xpath", "//span[contains(@class,\"button\")]", 10);
        editButton.click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/div[1]/input", 10);
        editLanguage.clear();
        // Thread.Sleep(2000);
        editLanguage.sendKeys("Italian");
        // Thread.Sleep(2000);
        selectLanguage.click();
        LanguageLevel.click();
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td/div/span/input[1]", 10);
        updateButton.click();
        Wait.WaitToBeVisible(driver, "CssSelector", ".ns-box-inner", 5);
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        Languagebutton.click();
    }
    public String editedLanguage1()
    {
        WebElement Languageesbutton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]"));
        Languageesbutton.click();

        WebElement lastedit = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[1]"));
        return lastedit.getText();

    }

    public void deletedLanguage1()
    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]", 10);
        WebElement Languageesbutton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]"));
        Languageesbutton.click();

        WebElement languageRemoved = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[3]/span[2]/i"));
        languageRemoved.click();

    }
    public String getdeleteLanguage()

    {
        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]", 10);
        WebElement Languageesbutton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[1]"));
        Languageesbutton.click();
        WebElement languageRemoved = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[2]/div/div[2]/div/table/tbody/tr/td[3]/span[2]/i"));
        return languageRemoved.getText();
    }




    // Edit Skills


    public void editedSkills()
    {

        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@data-tab,'second')]   ", 10);
        WebElement clickskillsButton = driver.findElement(By.xpath("//a[contains(@data-tab,'second')]   "));
        clickskillsButton.click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[3]/span[1]", 10);
        WebElement outlineWriteIcon = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[3]/span[1]"));
        outlineWriteIcon.click();

        Wait.WaitToBeClickable(driver, "xpath", "//input[contains(@value, \"breathing\")]", 10);
        WebElement editskill = driver.findElement(By.xpath("//input[contains(@value, \"breathing\")]"));
        editskill.clear();
        editskill.sendKeys("Computer skills");
        Wait.WaitToBeClickable(driver, "xpath", "//select[contains(@name,'level')]", 10);
        WebElement selectLevel = driver.findElement(By.xpath("//select[contains(@name,'level')]"));
        selectLevel.click();
        Wait.WaitToBeClickable(driver, "xpath", "//option[contains(@value,'Expert')]", 10);
        WebElement optionSelect = driver.findElement(By.xpath("//option[contains(@value,'Expert')]"));

        Wait.WaitToBeClickable(driver, "xpath", "//input[contains(@class,'ui teal button')]", 10);
        WebElement updateButton = driver.findElement(By.xpath("//input[contains(@class,'ui teal button')]"));
        updateButton.click();

        //refresh the page            
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();
        Wait.WaitToBeClickable(driver, "xpath", "//a[contains(@data-tab,'second')]   ", 10);
        WebElement clickskillsButton1 = driver.findElement(By.xpath("//a[contains(@data-tab,'second')]   "));
        clickskillsButton1.click();


    }
    public String newEditSkills()
    {

        WebElement clickskillsButton = driver.findElement(By.xpath("//a[@class='item active']"));
        clickskillsButton.click();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[last()]/tr/td[1]", 10);
        WebElement neweditedskills = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]"));
        return neweditedskills.getText();


    }
    public void deleteNewSkills()
    {
        WebElement clickskillsButton = driver.findElement(By.xpath("//a[@class='item active']"));
        clickskillsButton.click();

        //Wait.WaitToBeClickable(driver, "xpath", "//*[@id="account-profile-section"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]", 10);
        WebElement deletedNewSkills = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[1]"));
        //driver.navigate().to("http://localhost:5000/Account/Profile");
        //driver.navigate().refresh();
        //WebElement clickskillsButton1 = driver.findElement(By.xpath("//a[@class='item active']"));
        //clickskillsButton1.click();

    }
    public String lastDeleteSkill()
    {
        driver.navigate().to("http://localhost:5000/Account/Profile");
        driver.navigate().refresh();

        Wait.WaitToBeClickable(driver, "xpath", "//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[2]", 10);
        WebElement clickskillsButton = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[1]/a[2]"));
        clickskillsButton.click();

        Wait.WaitToBeClickable(driver, "xpath", "/html/body/div[1]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[3]/span[2]", 10);
        WebElement lastDelete = driver.findElement(By.xpath("/html/body/div[1]/div/section[2]/div/div/div/div[3]/form/div[3]/div/div[2]/div/table/tbody[1]/tr/td[3]/span[2]"));
        return lastDelete.getText();

    }


    public EducationInfo getEducationCountryName(String expectedCountryName)
    {
        EducationInfo educationInfo = new EducationInfo();
        var table = driver.findElement(By.xpath("//*[@id=\"account-profile-section\"]/div/section[2]/div/div/div/div[3]/form/div[4]/div/div[2]/div/table"));
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




