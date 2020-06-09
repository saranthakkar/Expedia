package org.example.StepDefinitionsPackage;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.example.PageObjectPackage.Flightsearchpage;

public class FlightsearchSteps {
    Flightsearchpage flightsearchpage = new Flightsearchpage();

    @Given("^user is on homepage of Expedia for flight search$")
    public void user_is_on_homepage_of_Expedia_for_flight_search() throws Throwable {
    }

    @When("^user selects flying from option$")
    public void user_selects_flying_from_option() throws Throwable {
    }

    @When("^user selects flying to option$")
    public void user_selects_flying_to_option() throws Throwable {
    }

    @When("^user selects departing date$")
    public void user_selects_departing_date() throws Throwable {
    }

    @When("^user selects returing date$")
    public void user_selects_returing_date() throws Throwable {
    }

    @When("^user clicks on search button$")
    public void user_clicks_on_search_button() throws Throwable {
    }

    @Then("^user should be able to see result page$")
    public void user_should_be_able_to_see_result_page() throws Throwable {
    }

}
