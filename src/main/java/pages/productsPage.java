package pages;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class productsPage {

    AppiumDriver driver;
    By element = AppiumBy.xpath("//android");

    public productsPage(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public void checkElement() {

    }


}
