package co.com.retoDevco.certificacion.travelocity.stepdefinitions;

import cucumber.api.Scenario;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;

import static co.com.retoDevco.certificacion.travelocity.util.ManualTest.validate;

public class TransversalStepDefinitions {

    private Scenario scenario;

    @Before
    public void getScenario(Scenario scenario) {
        this.scenario = scenario;
    }

    @Given("^(.*)$")
    public void stepDefinitions(String step) {
        validate(step, scenario.getName());
    }
}
