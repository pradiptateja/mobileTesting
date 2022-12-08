package objects;

import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;

public class pageLogin {

    By sectionSignup = By.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]");
    public By getSectionSignup() {
        return sectionSignup;
    }

    By sectionLogin = By.xpath("//android.view.ViewGroup[@content-desc=\"button-login-container\"]");
    public By getSectionLogin() {
        return sectionLogin;
    }

    By inputEmail = By.xpath("//android.widget.EditText[@content-desc=\"input-email\"]");
    public By getInputEmail() {
        return inputEmail;
    }

    By inputPassword = By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]");
    public By getInputPassword() {
        return inputPassword;
    }

    By inputPasswordConfirm = By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]");
    public By getInputPasswordConfirm() {
        return inputPasswordConfirm;
    }

    By scrollSignup = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"button-SIGN UP\"))");
    public By getScrollSignup() {
        return scrollSignup;
    }

    By textErrorEmail = By.xpath("//android.widget.TextView[@text='Please enter a valid email address']");
    public By getTextErrorEmail() {
        return textErrorEmail;
    }

    By textErrorPassword = By.xpath("//android.widget.TextView[@text='Please enter at least 8 characters']");
    public By getTextErrorPassword() {
        return textErrorPassword;
    }

    By textErrorPasswordConfirm = By.xpath("//android.widget.TextView[@text='Please enter the same password']");
    public By getTextErrorPasswordConfirm() {
        return textErrorPasswordConfirm;
    }

    By textSuccessSignup = By.xpath("//android.widget.LinearLayout[@resource-id='android:id/title_template']");
    public By getTextSuccessSignup() {
        return textSuccessSignup;
    }

    By buttonSuccessOK = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public By getButtonSuccessOK() {
        return buttonSuccessOK;
    }

    By buttonLogin = By.xpath("//android.view.ViewGroup[@content-desc=\"button-LOGIN\"]");
    public By getButtonLogin() {
        return buttonLogin;
    }

    By textSuccessLogin = By.xpath("//android.widget.LinearLayout[@resource-id='android:id/title_template']");
    public By getTextSuccessLogin() {
        return textSuccessLogin;
    }

    By buttonSuccessLogin = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public By getButtonSuccessLogin() {
        return buttonSuccessLogin;
    }
}
