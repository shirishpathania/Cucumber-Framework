package StepDefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import Pages.HomePage;
import Pages.ProfilePage;
import Pages.SignInPage;
import Utils.CommonDriver;

public class AddDescriptionStepDefinitions extends CommonDriver {

    HomePage homePageObj;
    ProfilePage profilePageObj;
    SignInPage signInPageObj;

    public AddDescriptionStepDefinitions()
    {
        profilePageObj = new ProfilePage();
        homePageObj = new HomePage();
        signInPageObj = new SignInPage();
    }



    @When("I add a new description")
    public void WhenIAddANewDescription()
    {
        profilePageObj.CreateDescription();
    }

    @Then("Then the new description should be added succesfully")
    public void ThenThenTheNewDescriptionShouldBeAddedSuccesfully()
    {
        String getDescription = profilePageObj.getAddDescription();
        Assert.isTrue(getDescription == "nothing", "Actual code and expected code do Not match");
    }
    @When("I updated my '([^']*)'")
    public void WhenIUpdatedMy(String description)
    {
        profilePageObj.UpdateDescription(description);
    }
    @Then("Then '([^']*)' should be updated successfully")
    public void ThenThenShouldBeUpdatedSuccessfully(String description)
    {
        String getDescription1 = profilePageObj.getUpdatedDescription();
        Assert.isTrue(getDescription1 == description, "Actual code and expected code do Not match");
    }
}
