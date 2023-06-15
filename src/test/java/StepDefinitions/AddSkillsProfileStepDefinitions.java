package StepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Utils.CommonDriver;

public class AddSkillsProfileStepDefinitions extends CommonDriver {

    HomePage homePageObj;
    ProfilePage profilePageObj;
    SignInPage signInPageObj;

    public AddSkillsProfileStepDefinitions()
    {
        homePageObj = new HomePage();
        profilePageObj = new ProfilePage();
        signInPageObj = new SignInPage();
    }




//        @Given("I lunch and log into MarsQA portal successfully")
//    public void GivenILunchAndLogIntoMarsQAPortalSuccessfully()
//    {
//
//
//
//        //Home Page Object initalization and definition
//
//
//        homePageObj.GoToSingPage();
//
//        //SignIn Page Object initalization and definition
//
//
//        signInPageObj.SignInActions();
//    }

        @When("I add new Skill")
    public void WhenIAddNewSkill()
    {

        profilePageObj.getSkill();

    }

        @Then("Then new Skill should be added successfully")
    public void ThenThenNewSkillShouldBeAddedSuccessfully()
    {
        String skill = profilePageObj.getSkill();
        Assert.isTrue(skill == "breathing", "Actual code and expected code do not match.");

    }
        @When("I edited a new skill")
    public void WhenIEditedANewSkill()
    {
        profilePageObj.editedSkills();
    }
        @Then("Then the new skill should be edited successfully")
    public void ThenThenTheNewSkillShouldBeEditedSuccessfully()
    {
        String newEdit = profilePageObj.newEditSkills();
        Assert.isTrue(newEdit == "Computer skills", "Actual code and expected code do not match.");
    }
        @When("I deleted a new skill")
    public void WhenIDeletedANewSkill()
    {
        profilePageObj.deleteNewSkills();
    }
        @Then("Then a new skill should be deleted successfully")
    public void ThenThenANewSkillShouldBeDeletedSuccessfully()
    {
        String deletedSkills1 = profilePageObj.lastDeleteSkill();
        Assert.isTrue(deletedSkills1 != "Computer skills", "Actual code and expected code do not match.");
    }
}
