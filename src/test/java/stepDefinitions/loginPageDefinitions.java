package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import utils.driverFactory;

public class loginPageDefinitions {

    loginPage loginPage = new loginPage(driverFactory.getDriver());

    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {
        loginPage.sendKeysEmailTextbox("mail@mail.com");
    }

    @When("click Button on Login Page")
    public void clickButtonOnLoginPage() {
        loginPage.sendKeysPasswordTextbox("12345");
    }

    @Then("should see Image on Login Page")
    public void shouldSeeImageOnLoginPage() {
        loginPage.clickSignInButton();
    }
}
