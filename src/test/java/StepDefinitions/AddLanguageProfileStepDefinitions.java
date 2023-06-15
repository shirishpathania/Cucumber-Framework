package StepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Utils.CommonDriver;

public class AddLanguageProfileStepDefinitions extends CommonDriver {

    SignInPage signInPageObj;
    HomePage homePageObj;
    ProfilePage profilePageObj;


    public AddLanguageProfileStepDefinitions()
    {
        homePageObj = new HomePage();
        profilePageObj = new ProfilePage();
        signInPageObj = new SignInPage();
    }


//        @Given("I launch and log into MarsQA portal successfully")
//    public void ILaunchAndLogIntoMarsQAPortalSuccessfully()
//    {
//
//        homePageObj.GoToSingPage();
//
//
//        signInPageObj.SignInActions();
//
//
//
//    }

        @When("I add a new Language")
    public void IAddANewLanguage()
    {


        profilePageObj.AddLanguages();
    }

        @Then("Then new language should be added successfully")
    public void ThenNewLanguageShouldBeAddedSuccessfully()
    {
        String language = profilePageObj.newLanguage();

        Assert.isTrue(language == "English", "Actual code and expected code do not match.");
    }
        @When("I edited a new language")
    public void IEditedANewLanguage()
    {

        profilePageObj.editNewLanguage();
    }
        @Then("Then a new language should be edited successfully")
    public void ThenANewLanguageShouldBeEditedSuccessfully()
    {
        String editedLanguage = profilePageObj.editedLanguage1();
        Assert.isTrue(editedLanguage == "Italian", "Actual code and expected code do not match.");
    }
        @When("I deleted a language")
    public void IDeletedALanguage()
    {
        ProfilePage profilePageObj = new ProfilePage();
        profilePageObj.deletedLanguage1();


    }
        @Then("Then language should be deleted")
    public void ThenLanguageShouldBeDeleted()
    {
        String deletedLanguage2 = profilePageObj.getdeleteLanguage();
        Assert.isTrue(deletedLanguage2 != "Italian", "Actual code and expected code do not match.");
    }
}
