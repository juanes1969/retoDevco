package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import co.com.retoDevco.certificacion.travelocity.models.DataCarReservation;
import co.com.retoDevco.certificacion.travelocity.tasks.WriteDataCarReservation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.questions.SearchFrontResultsCars.searchFrontResultsCars;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class RentCarStepDefinitions {

    @When("^Enter the information for the reservation a cars$")
    public void enterTheInformationForTheReservationACars(List<DataCarReservation> listDataCar) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDataCarReservation.inFields(listDataCar.get(0)));
    }


    @Then("^I verify the available cars in the page$")
    public void iVerifyTheAvailableCarsInThePage() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(searchFrontResultsCars()));
    }
}
