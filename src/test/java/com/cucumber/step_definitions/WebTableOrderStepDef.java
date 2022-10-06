package com.cucumber.step_definitions;

import com.cucumber.pages.BasePage;
import com.cucumber.pages.WebTableListOfAllOrdersPage;
import com.cucumber.pages.WebTableLoginPage;
import com.cucumber.pages.WebTableOrderPage;
import com.cucumber.utilities.ConfigurationReader;
import com.cucumber.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class WebTableOrderStepDef {
    WebTableLoginPage webTableLoginPage = new WebTableLoginPage();
    BasePage basePage = new BasePage();
    WebTableOrderPage webTableOrderPage = new WebTableOrderPage();
    WebTableListOfAllOrdersPage webTableListOfAllOrdersPage = new WebTableListOfAllOrdersPage();
    @Given("user is already logged in and on order page")
    public void user_is_already_logged_in_and_on_order_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("web.app.url"));
        webTableLoginPage.login("Test","Tester");
        basePage.order.click();
    }
    @When("user selects product type {string}")
    public void user_selects_product_type(String productType) {
        Select select = new Select(webTableOrderPage.product);
        select.selectByVisibleText(productType);
    }
    @When("user enters quantity {int}")
    public void user_enters_quantity(int quantity) {
        webTableOrderPage.quantityInput.clear();
        webTableOrderPage.quantityInput.sendKeys(quantity+"2");
    }
    @When("user enters customer name {string}")
    public void user_enters_customer_name(String name) {
        webTableOrderPage.nameInput.sendKeys(name);
    }
    @When("user enters street name {string}")
    public void user_enters_street_name(String street) {
        webTableOrderPage.streetInput.sendKeys(street);
    }
    @When("user enters city {string}")
    public void user_enters_city(String city) {
        webTableOrderPage.cityInput.sendKeys(city);
    }
    @When("user enters state {string}")
    public void user_enters_state(String state) {
        webTableOrderPage.stateInput.sendKeys(state);
    }
    @When("user enters zipcode {string}")
    public void user_enters_zipcode(String zipcode) {
        webTableOrderPage.zipInput.sendKeys(zipcode);
    }
    @When("user selects credit cart type {string}")
    public void user_selects_credit_cart_type(String expectedCardType) {
        List<WebElement> cardTypes = webTableOrderPage.cardType;
        for (WebElement each : cardTypes) {
            if (each.getAttribute("value").equalsIgnoreCase(expectedCardType)){
                each.click();
            }
        }
    }
    @When("user enters credit card number {string}")
    public void user_enters_credit_card_number(String creditCardNumber) {
        webTableOrderPage.cardInput.sendKeys(creditCardNumber);
    }
    @When("user enters expiration date {string}")
    public void user_enters_expiration_date(String expirationDate) {
        webTableOrderPage.cardExpInput.sendKeys(expirationDate);
    }
    @When("user enters process order button")
    public void user_enters_process_order_button() {
        webTableOrderPage.processOrderButton.click();
    }
    @Then("user should see {string} in first row of the web table")
    public void user_should_see_in_first_row_of_the_web_table(String expectedName) {
        String actualName = webTableListOfAllOrdersPage.firstRowName.getText();
        Assert.assertEquals(expectedName,actualName);
    }

}
