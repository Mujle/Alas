package com.alasdoo.developercourseassignment.it;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FunctionalTest {

    protected static WebDriver driver;

    @BeforeAll
    public static void setUp(){
        System.setProperty("webdriver.gecko.driver", "src/main/resources/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterAll
    public static void tearDown(){
        driver.close();
    }
}
