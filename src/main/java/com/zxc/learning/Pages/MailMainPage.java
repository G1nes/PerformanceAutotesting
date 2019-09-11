package com.zxc.learning.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MailMainPage extends BasePage{
    public MailMainPage(WebDriver driver){
        PageFactory.initElements(getDriver(),this);
        //new WebDriverWait(getDriver(),10).until(ExpectedConditions.visibilityOf(inboxMessages));
    }
    @FindBy(xpath = "//a[contains(text(), 'Отправленные')]")
    public WebElement inboxMessages;
}
