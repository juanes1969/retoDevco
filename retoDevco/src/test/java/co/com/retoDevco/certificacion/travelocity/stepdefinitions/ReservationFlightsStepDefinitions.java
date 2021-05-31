package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import co.com.retoDevco.certificacion.travelocity.models.DataFlightReservation;
import co.com.retoDevco.certificacion.travelocity.tasks.WriteDataReservationFlight;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.questions.SearchFrontResultsFlights.searchFrontResultsFlights;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class ReservationFlightsStepDefinitions {

    @When("^Enter the information for the reservation flights$")
    public void enterTheInformationForTheReservationFlights(List<DataFlightReservation> listReservationFlight) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDataReservationFlight.inFields(listReservationFlight.get(0)));
    }


    @Then("^I verify the available flights in the page$")
    public void iVerifyTheAvailableFlightsInThePage() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(searchFrontResultsFlights()));
    }
}
