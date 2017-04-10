package com.backstopsolutions.sdetjavainterview;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by taylo on 4/7/2017.
 */
public class Utils {

    static WebDriver driver;



    public static void setupSelenium(String baseURL) {
        driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);
        Cookie ck = new Cookie("bsg.header.segmented.intro", "true");
        driver.manage().addCookie(ck);
    }
}
