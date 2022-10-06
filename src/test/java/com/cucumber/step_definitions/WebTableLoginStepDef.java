package com.cucumber.step_definitions;

import com.cucumber.pages.WebTableLoginPage;
import com.cucumber.utilities.ConfigurationReader;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.Map;

public class WebTableLoginStepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    @When("user enters below credentials")
    public void user_enters_below_credentials(Map<String,String > credentials) {
       webTableLoginPage.login(credentials.get("username"),credentials.get("password"));
    }
    @When("user enters username {string}, password {string} and login")
    public void user_enters_username_password_and_login(String username, String password) {
        webTableLoginPage.login(username,password);
    }
    @Given("user is in web table login page")
    public void user_isin_web_table_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
    }
    @When("user enters username {string}")
    public void user_enters_username(String username) {
        webTableLoginPage.inputUsername.sendKeys(ConfigurationReader.getProperty("web.app.username"));
    }
    @When("user enters password {string}")
    public void user_enters_password(String password) {
        webTableLoginPage.inputPassword.sendKeys(ConfigurationReader.getProperty("web.app.password"));
    }
    @Then("user should see url contains orders")
    public void user_should_see_url_contains_orders() {
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("orders"));
    }

    @And("user clicks login button")
    public void userClicksLoginButton() {
        webTableLoginPage.loginButton.click();
    }
}
