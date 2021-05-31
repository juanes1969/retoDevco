package co.com.retoDevco.certificacion.travelocity.tasks;

import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateArrival;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateExit;
import co.com.retoDevco.certificacion.travelocity.models.DataFlightReservation;

import co.com.retoDevco.certificacion.travelocity.models.DataFlightReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageFlights.*;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageFlights.DESTINATION;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomePageFlights.INPUT_DESTINATION;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;


public class WriteDataReservationFlight implements Task {

    private String origin;
    private String destination;
    private int dayOfExit;
    private int dayOfArrival;

    public WriteDataReservationFlight(String origin, String destination, int dayOfExit, int dayOfArrival) {
        this.origin = origin;
        this.destination = destination;
        this.dayOfExit = dayOfExit;
        this.dayOfArrival = dayOfArrival;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(FLIGHTS),
                Click.on(ORIGIN),
                Enter.theValue(origin).into(INPUT_ORIGIN),
                Click.on(RESULT_ORIGIN),
                Click.on(DESTINATION),
                Enter.theValue(destination).into(INPUT_DESTINATION),
                Click.on(RESULT_DESTINATION), Click.on(INPUT_DATE),
                SelectDateExit.inTheCalendar(dayOfExit),
                SelectDateArrival.inTheCalendar(dayOfArrival),
                Click.on(BTN_DONE_RESERVATION), Click.on(BUTTON_SEARCH),
                WaitUntil.the(LOADING_SEARCH, isNotVisible()));

    }

    public static WriteDataReservationFlight inFields(DataFlightReservation data) {

        return Tasks.instrumented(WriteDataReservationFlight.class, data.getOrigin(), data.getDestination(), data.getDayOfExit(), data.getDayOfArrival());
    }
}
