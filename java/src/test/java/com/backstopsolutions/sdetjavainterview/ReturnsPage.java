package com.backstopsolutions.sdetjavainterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by taylo on 4/9/2017.
 */
public class ReturnsPage extends Utils{

    private WebDriver driver;

    By addReturnsButton = By.cssSelector("button#add-returns.button-small");
    By showAllPeriodsButton = By.cssSelector("button#hideButton.button-small.fright.mb5.ml20");
    By dec2005AccountValue = By.cssSelector("textarea#periodInfoMap['12/1/2005:12/31/2005'].aumStr");
    By saveButton = By.cssSelector("button#bottomButton");


    public ReturnsPage(WebDriver driver) {
        this.driver = driver;
    }

    public void updateReturnsValue() {
        driver.findElement(addReturnsButton).click();
        driver.findElement(showAllPeriodsButton);
        driver.findElement(dec2005AccountValue).sendKeys("47,100,000.00");
        driver.findElement(saveButton).click();
    }
}
