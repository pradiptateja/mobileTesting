package objects;

import org.openqa.selenium.By;

public class pageForms {

    By inputField = By.xpath("//android.widget.EditText[@content-desc='text-input']");
    public By getInputField() {
        return inputField;
    }

    By verifyInput = By.xpath("//android.widget.TextView[@content-desc='input-text-result']");
    public By getVerifyInput() {
        return verifyInput;
    }

    By buttonSwitch = By.xpath("//android.widget.Switch[@content-desc='switch']");
    public By getButtonSwitch() {
        return buttonSwitch;
    }

    By textSwitchStatus = By.xpath("//android.widget.TextView[@content-desc='switch-text']");
    public By getTextSwitchStatus() {
        return textSwitchStatus;
    }

    By buttonDropDown = By.xpath("//android.view.ViewGroup[@content-desc='Dropdown']");
    public By getButtonDropDown() {
        return buttonDropDown;
    }

    By textDropDown = By.xpath("//android.widget.CheckedTextView[@text='This app is awesome']");
    public By getTextDropDown() {
        return textDropDown;
    }

    By buttonActive = By.xpath("//android.view.ViewGroup[@content-desc='button-Active']");
    public By getButtonActive() {
        return buttonActive;
    }

    By buttonActiveConfirm = By.xpath("//android.widget.Button[@resource-id='android:id/button1']");
    public By getButtonActiveConfirm() {
        return buttonActiveConfirm;
    }
}

