package co.com.retoDevco.certificacion.travelocity.tasks;

import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateArrival;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateExit;
import co.com.retoDevco.certificacion.travelocity.models.DataCarReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageCar.*;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;

public class WriteDataCarReservation implements Task {

    private String origin;
    private String destiny;
    private int dayOfExit;
    private int dayOfArrival;

    public WriteDataCarReservation(String origin, String destiny, int dayOfExit, int dayOfArrival) {
        this.origin = origin;
        this.destiny = destiny;
        this.dayOfExit = dayOfExit;
        this.dayOfArrival = dayOfArrival;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(CARS),
                Click.on(ORIGIN),
                Enter.theValue(origin).into(INPUT_ORIGIN),
                Click.on(ITEM_ORIGIN),
                Click.on(DESTINY),
                Enter.theValue(destiny).into(INPUT_DESTINY),
                Click.on(ITEM_DESTINY),
                Click.on(INPUT_DATE),
                SelectDateExit.inTheCalendar(dayOfExit),
                SelectDateArrival.inTheCalendar(dayOfArrival),
                Click.on(BUTTON_DONE_DATE),
                SelectFromOptions.byVisibleText("9:30 am").from(SELECT_TIME_INITIAL),
                SelectFromOptions.byVisibleText("12:15 pm").from(SELECT_TIME_END),
                Click.on(BUTTON_SEARCH),
                WaitUntil.the(LOADING_CARS, WebElementStateMatchers.isNotVisible()),
                Scroll.to(CARS_ITEMS)

        );
    }

    public static WriteDataCarReservation inFields(DataCarReservation data) {
        return Tasks.instrumented(WriteDataCarReservation.class, data.getOrigin(), data.getDestiny(), data.getDayOfExit(), data.getDayOfArrival());
    }
}
