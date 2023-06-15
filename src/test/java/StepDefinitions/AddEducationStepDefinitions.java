package StepDefinitions;

import org.junit.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Pages.model.EducationInfo;
import Utils.CommonDriver;

public class AddEducationStepDefinitions extends CommonDriver {

    HomePage homePageObj;
    ProfilePage profilePageObj;
    SignInPage signInPageObj;

    public AddEducationStepDefinitions()
    {
        homePageObj = new HomePage();
        signInPageObj = new SignInPage();
        profilePageObj = new ProfilePage();
    }
    @Given("I launch and log into MarsQA portal successfully")
    public void ILaunchAndLogIntoMarsQAPortalSuccessfully()
    {
        homePageObj.GoToSingPage();


        signInPageObj.SignInActions();
    }

    @When("^I add my education including '(.*)','(.*)','(.*)','(.*)','(.*)'$")
    public void iAddMyEducationIncludingCountryUniversityTitleDegreeGraduation(String Country, String University, String Title, String Degree, String Graduation) {
        profilePageObj.AddEducation(Country, University, Title, Degree, Graduation);
    }

    @Then("I am able to see my education details including '(.*)','(.*)','(.*)','(.*)','(.*)'$")
    public void iAmAbleToSeeMyEducationDetailsIncludingCountryUniversityTitleDegreeGraduation(String country, String University, String Title, String Degree, String Graduation) {
        EducationInfo educationInfo = profilePageObj.getEducationCountryName(country);
        Assert.assertTrue(country.contains(educationInfo.getCountryName()));
        EducationInfo educationInfo1 = profilePageObj.getEducationCountryName(University);
        Assert.assertTrue(University.contains(educationInfo.getUniversityName()));
        EducationInfo educationInfo2 = profilePageObj.getEducationCountryName(Title);
        Assert.assertTrue(Title.contains(educationInfo.getTitleName()));
        EducationInfo educationInfo3 = profilePageObj.getEducationCountryName(Degree);
        Assert.assertTrue(Degree.contains(educationInfo.getDegreeName()));
        EducationInfo educationInfo4 = profilePageObj.getEducationCountryName(Graduation);
        Assert.assertTrue(Graduation.contains(educationInfo.getGradutaiongName()));


        //String EducationTitleUpdate = profilePageObj.GetEducationTitle();
        //Assert.That(EducationTitleUpdate == Title, "Actual code and expected code do not match.");
        //String EducationDegreeUpdate = profilePageObj.GetEducationDegree();
        //Assert.That(EducationDegreeUpdate == Degree, "Actual code and expected code do not match.");
        //String EducationSelectedYearUpdate = profilePageObj.GetEducationSelectedYear();
        //Assert.That(EducationSelectedYearUpdate == Graduation, "Actual code and expected code do not match.");
    }
}
