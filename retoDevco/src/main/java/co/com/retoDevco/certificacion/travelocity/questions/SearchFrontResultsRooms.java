package co.com.retoDevco.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retoDevco.certificacion.travelocity.questions.ElementIsPresent.elementIsPresent;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFrontResultsRooms implements Question<Boolean> {

    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(
                seeThat(elementIsPresent(HOTEL_AVALIBLE)));
        return true;
    }

    public static SearchFrontResultsRooms searchFrontResultsRooms() {
        return new SearchFrontResultsRooms();
    }
}
