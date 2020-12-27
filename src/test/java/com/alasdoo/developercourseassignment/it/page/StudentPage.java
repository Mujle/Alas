package com.alasdoo.developercourseassignment.it.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;

import java.util.List;

public class StudentPage extends PageObject {

    @FindBys({
            @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]")
    })
    private List<WebElement> tableRows;

    public StudentPage(WebDriver driver) {
        super(driver);
    }

    public boolean isTableEmpty() {
        return tableRows.isEmpty();
    }
}
