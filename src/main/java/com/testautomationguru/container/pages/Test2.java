package com.testautomationguru.container.pages;

import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Test2 {
    
    private WebDriver driver;
    private WebDriverWait wait;
    private Actions action;
       
    Consumer<By> hover = (By by) -> {
        action.moveToElement(driver.findElement(by))
              .perform();
    };
    
    public OrderPage(final WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
        this.wait = new WebDriverWait(driver, 30);
        this.action = new Actions(driver);
    }

    public void goTo() {
      this.driver.get("https://www.google.com");
        System.out.println("Browser launched and navigated to Google");
    }
	

 

}

