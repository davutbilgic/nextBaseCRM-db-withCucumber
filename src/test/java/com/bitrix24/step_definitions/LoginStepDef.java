package com.bitrix24.step_definitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDef {

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        System.out.println("I open browser and navigated bitrix24 loign page");
    }

    @When("the user enter the helpdesk9 information")
    public void the_user_enter_the_helpdesk9_information() {
        System.out.println("I put helpdesk9@cybertekschool.com username and UserUser password and click login button");
    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        System.out.println("I verify that title changed to Portal");
    }

    @When("the user enter the helpdesk10 information")
    public void the_user_enter_the_helpdesk10_information() {
        System.out.println("I put helpdesk10@cybertekschool.com username and UserUser password and click login button");
    }

    @When("the user enter the marketing9")
    public void the_user_enter_the_marketing9() {
        System.out.println("I put helpdesk9@cybertekschool.com username and UserUser password and click login button");
    }

    @When("the user enter the marketing10")
    public void the_user_enter_the_marketing10() {
        System.out.println("I put marketing10@cybertekschool.com username and UserUser password and click login button");
    }

    @When("the user enter the hr9")
    public void the_user_enter_the_hr9() {
        System.out.println("I put hr9@cybertekschool.com username and UserUser password and click login button");
    }

    @When("the user enter the hr10")
    public void the_user_enter_the_hr10() {
        System.out.println("I put hr10@cybertekschool.com username and UserUser password and click login button");
    }
}
