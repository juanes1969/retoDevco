package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import co.com.retoDevco.certificacion.travelocity.models.DataCarReservation;
import co.com.retoDevco.certificacion.travelocity.tasks.WriteDataPackageReservation;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.questions.SearchFrontResultPackages.searchFrontResultPackages;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class PackageStepDefinitions {

    @When("^Enter the information for the package option$")
    public void enterTheInformationForThePackageOption(List<DataCarReservation> listPackageData) throws Exception {
        OnStage.theActorInTheSpotlight().attemptsTo(WriteDataPackageReservation.inTheFields(listPackageData.get(0)));
    }


    @Then("^I verify the available package in the page$")
    public void iVerifyTheAvailablePackageInThePage() throws Exception {
        OnStage.theActorInTheSpotlight().should(seeThat(searchFrontResultPackages()));
    }
}
