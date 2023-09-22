package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class loginPage {
    AppiumDriver driver;
    By emailTextbox = AppiumBy.xpath("//android");
    By passwordTextbox = AppiumBy.xpath("//android");
    By signInButton = AppiumBy.xpath("//android");


    public loginPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public void sendKeysEmailTextbox(String text) {

    }

    public void sendKeysPasswordTextbox(String text) {

    }

    public void clickSignInButton() {

    }


}
