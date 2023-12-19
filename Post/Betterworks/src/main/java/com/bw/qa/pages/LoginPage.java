package com.bw.qa.pages;

import com.bw.qa.base.TestBase;
import com.bw.qa.util.TestUtil;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement verificationBtn;
    @FindBy(xpath = "//div[@class='form-group']//input")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    TestUtil test = new TestUtil();

    public LoginPage login(String un, String pwd) throws InterruptedException {

        test.doSendKeys(userName,un);
        Thread.sleep(5000);
        verificationBtn.click();
        Thread.sleep(5000);
        test.doSendKeys(password,pwd);
        loginBtn.click();
        return new LoginPage();
    }

}
