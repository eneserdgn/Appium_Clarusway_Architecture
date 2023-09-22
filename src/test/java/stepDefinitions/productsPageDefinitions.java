package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.loginPage;
import pages.productsPage;
import utils.driverFactory;

public class productsPageDefinitions {

    productsPage productsPage = new productsPage(driverFactory.getDriver());
    loginPage loginPage = new loginPage(driverFactory.getDriver());

    @Given("user is on the Products Page")
    public void userIsOnTheProductsPage() {
        productsPage.checkElement();
    }

    @When("click Button on Products Page")
    public void clickButtonOnProductsPage() {
        loginPage.sendKeysEmailTextbox("mail@mail.com");
        loginPage.sendKeysPasswordTextbox("12345");
        loginPage.clickSignInButton();
        productsPage.checkElement();
    }

    @Then("should see Image on Products Page")
    public void shouldSeeImageOnProductsPage() {
        productsPage.checkElement();
    }
}
