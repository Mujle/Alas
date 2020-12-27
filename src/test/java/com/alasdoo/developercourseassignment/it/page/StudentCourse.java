package com.alasdoo.developercourseassignment.it.page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentCourse extends StudentUserPage {

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/form/div[6]/button/span[1]")
    private WebElement toggleCourseButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[1]/button/span[1]")
    private WebElement newCourseButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[1]/form/div[1]/div")
    private WebElement courseDropdown;

    @FindBy(xpath = "/html/body/div[2]/div[3]/ul/li[1]")
    private WebElement firstParamInCourseDropdown;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[1]/form/div[2]/div/input[@name='classesBought']")
    private WebElement classesBoughtSlider;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[1]/form/div[3]/button[1]")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[1]/div/div[2]/div[1]")
    private WebElement boughtClassesButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[3]/div[2]/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[2]")
    private WebElement firstElementInBoughtClassesList;

    public StudentCourse(WebDriver driver) {
        super(driver);
    }

    public void clickToggleCourseButton() {
        toggleCourseButton.click();
    }

    public void clickAddNewCourseButton() {
        newCourseButton.click();
    }

    public void clickOnCourseDropdown() {
        courseDropdown.click();
    }

    public void clickOnFirstParamInCourseDropdown() {
        firstParamInCourseDropdown.click();
    }

    public void enterNegativeNumberOfBoughtCourses() {
        classesBoughtSlider.sendKeys(Keys.ARROW_DOWN);
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }

    public void clickOnBoughtClassesButton() {
        boughtClassesButton.click();
    }

    public Integer getFirstElementInBoughtClassesList() {
        return Integer.parseInt(firstElementInBoughtClassesList.getText());
    }

    public WebElement getNewCourseButton() {
        return newCourseButton;
    }

    public WebElement getClassesBoughtSlider() {
        return classesBoughtSlider;
    }
}
