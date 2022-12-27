package stepDefinitions;

import config.setUp;
import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.touch.LongPressOptions;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.ElementOption;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.time.Duration;

import static io.appium.java_client.touch.offset.ElementOption.element;
import static java.time.Duration.ofSeconds;

public class drag extends setUp {

    TouchAction action = new TouchAction((PerformsTouchActions) driver);

    pageDrag elementPageDrag = new pageDrag();
    pageHome elementPageHome = new pageHome();

    @Given("user taps on drag tab")
    public void user_taps_on_drag_tab() {
        WebElement dragTab = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getTabDrag()));
        dragTab.click();
    }

    @When("user drag and drop puzzle pieces")
    public void user_drag_and_drop_puzzle_pieces() {

        WebElement picA = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicA()));
        WebElement dropA = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropA()));

        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picA)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropA))
                .release()
                .perform();

        WebElement picB = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicB()));
        WebElement dropB = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropB()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picB)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropB))
                .release()
                .perform();

        WebElement picC = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicC()));
        WebElement dropC = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropC()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picC)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropC))
                .release()
                .perform();

        WebElement picD = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicD()));
        WebElement dropD = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropD()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picD)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropD))
                .release()
                .perform();

        WebElement picE = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicE()));
        WebElement dropE = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropE()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picE)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropE))
                .release()
                .perform();

        WebElement picF = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicF()));
        WebElement dropF = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropF()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picF)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropF))
                .release()
                .perform();

        WebElement picG = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicG()));
        WebElement dropG = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropG()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picG)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropG))
                .release()
                .perform();

        WebElement picH = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicH()));
        WebElement dropH = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropH()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picH)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropH))
                .release()
                .perform();

        WebElement picI = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getPicI()));
        WebElement dropI = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getDropI()));
        action.longPress(new LongPressOptions().withElement(new ElementOption().withElement(picI)))
                .waitAction(WaitOptions.waitOptions(Duration.ofSeconds(3)))
                .moveTo(element(dropI))
                .release()
                .perform();
    }

    @Then("user is notified congratulations message")
    public void user_is_notified_congratulations_message() {
        WebElement textCongrats = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageDrag.getTextCongrats()));
        textCongrats.isDisplayed();
    }
}
