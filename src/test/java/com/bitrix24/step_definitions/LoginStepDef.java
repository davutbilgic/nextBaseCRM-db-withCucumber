package com.bitrix24.step_definitions;

import com.bitrix24.pages.LoginPage;
import com.bitrix24.utilities.BrowserUtils;
import com.bitrix24.utilities.ConfigurationReader;
import com.bitrix24.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String qa2 = ConfigurationReader.get("qa2");
        Driver.get().get(qa2);
    }

    @When("the user logs in using {string} and {string}")
    public void the_user_logs_in_using_and(String username, String password) {
        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);

        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Verify title","(1) Portal",actualTitle);
    }

    @Then("the title contains {string}")
    public void the_title_contains(String expectedTitle) {
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

}