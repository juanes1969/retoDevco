package co.com.retoDevco.certificacion.travelocity.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateArrival;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateExit;
import co.com.retoDevco.certificacion.travelocity.models.DataCarReservation;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePagePackage.*;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;

public class WriteDataPackageReservation implements Task {

    private String origin;
    private String destiny;
    private int dayOfExit;
    private int dayOfArrival;

    public WriteDataPackageReservation(String origin, String destiny, int dayOfExit, int dayOfArrival) {
        this.origin = origin;
        this.destiny = destiny;
        this.dayOfExit = dayOfExit;
        this.dayOfArrival = dayOfArrival;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(PACKAGE),
                Click.on(ADD_CAR), Click.on(ORIGIN_PACKAGE),
                Enter.theValue(origin).into(INPUT_ORIGIN_PACKAGE),
                Click.on(RESULT_ORIGIN_PACKAGE),
                Click.on(DESTINY_PACKAGE),
                Enter.theValue(destiny).into(INPUT_DESTINY_PACKAGE),
                Click.on(RESULT_DESTINY_PACKAGE),
                Click.on(INPUT_DATE),
                SelectDateExit.inTheCalendar(dayOfExit),
                SelectDateArrival.inTheCalendar(dayOfArrival),
                Click.on(BUTTON_DONE_DATE),
                Click.on(BUTTON_SEARCH),
                WaitUntil.the(LOADING_PACKAGE, WebElementStateMatchers.isNotVisible()),
                Scroll.to(RESULT_SEARCH_PACKAGE)
        );
    }

    public static WriteDataPackageReservation inTheFields(DataCarReservation data) {
        return Tasks.instrumented(WriteDataPackageReservation.class, data.getOrigin(), data.getDestiny(), data.getDayOfExit(), data.getDayOfArrival());
    }
}
