package com.backstopsolutions.sdetjavainterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


/**
 * Created by taylo on 4/8/2017.
 */
public class HomePage extends Utils {

    private WebDriver driver;
    By firstSearchResult = By.xpath("//div[@id='bsgsearchresults']/div[2]");
    By headerSearchBox = By.id("headerSearchBox");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void SearchForEntityAndClick(String entityName)
    {
        WebElement searchBox = driver.findElement(headerSearchBox);
        searchBox.sendKeys(entityName);
        driver.findElement(firstSearchResult).click();
    }


}
