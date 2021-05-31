package co.com.retoDevco.certificacion.travelocity.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.retoDevco.certificacion.travelocity.questions.ElementIsPresent.elementIsPresent;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePagePackage.RESULT_SEARCH_PACKAGE;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class SearchFrontResultPackages implements Question<Boolean> {
    @Override
    public Boolean answeredBy(Actor actor) {

        actor.should(seeThat(elementIsPresent(RESULT_SEARCH_PACKAGE)));
        return true;
    }

    public static SearchFrontResultPackages searchFrontResultPackages() {

        return new SearchFrontResultPackages();
    }
}
