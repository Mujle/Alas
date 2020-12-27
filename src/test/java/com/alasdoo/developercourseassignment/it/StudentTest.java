package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.StudentPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class StudentTest extends FunctionalTest {

    /*
    Checks if backend is responding with needed information
     */
    @Test
    @Order(2)
    public void backendRespondedWithContent() {
        driver.get("http://localhost:3000/student");
        StudentPage studentPage = new StudentPage(driver);

        driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
        assertFalse(studentPage.isTableEmpty());
    }
}
