package co.com.retoDevco.certificacion.travelocity.interactions;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;

import java.util.List;

import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;

public class SelectDateExit implements Interaction {

    private int day;

    public SelectDateExit(int day) {
        this.day = day;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        boolean foundValue = false;

        List<WebElementFacade> calendarElement = CALENDAR_ELEMENT_DAYS_EXIT.resolveAllFor(actor);

        int i = 0;
        while (!foundValue && i < calendarElement.size()) {

            String textCalendarElement = calendarElement.get(i).getAttribute("data-day");

            int ElementDay = Integer.parseInt(textCalendarElement);

            if (day == ElementDay) {
                calendarElement.get(i).click();
                foundValue = true;
            }
            i++;
        }
    }

    public static SelectDateExit inTheCalendar(int day) {
        return Tasks.instrumented(SelectDateExit.class, day);
    }
}
