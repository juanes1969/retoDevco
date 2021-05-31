package co.com.retoDevco.certificacion.travelocity.interactions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

import static co.com.retoDevco.certificacion.travelocity.userinterfaes.HomeTravelocity.*;

public class SelectAdultsAndChildrens implements Interaction {

    private int addAdults;
    private int addChildrens;

    public SelectAdultsAndChildrens(int addAdults, int addChildrens) {
        this.addAdults = addAdults;
        this.addChildrens = addChildrens;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        for (int i = 0; i < addAdults; i++) {
            actor.attemptsTo(Click.on(BUTTON_ADD_ADULT));
        }

        if (addChildrens != 0) {
            for (int i = 0; i < addChildrens; i++) {
                actor.attemptsTo(Click.on(BUTTON_ADD_CHILDREN));
            }
            if (addChildrens == 1){
                actor.attemptsTo(SelectFromOptions.byValue("8").from(AGE_CHILDREN_1));
            }

            if (addChildrens == 2){
                actor.attemptsTo(SelectFromOptions.byValue("8").from(AGE_CHILDREN_1));
                actor.attemptsTo(SelectFromOptions.byValue("10").from(AGE_CHILDREN_2));
            }

        }
    }

    public static SelectAdultsAndChildrens selectAdultsAndChildrens(int addAdults, int addChildrens) {

        return Tasks.instrumented(SelectAdultsAndChildrens.class, addAdults, addChildrens);
    }
}
