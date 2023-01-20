package com.virgingames.virgingamesinfo;

import com.virgingames.constants.EndPoints;
import io.restassured.response.ValidatableResponse;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Step;

public class VirginGamesSteps {

    @Step
    public ValidatableResponse getLobbyFeedInfo() {
        return SerenityRest.given().log().all()
                .when()
                .get(EndPoints.LOBBY_FEED)
                .then().log().all();
    }

}
