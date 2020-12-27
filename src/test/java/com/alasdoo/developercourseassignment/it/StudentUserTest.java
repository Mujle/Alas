package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.StudentUserPage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class StudentUserTest extends StudentTest {

    /*
    Checks the functionality of the button used for saving new and deleting users
     */
    @Test
    @Order(3)
    public void plusButton() {
        driver.get("http://localhost:3000/student/new");
        StudentUserPage studentUserPage = new StudentUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        studentUserPage.clickOnPlusButton();
        wait.until(ExpectedConditions.visibilityOf(studentUserPage.getExitButton()));

        assertEquals("", studentUserPage.getSideStudentName());
        assertEquals("", studentUserPage.getSideStudentSurname());
        assertEquals("", studentUserPage.getSideStudentAccountName());
        assertEquals("", studentUserPage.getSideStudentEmail());
        assertEquals("", studentUserPage.getSideStudentBankCardNumber());
    }

    /* Checks the functionality  of autocompletion
    - when a user from the table is clicked its supposed to enter that information in a sidebar
     */
    @Test
    @Order(4)
    public void credentialsAutocomplete() {
        driver.get("http://localhost:3000/student/new");
        StudentUserPage studentUserPage = new StudentUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        studentUserPage.clickOnStudent();
        wait.until(ExpectedConditions.visibilityOf(studentUserPage.getExitButton()));

        assertEquals(studentUserPage.getStudentName(), studentUserPage.getSideStudentName());
        assertEquals(studentUserPage.getStudentSurname(), studentUserPage.getSideStudentSurname());
        assertEquals(studentUserPage.getStudentAccountName(), studentUserPage.getSideStudentAccountName());
        assertEquals(studentUserPage.getStudentEmail(), studentUserPage.getSideStudentEmail());
    }
    /*
    Saves new student then checks the list for the previously saved user
     */
    @Test
    @Order(5)
    public void saveNewStudent() {
        driver.get("http://localhost:3000/student/new");
        StudentUserPage studentUserPage = new StudentUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        studentUserPage.clickOnPlusButton();
        wait.until(ExpectedConditions.visibilityOf(studentUserPage.getExitButton()));
        studentUserPage.setCredentials();
        studentUserPage.clickSaveButton();
        studentUserPage.clickOnIdButton();
        studentUserPage.clickOnIdButton();

        assertEquals("Aleksandar", studentUserPage.getStudentName());
        assertEquals("Kosanovic", studentUserPage.getStudentSurname());
        assertEquals("Javar", studentUserPage.getStudentAccountName());
        assertEquals("sasha.kosanovic@gmail.com", studentUserPage.getStudentEmail());
    }

    /*
    Deletes a user and then checks the number of overall users for deletion confirmation
     */
    @Test
    @Order(6)
    public void deleteStudent() {
        driver.get("http://localhost:3000/student/new");
        StudentUserPage studentUserPage = new StudentUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        studentUserPage.clickOnStudent();
        int oldNumberOfStudents = studentUserPage.getCurrentNumberOfStudents();
        wait.until(ExpectedConditions.visibilityOf(studentUserPage.getExitButton()));
        studentUserPage.clickOnDeleteButton();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("/html/body/div/div/main/div[2]/div[2]/div/button[@type='button']")));

        assertEquals(oldNumberOfStudents - 1, studentUserPage.getCurrentNumberOfStudents());
    }

    /* Since at the moment I have only a few hours left, instead of just copy-pasting the rest of the functions
     I chose to try and implement some of the bonus tasks into the project.
     */
}
