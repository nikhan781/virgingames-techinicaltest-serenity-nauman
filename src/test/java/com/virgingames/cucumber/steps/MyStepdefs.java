package com.virgingames.cucumber.steps;

import com.virgingames.virgingamesinfo.VirginGamesSteps;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.parsing.Parser;
import io.restassured.response.ValidatableResponse;
import net.thucydides.core.annotations.Steps;
import org.junit.Assert;

import java.util.ArrayList;

import static org.hamcrest.CoreMatchers.hasItems;

public class MyStepdefs {

    static ValidatableResponse response;

    @Steps
    VirginGamesSteps virginGamesSteps;

    @When("^I send a Get request to lobby feed endpoint$")
    public void iSendAGetRequestToLobbyFeedEndpoint() {
        response = virginGamesSteps.getLobbyFeedInfo().parser("text/plain", Parser.JSON);
    }

    @Then("^I must get a valid response code 200$")
    public void iMustGetAValidResponseCode() {
        response.statusCode(200);
    }

    @And("^I verify default frequency is 300000$")
    public void iVerifyDefaultFrequencyIs() {
        ArrayList<Integer> frequency = response.extract().path("bingoLobbyInfoResource.streams.defaultGameFrequency");
        Assert.assertThat(frequency, hasItems(300000));
    }

}
