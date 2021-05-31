package co.com.retoDevco.certificacion.travelocity.tasks;

import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateArrival;
import co.com.retoDevco.certificacion.travelocity.interactions.SelectDateExit;
import co.com.retoDevco.certificacion.travelocity.models.DataRoomReservation;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static co.com.retoDevco.certificacion.travelocity.interactions.SelectAdultsAndChildrens.selectAdultsAndChildrens;
import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isNotVisible;

public class WriteDataReservationRoom implements Task {

    private String destination;
    private int dayOfExit;
    private int dayOfArrival;
    private int addAdults;
    private int addChildrens;

    public WriteDataReservationRoom(String destination, int dayOfExit, int dayOfArrival, int addAdults, int addChildrens) {
        this.destination = destination;
        this.dayOfExit = dayOfExit;
        this.dayOfArrival = dayOfArrival;
        this.addAdults = addAdults;
        this.addChildrens = addChildrens;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(DESTINATION),
                Enter.theValue(destination).into(INPUT_DESTINATION),
                Click.on(INPUT_DESTINATION_ITEM),Click.on(INPUT_DATE),
                SelectDateExit.inTheCalendar(dayOfExit),
                SelectDateArrival.inTheCalendar(dayOfArrival),
                Click.on(BUTTON_DONE_DATE),Click.on(TRAVELERS),
                selectAdultsAndChildrens(addAdults, addChildrens),
                Click.on(BUTTON_DONE_TRAVELERS),Click.on(BUTTON_SEARCH),
                WaitUntil.the(LOADING, isNotVisible()));

    }

    public static WriteDataReservationRoom inFields(DataRoomReservation data) {
        return Tasks.instrumented(WriteDataReservationRoom.class, data.getDestination(), data.getDayOfExit(), data.getDayOfArrival(), data.getAddAdults(), data.getAddChildrens());
    }
}
