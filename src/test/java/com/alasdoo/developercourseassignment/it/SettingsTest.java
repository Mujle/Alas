package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.SettingsPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
class SettingsTest extends FunctionalTest{

    /*
    Tests the Start button in settings page
    ***Test will pass only when the db si empty
    */
    @Test
    @Order(1)
    public void canInjectDataIntoBackend() {
        driver.get("http://localhost:3000/settings");
        SettingsPage settingsPage = new SettingsPage(driver);

        settingsPage.startInjection();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        assertEquals("Injected: Students(20), Teachers(20), Courses(20)", settingsPage.getInjectionResponse());
    }
}
