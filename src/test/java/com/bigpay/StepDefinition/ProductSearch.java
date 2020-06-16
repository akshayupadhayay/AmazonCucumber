package com.bigpay.StepDefinition;

import com.bigpay.Utils.CommonMethods;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class ProductSearch extends CommonMethods {

    @Given("Browser is launched and amazon.sg is open on browser")
    public void browser_is_launched_and_amazon_sg_is_open_on_browser() {

        System.out.println(driver.getTitle());
        assert driver.getTitle().equals("Amazon.sg: Shop Online for Electronics, Computers, Books, Toys, DVDs, Baby, Grocery, & more");
        boolean logo = search.amazonLogo.isDisplayed();
        Assert.assertTrue(logo);
    }

    @When("Enter text in search bar on home page")
    public void enter_text_in_search_bar_on_home_page(String laptop) {

        assert search.searchBox.isEnabled();
        assert search.searchButton.isEnabled();
        search.sendItem(laptop);
    }

    @Then("Select first search from the auto-complete and click enter")
    public void select_first_search_from_the_auto_complete(String laptop) {
        search.selectFirstElement();
        assert search.searchBox.getText().equals(laptop);
        search.searchClick();
    }

    @And("Land on the product page and close browser")
    public void land_on_the_product_page() {
        assert driver.getTitle().equals("Amazon.sg : laptop");
        driver.close();
        driver.quit();
    }


}
