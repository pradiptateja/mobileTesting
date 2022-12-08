package objects;

import org.openqa.selenium.By;

public class pageHome {


    By tabSwipe = By.xpath("//android.widget.Button[@content-desc='Swipe']");
    public By getTabSwipe() {
        return tabSwipe;
    }

    By tabForms = By.xpath("//android.widget.Button[@content-desc='Forms']");
    public By getTabForms() {
        return tabForms;
    }

    By tabLogin = By.xpath("//android.widget.Button[@content-desc=\"Login\"]");
    public By getTabLogin() {
        return tabLogin;
    }

    By picWebDriver = By.xpath("//android.widget.ImageView[@class='android.widget.ImageView'][1]");

    public By getPicWebDriver() {
        return picWebDriver;
    }

    By textWebdriver = By.xpath("//android.widget.TextView[@text='WEBDRIVER']");

    public By getTextWebdriver() {
        return textWebdriver;
    }
}
