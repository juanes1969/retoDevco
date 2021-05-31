package co.com.retoDevco.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actions.Click;

import static co.com.retoDevco.certificacion.travelocity.questions.ElementIsPresent.elementIsPresent;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageFlights.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFrontResultsFlights implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(seeThat(elementIsPresent(AVAILABLE_FLIGHTS)));
        actor.attemptsTo(Click.on(RESULT_FLIGHTS));
        actor.should(
                seeThat(elementIsPresent(FLIGHT_ROUTE)),
                seeThat(elementIsPresent(HOUR_ROUTE)),
                seeThat(elementIsPresent(PRICE_ROUTE)));
        return true;
    }

    public static SearchFrontResultsFlights searchFrontResultsFlights() {

        return new SearchFrontResultsFlights();
    }
}
