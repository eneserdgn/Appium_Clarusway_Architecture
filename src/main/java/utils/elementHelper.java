package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.By;

public class elementHelper {

    AppiumDriver driver;

    public elementHelper(AppiumDriver appiumDriver) {
        driver = appiumDriver;
    }

    public void findElement() {
        driver.findElement(By.xpath(""));
    }

}
