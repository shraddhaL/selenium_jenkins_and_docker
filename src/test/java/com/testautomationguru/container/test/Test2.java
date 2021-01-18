package com.testautomationguru.container.test;


import java.net.MalformedURLException;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.testautomationguru.container.pages.OrderPage;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.net.URL;

public class OrderTest extends BaseTest{

    private OrderPage store;

    @BeforeTest
    public void setUp() throws MalformedURLException {
        super.setUp();
        store = new OrderPage(driver);
    }
  driver.get("http:localhost:9090/roshambo");
    Assert.assertEquals(driver.getTitle(), "Rock Paper .Scissors!!!");

}
