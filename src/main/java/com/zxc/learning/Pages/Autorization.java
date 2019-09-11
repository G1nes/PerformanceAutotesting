package com.zxc.learning.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Autorization extends BasePage{
    public Autorization(WebDriver driver){
        PageFactory.initElements(getDriver(), this);
        new WebDriverWait(driver, 10).until(ExpectedConditions.visibilityOf(emailForm));
    }
    @FindBy(xpath = "//input[@type = 'email']")
    public WebElement emailForm;

    @FindBy(xpath = "//span[contains(text(), 'Далее')]")
    public WebElement nextButton;

    @FindBy (xpath = "//input[@type = 'password']")
    public WebElement passwordForm;
}
