package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import co.com.retoDevco.certificacion.travelocity.models.DataCruisesReservation;
import co.com.retoDevco.certificacion.travelocity.tasks.WriteDataCruisesReservation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.questions.SearchFrontResultCruises.searchFrontResultCruises;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class CruisesStepDefinitions {

    @When("^Enter the information for the cruises option$")
    public void enterTheInformationForTheCruisesOption(List<DataCruisesReservation> listDataCruises) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDataCruisesReservation.inFields(listDataCruises.get(0)));
    }

    @Then("^I verify the available cruises in the page$")
    public void iVerifyTheAvailableCruisesInThePage() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(searchFrontResultCruises()));
    }
}
