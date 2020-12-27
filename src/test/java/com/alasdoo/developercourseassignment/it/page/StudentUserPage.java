package com.alasdoo.developercourseassignment.it.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class StudentUserPage extends StudentPage {

    @FindBy(xpath = "/html/body/div/div/main/div[2]/button[@type='button']")
    private WebElement plusButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div/p")
    private WebElement numberOfStudents;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]")
    private WebElement student;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[2][@data-field='name']")
    private WebElement studentName;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[3][@data-field='surname']")
    private WebElement studentSurname;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[4][@data-field='accountName']")
    private WebElement studentAccountName;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div/div/div[1]/div/div[2]/div[2]/div/div/div/div[1]/div[5][@data-field='email']")
    private WebElement studentEmail;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/div/button[@type='button']")
    private WebElement exitButton;

    @FindBy(name = "name")
    private WebElement sideStudentName;

    @FindBy(name = "surname")
    private WebElement sideStudentSurname;

    @FindBy(name = "accountName")
    private WebElement sideStudentAccountName;

    @FindBy(name = "email")
    private WebElement sideStudentEmail;

    @FindBy(name = "bankCardNumber")
    private WebElement sideStudentBankCardNumber;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/form/div[6]/button[1]")
    private WebElement saveButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[2]/form/div[7]/button[2]")
    private WebElement deleteButton;

    @FindBy(xpath = "/html/body/div/div/main/div[2]/div[1]/div/div[1]/div/div[2]/div[1]/div/div[1]")
    private WebElement idButton;

    public StudentUserPage(WebDriver driver) {
        super(driver);
    }

    public void clickOnIdButton() {
        idButton.click();
    }

    public void clickOnDeleteButton() {
        deleteButton.click();
    }

    public WebElement getExitButton() {
        return exitButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public String getSideStudentName() {
        return sideStudentName.getAttribute("value");
    }

    public String getSideStudentSurname() {
        return sideStudentSurname.getAttribute("value");
    }

    public String getSideStudentAccountName() {
        return sideStudentAccountName.getAttribute("value");
    }

    public String getSideStudentEmail() {
        return sideStudentEmail.getAttribute("value");
    }

    public String getSideStudentBankCardNumber() {
        return sideStudentBankCardNumber.getAttribute("value");
    }

    public void setCredentials() {
        sideStudentName.sendKeys("Aleksandar");
        sideStudentSurname.sendKeys("Kosanovic");
        sideStudentAccountName.sendKeys("Javar");
        sideStudentEmail.sendKeys("sasha.kosanovic@gmail.com");
        sideStudentBankCardNumber.sendKeys("1234");
    }

    public void clickSaveButton() {
        saveButton.click();
    }

    public void clickOnPlusButton() {
        plusButton.click();
    }

    public void clickOnStudent() {
        student.click();
    }

    public Integer getCurrentNumberOfStudents() {
        String text = numberOfStudents.getText();
        String[] split = text.split(" ");
        return Integer.parseInt(split[split.length - 1]);
    }

    public String getStudentName() {
        return studentName.getText();
    }

    public String getStudentSurname() {
        return studentSurname.getText();
    }

    public String getStudentAccountName() {
        return studentAccountName.getText();
    }

    public String getStudentEmail() {
        return studentEmail.getText();
    }
}
