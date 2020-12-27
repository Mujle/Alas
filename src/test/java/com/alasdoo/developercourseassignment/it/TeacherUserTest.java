package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.TeacherUserPage;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class TeacherUserTest extends TeacherTest {

    /*
    Checks the functionality of the button used for saving new and deleting users
     */
    @Test
    @Order(9)
    public void plusButton() {
        driver.get("http://localhost:3000/teacher/new");
        TeacherUserPage teacherUserPage = new TeacherUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        teacherUserPage.clickOnPlusButton();
        wait.until(ExpectedConditions.visibilityOf(teacherUserPage.getExitButton()));

        assertEquals("", teacherUserPage.getSideTeacherName());
        assertEquals("", teacherUserPage.getSideTeacherSurname());
        assertEquals("", teacherUserPage.getSideTeacherEmail());
    }

    /* Checks the functionality  of autocompletion
    - when a user from the table is clicked its supposed to enter that information in a sidebar
     */
    @Test
    @Order(10)
    public void credentialsAutocomplete() {
        driver.get("http://localhost:3000/teacher/new");
        TeacherUserPage teacherUserPage = new TeacherUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        teacherUserPage.clickTeacher();
        wait.until(ExpectedConditions.visibilityOf(teacherUserPage.getExitButton()));

        assertEquals(teacherUserPage.getTeacherName(), teacherUserPage.getSideTeacherName());
        assertEquals(teacherUserPage.getTeacherSurname(), teacherUserPage.getSideTeacherSurname());
    }

    /*
    Saves new user then checks the list for the previously saved user
     */
    @Test
    @Order(11)
    public void saveNewTeacher() {
        driver.get("http://localhost:3000/teacher/new");
        TeacherUserPage teacherUserPage = new TeacherUserPage(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        teacherUserPage.clickOnPlusButton();
        wait.until(ExpectedConditions.visibilityOf(teacherUserPage.getExitButton()));
        teacherUserPage.setCredentials();
        teacherUserPage.clickOnSaveButton();
        teacherUserPage.clickIdButton();
        teacherUserPage.clickIdButton();

        assertEquals("Aleksandar", teacherUserPage.getTeacherName());
        assertEquals("Kosanovic", teacherUserPage.getTeacherSurname());
    }
}
