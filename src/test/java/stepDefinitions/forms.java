package stepDefinitions;

import config.setUp;
import io.appium.java_client.MobileBy;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import objects.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class forms extends setUp {

    pageHome elementPageHome = new pageHome();
    pageForms elementPageForms = new pageForms();
    String inputText;
    String switchStatusInitial;

    @Given("user is at application homepage")
    public void user_is_at_application_homepage() {
        wait = new WebDriverWait (driver,duration);
        WebElement picWebDriver = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getPicWebDriver()));
        picWebDriver.isDisplayed();

        WebElement textWebdriver = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getTextWebdriver()));
        textWebdriver.isDisplayed();

    }

    @When("user taps on Forms tab")
    public void user_taps_on_forms_tab() {
        wait = new WebDriverWait (driver,duration);
        WebElement buttonTab = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getTabForms()));
        buttonTab.click();
    }

    @When("user input field")
    public void user_input_field() {
        wait = new WebDriverWait (driver,duration);
        WebElement inputField = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getInputField()));
        inputField.isDisplayed();

        inputText = "Testing";
        inputField.sendKeys(inputText);
    }

    @When("user change switch state")
    public void user_change_switch_state() {
        wait = new WebDriverWait (driver,duration);
        WebElement buttonSwitch = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getButtonSwitch()));
        WebElement textSwitchStatus = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getTextSwitchStatus()));
        switchStatusInitial = textSwitchStatus.getText();

        buttonSwitch.click();
    }

    @When("user taps on dropdown menu")
    public void user_taps_on_dropdown_menu() {

        WebElement scrollToButtonDropDown = driver.findElement(MobileBy.AndroidUIAutomator(
                "new UiScrollable(new UiSelector().scrollable(true)).scrollIntoView(textContains(\"Select an item\"))"));
        scrollToButtonDropDown.click();
    }

    @When("user selects This app is awesome")
    public void user_selects_this_app_is_awesome() {
        wait = new WebDriverWait (driver,duration);
        WebElement textDropDown = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getTextDropDown()));
        textDropDown.click();
    }

    @When("user taps Active button")
    public void user_taps_active_button() {
        wait = new WebDriverWait (driver,duration);
        WebElement buttonActive = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getButtonActive()));
        buttonActive.click();
    }

    @When("user taps OK for Active confirmation")
    public void user_taps_ok_for_active_confirmation() {
        wait = new WebDriverWait (driver,duration);
        WebElement buttonActiveConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getButtonActiveConfirm()));
        buttonActiveConfirm.click();
    }

    @Then("user can see input field")
    public void user_can_see_input_field() {
        wait = new WebDriverWait (driver,duration);
        WebElement verifyInput = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getVerifyInput()));
        String inputResult = verifyInput.getText();
        Assert.assertEquals(inputResult, inputText);
    }

    @Then("user can see switch status is changed")
    public void user_can_see_switch_status_is_changed() {
        wait = new WebDriverWait (driver,duration);
        WebElement textSwitchStatus = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageForms.getTextSwitchStatus()));
        String switchStatusAfter = textSwitchStatus.getText();
        Assert.assertNotEquals(switchStatusAfter, switchStatusInitial);
    }



}
