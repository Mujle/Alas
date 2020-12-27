package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.StudentCourse;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
public class StudentCourseTest extends StudentUserTest {

    /*
    Adds a new course to a student and then checks the list for it
    **intentionally set -1 in bought courses for easier list iteration
     */
    @Test
    @Order(7)
    public void addNewCourse() {

        driver.get("http://localhost:3000/student/7/");
        StudentCourse studentCourse = new StudentCourse(driver);
        WebDriverWait wait = new WebDriverWait(driver, 30);

        studentCourse.clickToggleCourseButton();
        wait.until(ExpectedConditions.visibilityOf(studentCourse.getNewCourseButton()));
        studentCourse.clickAddNewCourseButton();

        studentCourse.clickOnCourseDropdown();
        studentCourse.clickOnFirstParamInCourseDropdown();
        wait.until(ExpectedConditions.visibilityOf(studentCourse.getClassesBoughtSlider()));

        studentCourse.enterNegativeNumberOfBoughtCourses();

        studentCourse.clickOnSaveButton();
        studentCourse.clickOnBoughtClassesButton();

        assertEquals(-1, studentCourse.getFirstElementInBoughtClassesList());
    }
}
