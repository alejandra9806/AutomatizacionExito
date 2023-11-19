package com.exito.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Esperas {
    public static void espera1(WebDriver webDriver, By by){
        WebDriverWait wait = new WebDriverWait(webDriver, Duration.ofSeconds(6));
        wait.until(
                ExpectedConditions.elementToBeClickable(by)
        );
    }

}
