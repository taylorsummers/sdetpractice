package com.backstopsolutions.sdetjavainterview;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by taylo on 4/8/2017.
 */
public class EntityPage extends Utils {

    private WebDriver driver;
    By pageTitle = By.cssSelector("h1#entity-title.entity-title");
    By tableCell = By.xpath("//table[@id='perfTable_210']//tr[13]/td[contains(@class, 'tp-Dec_2005')]/span");


    public EntityPage(WebDriver driver) {
        this.driver = driver;
    }

    public String GetEntityTitle()
    {
        WebElement pageTitleElement = driver.findElement(pageTitle);
        return pageTitleElement.getAttribute("Title");
    }

    public String getTableValue()
    {
        return driver.findElement(tableCell).getText();
    }


}
