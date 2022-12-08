package stepDefinitions;

import config.setUp;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import com.github.javafaker.Faker;

public class loginAndSignup extends setUp {

    Faker faker = new Faker();
    pageHome elementPageHome = new pageHome();
    pageLogin elementPageLogin = new pageLogin();

    String notEmail = faker.name().firstName();
    String email = faker.name().firstName()+"@email.com";
    String wrongPassword = faker.number().digits(5);
    String password = faker.number().digits(9);

    @Given("user taps on login tab")
    public void user_taps_on_login_tab() {
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getTabLogin()));
        buttonLogin.click();
    }

    @When("user taps on signup section")
    public void user_taps_on_signup_section() {
        WebElement sectionSignup = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getSectionSignup()));
        sectionSignup.click();
    }

    @When("user fills invalid email")
    public void user_fills_invalid_email() {
        WebElement inputEmail = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputEmail()));
        inputEmail.sendKeys(notEmail);
    }

    @When("user taps on signup button")
    public void user_taps_on_signup_button() {
        WebElement buttonSignUp = driver.findElement(elementPageLogin.getScrollSignup());
        buttonSignUp.click();
    }

    @Then("user is notified incorrect email message")
    public void user_is_notified_incorrect_email_message() {
        WebElement textErrorEmail = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getTextErrorEmail()));
        textErrorEmail.isDisplayed();
    }

    @When("user fills valid email")
    public void user_fills_valid_email() {
        WebElement inputEmail = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputEmail()));
        inputEmail.sendKeys(email);
    }

    @When("user fills password with less than eight char")
    public void user_fills_password_with_less_than_eight_char() {

        WebElement inputPassword = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputPassword()));
        inputPassword.sendKeys(wrongPassword);

    }

    @Then("user is notified password error")
    public void user_is_notified_password_error() {
        WebElement textErrorPassword = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getTextErrorPassword()));
        textErrorPassword.isDisplayed();
    }

    @When("user fills correct password")
    public void user_fills_correct_password() {
        WebElement inputPassword = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputPassword()));
        inputPassword.sendKeys(password);
    }

    @When("user fills different password confirmation")
    public void user_fills_different_password_confirmation() {
        WebElement inputPasswordConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputPasswordConfirm()));
        inputPasswordConfirm.sendKeys(email);
    }

    @Then("user is notified password confirmation error")
    public void user_is_notified_password_confirmation_error() {
        WebElement textErrorPasswordConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getTextErrorPasswordConfirm()));
        textErrorPasswordConfirm.isDisplayed();
    }

    @When("user fills correct password confirmation")
    public void user_fills_correct_password_confirmation() {
        WebElement inputPasswordConfirm = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getInputPasswordConfirm()));
        inputPasswordConfirm.sendKeys(password);
    }

    @Then("user is successfully signup")
    public void user_is_successfully_signup() {
        WebElement textSuccessSignup = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getTextSuccessSignup()));
        textSuccessSignup.isDisplayed();

        WebElement buttonSuccessOK = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getButtonSuccessOK()));
        buttonSuccessOK.click();
    }

    @When("user taps on login section")
    public void user_taps_on_login_section() {
        WebElement sectionLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getSectionLogin()));
        sectionLogin.click();
    }

    @When("user taps on login button")
    public void user_taps_on_login_button() {
        WebElement buttonLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getButtonLogin()));
        buttonLogin.click();
    }

    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        WebElement textSuccessLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getTextSuccessLogin()));
        textSuccessLogin.isDisplayed();

        WebElement buttonSuccessLogin = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageLogin.getButtonSuccessLogin()));
        buttonSuccessLogin.click();
    }

}
