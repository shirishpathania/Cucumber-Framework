package StepDefinitions;

import dev.failsafe.internal.util.Assert;
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
        profilePageObj = new ProfilePage();
        homePageObj = new HomePage();
        signInPageObj = new SignInPage();
    }
    @Given("I launch and log into MarsQA portal successfully")
    public void ILaunchAndLogIntoMarsQAPortalSuccessfully()
    {
        homePageObj.GoToSingPage();


        signInPageObj.SignInActions();
    }

    @When("^I add my education including \'(.*)\',\'(.*)\',\'(.*)\',\'(.*)\',\'(.*)\'$")
    public void iAddMyEducationIncludingCountryUniversityTitleDegreeGraduation(String Country, String University, String Title, String Degree, String Graduation) {
        profilePageObj.AddEducation(Country, University, Title, Degree, Graduation);
    }

    @Then("I am able to see my education details including \'(.*)\',\'(.*)\',\'(.*)\',\'(.*)\',\'(.*)\'$")
    public void iAmAbleToSeeMyEducationDetailsIncludingCountryUniversityTitleDegreeGraduation(String country, String University, String Title, String Degree, String Graduation) {
        EducationInfo educationInfo = profilePageObj.getEducationCountryName(country);
        Assert.isTrue(country == educationInfo.getCountryName(),"");
        EducationInfo educationInfo1 = profilePageObj.getEducationCountryName(University);
        Assert.isTrue(University == educationInfo.getUniversityName(), "");
        EducationInfo educationInfo2 = profilePageObj.getEducationCountryName(Title);
        Assert.isTrue(Title == educationInfo.getTitleName(), "");
        EducationInfo educationInfo3 = profilePageObj.getEducationCountryName(Degree);
        Assert.isTrue(Degree == educationInfo.getDegreeName(), "");
        EducationInfo educationInfo4 = profilePageObj.getEducationCountryName(Graduation);
        Assert.isTrue(Graduation == educationInfo.getGradutaiongName(), "");


        //String EducationTitleUpdate = profilePageObj.GetEducationTitle();
        //Assert.That(EducationTitleUpdate == Title, "Actual code and expected code do not match.");
        //String EducationDegreeUpdate = profilePageObj.GetEducationDegree();
        //Assert.That(EducationDegreeUpdate == Degree, "Actual code and expected code do not match.");
        //String EducationSelectedYearUpdate = profilePageObj.GetEducationSelectedYear();
        //Assert.That(EducationSelectedYearUpdate == Graduation, "Actual code and expected code do not match.");
    }


}
