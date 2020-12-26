package com.alasdoo.developercourseassignment.it.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SettingsPage extends PageObject{

    @FindBy(tagName = "button")
    private WebElement startButton;

    @FindBy(xpath = "//span[.='Injected: Students(20), Teachers(20), Courses(20)']")
    private WebElement injectionResponse;

    public SettingsPage(WebDriver driver) {
        super(driver);
    }

    public void startInjection(){
        startButton.click();
    }

    public String getInjectionResponse() {
        return injectionResponse.getText();
    }
}
