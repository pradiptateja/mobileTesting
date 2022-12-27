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

    By scrollSignup = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(description(\"button-SIGN UP\"))");
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

    By buttonOKSuccessSignup = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public By getButtonOKSuccessSignup() {
        return buttonOKSuccessSignup;
    }

    By scrollLogin = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(description(\"button-LOGIN\"))");
    public By getScrollLogin() {
        return scrollLogin;
    }

    By textSuccessLogin = By.xpath("//android.widget.LinearLayout[@resource-id='android:id/title_template']");
    public By getTextSuccessLogin() {
        return textSuccessLogin;
    }

    By buttonOKSuccessLogin = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public By getButtonOKSuccessLogin() {
        return buttonOKSuccessLogin;
    }
}
