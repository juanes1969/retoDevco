package co.com.retoDevco.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.Question;

import static co.com.retoDevco.certificacion.travelocity.questions.ElementIsPresent.elementIsPresent;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeCruises.RESULTS_CRUISES;

public class SearchFrontResultCruises implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(GivenWhenThen.seeThat(elementIsPresent(RESULTS_CRUISES)));
        return true;
    }

    public static SearchFrontResultCruises searchFrontResultCruises(){

        return new SearchFrontResultCruises();
    }
}
