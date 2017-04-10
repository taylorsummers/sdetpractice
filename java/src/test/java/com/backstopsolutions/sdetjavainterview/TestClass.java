package com.backstopsolutions.sdetjavainterview;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import sun.rmi.runtime.Log;

import static org.hamcrest.CoreMatchers.not;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class TestClass extends Utils{

    @Before
    public void Init(){
       setupSelenium("http://fbtest18.cs1cloud.internal");

    }

	@Test
	public void LoginSuccesful() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("bsgomega", "rup3rt");
        assertThat("The Title is Home", driver.getTitle(), is("Home"));
	}

    @Test
	public void LoginFailed(){
        LoginPage loginPage = new LoginPage(driver);
        loginPage.loginWithCredentials("bsgomea", "rup3rt");
        assertThat("The login failed", driver.getTitle(), not("Home"));
    }

    @After
    public void tearDownSelenium() {
        driver.quit();
    }

}
