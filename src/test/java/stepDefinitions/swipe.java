package stepDefinitions;

import config.setUp;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import objects.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class swipe extends setUp {

    pageHome elementPageHome = new pageHome();
    pageSwipe elementPageSwipe = new pageSwipe();

    @When("user taps on Swipe tab")
    public void user_taps_on_swipe_tab() {

        WebElement buttonSwipe = wait.until(ExpectedConditions.presenceOfElementLocated(elementPageHome.getTabSwipe()));
        buttonSwipe.click();
    }

    @Then("user founds hidden robot by swiping vertically")
    public void user_founds_hidden_robot_by_swiping_vertically() {

        WebElement scrollToRobot = driver.findElement(elementPageSwipe.getScrollToRobot());
        scrollToRobot.isDisplayed();

    }

    @Then("user founds compatible card by swiping horizontally")
    public void user_founds_compatible_card_by_swiping_horizontally() {

        WebElement swipeToCompatible = driver.findElement(elementPageSwipe.getSwipeToCompatible());
        swipeToCompatible.isDisplayed();
    }

}
