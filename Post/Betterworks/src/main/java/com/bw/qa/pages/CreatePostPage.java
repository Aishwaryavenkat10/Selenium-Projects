package com.bw.qa.pages;

import com.bw.qa.base.TestBase;
import com.bw.qa.util.TestUtil;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatePostPage extends TestBase {
    @FindBy(xpath = "//button[@id='create-button']")
    WebElement createPostBtn;
    @FindBy(xpath = "//span[@class='Select-arrow']")
    WebElement dropdownBtn;
    @FindBy(xpath = "//div/button[text()='Select']")
    WebElement selectBtn;
    @FindBy(xpath = "//div[@class='form-group']/textarea")
    WebElement textArea;
    @FindBy(xpath = "//button[text()='Publish post']")
    WebElement publishPostBtn;


    public CreatePostPage(){

        PageFactory.initElements(driver,this);
    }
    TestUtil tu = new TestUtil();

    public void clickOnCreateNewPostBtn(){

        createPostBtn.click();
    }
    public void selectPostOption(String option){

        if (option.toLowerCase() == "anonymous"){
            option = "Anonymous";
        }
        else if (option.toLowerCase() == "official"){
            option = "Official";
        }
        else if (option.toLowerCase() == "named"){
            option = "Named";
        }

        WebElement optionElement =  driver.findElement(By.xpath("//span[text()='"+option+"']/parent::label//input"));
        optionElement.click();
    }

    public void selectPostType(String type){
        if(type.toLowerCase() == "open"){
            type = "OPEN";
        }
        else if (type.toLowerCase() == "multiple choice"){
            type = "MULTIPLE CHOICE";
        }

        WebElement typeElement = driver.findElement(By.xpath("//div/button[text()='"+type+"']"));
        typeElement.click();
    }

    public void selectGroup(String group){
        dropdownBtn.click();
        WebElement groupType = driver.findElement(By.xpath("//div[@class='Select-menu-outer']/div/div/div[text()='"+group+"']"));
        groupType.click();
        selectBtn.click();
    }
    public void createPost(String content){
//        textArea.sendKeys(content);
        tu.doSendKeys(textArea,content);
        publishPostBtn.click();

    }

}
// //span[text()='Anonymous']/parent::label//input
//setTimeout(()=>{debugger;},5000);