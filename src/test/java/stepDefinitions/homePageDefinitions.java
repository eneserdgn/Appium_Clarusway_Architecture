package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import pages.homePage;
import utils.driverFactory;

public class homePageDefinitions {

    homePage homePage = new homePage(driverFactory.getDriver());

    @Given("user is on the Home Page")
    public void userIsOnTheHomePage() {
        homePage.checkImage();
    }

    @When("click Button on Home Page")
    public void clickButtonOnHomePage() {
        homePage.clickManButton();
    }

    @Then("should see Image on Home Page")
    public void shouldSeeImageOnHomePage() {
        String text = homePage.getText();
        Assert.assertEquals(text, "kontrol etmek istediğim text");
    }
}
