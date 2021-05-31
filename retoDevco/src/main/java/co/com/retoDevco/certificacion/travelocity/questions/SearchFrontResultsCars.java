package co.com.retoDevco.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retoDevco.certificacion.travelocity.questions.ElementIsPresent.elementIsPresent;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageCar.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFrontResultsCars implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(seeThat(elementIsPresent(CARS_ITEMS)));
        return true;
    }

    public static SearchFrontResultsCars searchFrontResultsCars() {

        return new SearchFrontResultsCars();
    }
}
