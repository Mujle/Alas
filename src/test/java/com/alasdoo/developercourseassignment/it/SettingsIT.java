package com.alasdoo.developercourseassignment.it;

import com.alasdoo.developercourseassignment.it.page.SettingsPage;
import org.junit.jupiter.api.*;

import java.util.concurrent.TimeUnit;

import static org.junit.jupiter.api.Assertions.*;

@TestInstance(value = TestInstance.Lifecycle.PER_CLASS)
class SettingsIT extends FunctionalTest{

    /*
    Tests the Start button in settings page

    ***Test will pass only when the db si empty
    */
    @Test
    public void canInjectDataIntoBackend() {
        SettingsPage settingsPage = new SettingsPage(driver);

        settingsPage.startInjection();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        assertEquals("Injected: Students(20), Teachers(20), Courses(20)", settingsPage.getInjectionResponse());
    }
}