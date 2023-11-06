package com.bw.qa.pages;

import com.bw.qa.base.TestBase;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends TestBase {
    @FindBy(xpath = "//input[@type='email']")
    WebElement userName;
    @FindBy(xpath = "//button[@type='submit']/span[@class='ladda-label']")
    WebElement verificationBtn;
    @FindBy(xpath = "//input[@type='password']")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement loginBtn;

    public LoginPage(){
        PageFactory.initElements(driver,this);
    }

    public CreatePostPage login(String un, String pwd){
        userName.sendKeys(un);
        verificationBtn.click();
        password.sendKeys(pwd);
        loginBtn.click();
        return new CreatePostPage();
    }

}
