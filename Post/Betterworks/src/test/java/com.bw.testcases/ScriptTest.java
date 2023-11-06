package com.bw.testcases;

import com.bw.qa.base.TestBase;
import com.bw.qa.pages.CreatePostPage;
import com.bw.qa.pages.LoginPage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class ScriptTest extends TestBase {
    LoginPage lp;
    CreatePostPage cp;
    public ScriptTest(){
        super();
    }
    @BeforeMethod
    public void setUp(){
        initialization();
        lp = new LoginPage();
        cp = new CreatePostPage();
    }
    @Test
    public void loginTest(){
        cp = lp.login(prop.getProperty("username"),prop.getProperty("password"));
    }

    @Test
    public void createPostTest(){
        loginTest();
        cp.clickOnCreateNewPostBtn();
        cp.selectPostOption("official");
        cp.selectPostType("open");
        cp.selectGroup("Arnaud only");
        cp.createPost("Never to old to learn");
    }


    @AfterMethod
    public void tearDown(){
        driver.quit();
    }



}
