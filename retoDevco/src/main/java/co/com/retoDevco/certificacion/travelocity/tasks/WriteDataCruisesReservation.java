package co.com.retoDevco.certificacion.travelocity.tasks;

import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateArrival;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateExit;
import co.com.retoDevco.certificacion.travelocity.models.DataCruisesReservation;
import co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeCruises;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoDevco.certificacion.travelocity.interactions.SelectAdultsAndChildrens.selectAdultsAndChildrens;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeCruises.*;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;

public class WriteDataCruisesReservation implements Task {

    private String origin;
    private int dayOfExit;
    private int dayOfArrival;
    private int addAdults;
    private int addChildrens;

    public WriteDataCruisesReservation(String origin, int dayOfExit, int dayOfArrival, int addAdults, int addChildrens) {
        this.origin = origin;
        this.dayOfExit = dayOfExit;
        this.dayOfArrival = dayOfArrival;
        this.addAdults = addAdults;
        this.addChildrens = addChildrens;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CRUISES),
                Click.on(SELECT_DESTINATION),
                Click.on(HomeCruises.optionDocument(origin)),
                Click.on(TRAVELERS),
                selectAdultsAndChildrens(addAdults, addChildrens),
                Click.on(INPUT_DATE), SelectDateExit.inTheCalendar(dayOfExit),
                SelectDateArrival.inTheCalendar(dayOfArrival),
                Click.on(BUTTON_DONE_DATE),
                Click.on(BUTTON_SEARCH),
                WaitUntil.the(LOADING_CRUISES, WebElementStateMatchers.isNotVisible()),
                Scroll.to(RESULTS_CRUISES));
    }

    public static WriteDataCruisesReservation inFields(DataCruisesReservation data) {

        return Tasks.instrumented(WriteDataCruisesReservation.class, data.getOrigin(), data.getDayOfExit(), data.getDayOfArrival(), data.getAddAdults(), data.getAddChildrens());
    }
}
