package com.alasdoo.developercourseassignment.it.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class TeacherUserPage extends TeacherPage {

    @FindBy(xpath = "/html/body/div/div/main/div[2]/button[@type='button']")
    private WebElement plusButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/div/button[@type='button']")
    private WebElement exitButton;

    @FindBy(name = "teacherName")
    private WebElement sideTeacherName;

    @FindBy(name = "teacherSurname")
    private WebElement sideTeacherSurname;

    @FindBy(name = "teacherEmail")
    private WebElement sideTeacherEmail;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]")
    private WebElement teacher;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[2][@data-field='teacherName']")
    private WebElement teacherName;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[3][@data-field='teacherSurname']")
    private WebElement teacherSurname;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/form/div[4]/button[1]")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]")
    private WebElement idButton;

    public TeacherUserPage(WebDriver driver) {
        super(driver);
    }

    public void setCredentials() {
        sideTeacherName.sendKeys("Aleksandar");
        sideTeacherSurname.sendKeys("Kosanovic");
        sideTeacherEmail.sendKeys("sasha.kosanovic@gmail.com");
    }

    public void clickOnPlusButton() {
        plusButton.click();
    }

    public void clickTeacher() {
        teacher.click();
    }

    public void clickOnSaveButton() {
        saveButton.click();
    }

    public void clickIdButton() {
        idButton.click();
    }

    public WebElement getExitButton() {
        return exitButton;
    }

    public String getSideTeacherName() {
        return sideTeacherName.getAttribute("value");
    }

    public String getSideTeacherSurname() {
        return sideTeacherSurname.getAttribute("value");
    }

    public String getSideTeacherEmail() {
        return sideTeacherEmail.getAttribute("value");
    }

    public String getTeacherName() {
        return teacherName.getText();
    }

    public String getTeacherSurname() {
        return teacherSurname.getText();
    }
}
