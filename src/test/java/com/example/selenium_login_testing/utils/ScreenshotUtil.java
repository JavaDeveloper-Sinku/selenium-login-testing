package com.example.selenium_login_testing.utils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class ScreenshotUtil {

    public static void takeScreenshot(
            WebDriver driver,
            String testName
    ) {

        try {

            File screenshot = ((TakesScreenshot) driver)
                    .getScreenshotAs(OutputType.FILE);

            Path directory = Path.of("target", "screenshots");

            Files.createDirectories(directory);

            Path destination = directory.resolve(
                    testName + ".png"
            );

            Files.copy(
                    screenshot.toPath(),
                    destination
            );

            System.out.println(
                    "Screenshot saved: " + destination
            );

        } catch (IOException e) {

            e.printStackTrace();
        }
    }
}