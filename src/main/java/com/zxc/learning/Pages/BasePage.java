package com.zxc.learning.Pages;

import com.zxc.learning.Main;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;

public abstract class BasePage extends Main{

    public void selectNextTab(){
        ArrayList<String> tabs = new ArrayList<>(getDriver().getWindowHandles());
        getDriver().switchTo().window(tabs.get(tabs.size()-1));
    }

    public void fillField(WebElement element, String value){
        element.clear();
        element.sendKeys(value);
    }
}
