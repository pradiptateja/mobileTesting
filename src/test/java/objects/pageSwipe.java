package objects;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileCommand;
import org.openqa.selenium.By;

public class pageSwipe {

    By scrollToRobot = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).scrollIntoView(descriptionContains(\"WebdriverIO logo\"))");
    public By getScrollToRobot() {
        return scrollToRobot;
    }

    By swipeToCompatible = MobileBy.AndroidUIAutomator("new UiScrollable (new UiSelector().scrollable(true)).setAsHorizontalList().scrollIntoView(textContains(\"COMPATIBLE\"))");
    public By getSwipeToCompatible() {
        return swipeToCompatible;
    }
}
