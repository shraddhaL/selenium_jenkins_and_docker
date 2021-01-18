package com.testautomationguru.container.test;

import java.net.MalformedURLException;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testautomationguru.container.pages.SearchPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;
	
	
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class SearchTest extends BaseTest {

    private SearchPage google;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        super.setUp();
        google = new SearchPage(driver);
    }
	
public void chromeTest() throws Exception {
        URL url = new URL("http://localhost:4444/wd/hub");

        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--window-size=1280,1024");

        DesiredCapabilities desiredCapabilities = DesiredCapabilities.chrome();
        desiredCapabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        WebDriver driver = new RemoteWebDriver(url, desiredCapabilities);

        driver.get("http:localhost:8888");

        // 10 seconds to check inside the container via vnc
        Thread.sleep(1000 * 10);

        Assert.assertEquals(driver.getTitle(), "Rock Paper Scissors!!!");

        driver.quit();
    }

}
