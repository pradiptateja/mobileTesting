package config;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

public class setUp {

    protected static AppiumDriver driver;
    protected static DesiredCapabilities desiredCapabilities;
    public static int duration = 10;
    public static WebDriverWait wait;

}
