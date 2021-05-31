package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import co.com.retoDevco.certificacion.travelocity.models.DataRoomReservation;
import co.com.retoDevco.certificacion.travelocity.tasks.WriteDataReservationRoom;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.questions.SearchFrontResultsRooms.searchFrontResultsRooms;
import static co.com.retoDevco.certificacion.travelocity.util.constants.Urls.urlTravelocity;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReservationRoomStepDefinitions {

    @Before
    public void setUp() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) wants to enter the page$")
    public void juanWantsToEnterThePage(String name) throws Exception {
        OnStage.theActorCalled(name).wasAbleTo(Open.url(urlTravelocity));
    }

    @When("^Enter the information for the reservation$")
    public void enterTheInformationForTheReservation(List<DataRoomReservation> listData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDataReservationRoom.inFields(listData.get(0)));
    }

    @Then("^I verify the available rooms$")
    public void iVerifyTheAvailableRooms() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(searchFrontResultsRooms()));
    }
}
