package com.backstopsolutions.sdetjavainterview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import sun.rmi.runtime.Log;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

/**
 * Created by taylo on 4/8/2017.
 */
public class EntityTests extends Utils {

    @Before
    public void Init(){
        setupSelenium("http://fbtest18.cs1cloud.internal");
    }


    @Test
    public void SearchForFundAndCheckTableValueandAddReturnsValue(){
        LoginPage loginPage = new LoginPage(driver);
        HomePage homePage = new HomePage(driver);
        ReturnsPage returnsPage = new ReturnsPage(driver);
        EntityPage entityPage = new EntityPage(driver);

        loginPage.loginWithCredentials("clamb", "rup3rt");
        homePage.SearchForEntityAndClick("ABC Diversified Fund");
        String entityPageTitle = entityPage.GetEntityTitle();
        assertThat("The correct entity was found", entityPageTitle, is("210"));

        String tableValue = entityPage.getTableValue();
        assertThat("Value is 1.46%", tableValue, is("1.46%"));


    }

    @Test
    public void editAccountValue(){
        ReturnsPage returnsPage = new ReturnsPage(driver);
        EntityPage entityPage = new EntityPage(driver);
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("clamb", "rup3rt");
        homePage.SearchForEntityAndClick("ABC Diversified Fund");
        returnsPage.updateReturnsValue();
    }

    @After
    public void tearDownSelenium() {
        driver.quit();
    }
}
