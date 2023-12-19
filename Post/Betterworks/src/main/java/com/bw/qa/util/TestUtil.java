package com.bw.qa.util;

import com.bw.qa.base.TestBase;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class TestUtil extends TestBase {
    WebDriverWait wait ;
    public   static int MIN_LOAD_TIMEOUT = 10;
    public   static int MID_LOAD_TIMEOUT = 20;
    public   static int MAX_LOAD_TIMEOUT = 30;

    public   static long IMPLICIT_WAIT = 20;

    public void setVisiblityofElement(WebElement element,int seconds){
        new WebDriverWait(driver,Duration.ofSeconds(seconds)).until(ExpectedConditions.visibilityOf(element));
    }
    public void clickable(WebElement element,int seconds){
        new WebDriverWait(driver,Duration.ofSeconds(seconds)).until(ExpectedConditions.elementToBeClickable(element));
    }

    public void doSendKeys(WebElement locator, String value){
        locator.sendKeys(value);
    }
}
