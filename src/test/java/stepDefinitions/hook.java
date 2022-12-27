package stepDefinitions;

import config.setUp;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class hook extends setUp {

    @Before
    public void before() throws MalformedURLException {
        desiredCapabilities = new DesiredCapabilities();
        desiredCapabilities.setCapability("appium:appPackage", "com.wdiodemoapp");
        desiredCapabilities.setCapability("appium:appActivity", "com.wdiodemoapp.MainActivity");
        desiredCapabilities.setCapability("platformName", "Android");

        //-------Virtual Devices--------
//        desiredCapabilities.setCapability("appium:deviceName", "MyAVD");
//        desiredCapabilities.setCapability("appium:udid", "emulator-5554");

        //-------Redmi Devices--------
        desiredCapabilities.setCapability("appium:deviceName", "Redmi");
        desiredCapabilities.setCapability("appium:udid", "d37a9b7e7cf5");

        URL remoteUrl = new URL("http://127.0.0.1:4723/wd/hub");

        driver = new AndroidDriver(remoteUrl, desiredCapabilities);
    }

    @After
    public void after() {
        driver.quit();
    }

}
