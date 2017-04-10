package com.backstopsolutions.sdetjavainterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by taylo on 4/7/2017.
 */
public class LoginPage extends Utils {

    private WebDriver driver;

    By submit = By.id("login-button");
    By passBox = By.id("passwordInput");
    By loginBox = By.id("j_username");


    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void loginWithCredentials(String username, String password){
        driver.findElement(loginBox).sendKeys(username);
        driver.findElement(passBox).sendKeys(password);
        driver.findElement(submit).click();
    }
}
