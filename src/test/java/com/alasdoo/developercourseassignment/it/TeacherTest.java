package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.TeacherPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.assertFalse;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TeacherTest extends FunctionalTest {

    /*
    Checks if backend is responding with needed information
     */
    @Test
    @Order(8)
    public void backendRespondedWithContent() {
        driver.get("http://localhost:3000/teacher");
        TeacherPage teacherPage = new TeacherPage(driver);

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertFalse(teacherPage.isTableEmpty());
    }
}
