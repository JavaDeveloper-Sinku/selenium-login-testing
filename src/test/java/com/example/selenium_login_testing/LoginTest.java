package com.example.selenium_login_testing;

import com.example.selenium_login_testing.pages.LoginPage;
import com.example.selenium_login_testing.utils.ScreenshotUtil;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    private WebDriver driver;
    private LoginPage loginPage;

    @BeforeEach
    void setUp() {

        driver = new ChromeDriver();

        driver.get("http://localhost:3000");

        loginPage = new LoginPage(driver);
    }

    @AfterEach
    void tearDown() {

        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    void validLoginTest() {

        loginPage.login(
                "admin@gmail.com",
                "admin123"
        );

        String message = loginPage.getLoginMessage();

        assertEquals(
                "Login Successful",
                message
        );
    }

    @Test
    void invalidLoginTest() {

        loginPage.login(
                "wrong@gmail.com",
                "wrong123"
        );

        String message = loginPage.getLoginMessage();

        assertEquals(
                "Invalid email or password",
                message
        );
    }
}