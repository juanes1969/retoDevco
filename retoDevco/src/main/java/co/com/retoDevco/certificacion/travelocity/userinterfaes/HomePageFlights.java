package co.com.retoDevco.certificacion.travelocity.userinterfaes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageFlights {

    public static final Target FLIGHTS = Target.the("flights").located(By.xpath("//a[@class='uitk-tab-anchor']//span[contains(text(), 'Flights')]"));
    public static final Target ORIGIN = Target.the("orignin").located(By.xpath("(//button[@class='uitk-faux-input'])[1]"));
    public static final Target INPUT_ORIGIN = Target.the("Input orignin").located(By.id("location-field-leg1-origin"));
    public static final Target RESULT_ORIGIN = Target.the("Result orignin").located(By.xpath("//*[@id='location-field-leg1-origin-menu']/div[2]/ul/li[1]/button"));
    public static final Target DESTINATION = Target.the("destination").located(By.xpath("(//button[@class='uitk-faux-input'])[2]"));
    public static final Target INPUT_DESTINATION = Target.the("Input destination").located(By.id("location-field-leg1-destination"));
    public static final Target RESULT_DESTINATION = Target.the("Result destination").located(By.xpath("//*[@id='location-field-leg1-destination-menu']/div[2]/ul/li[1]/button"));
    public static final Target BTN_DONE_RESERVATION = Target.the("Result destination").located(By.xpath("//button[@data-stid='apply-date-picker']"));
    public static final Target LOADING_SEARCH = Target.the("Loading search").located(By.id("el_BOCLP6pw6"));
    public static final Target AVAILABLE_FLIGHTS = Target.the("Available flights").located(By.className("uitk-card-link"));
    public static final Target RESULT_FLIGHTS = Target.the("Result flights").located(By.xpath("(//div[@data-test-id='intersection-observer'])[1]"));
    public static final Target FLIGHT_ROUTE = Target.the("Flight route").located(By.xpath("(//div[@data-test-id='details-and-fares']//h2)[1]"));
    public static final Target HOUR_ROUTE = Target.the("Hour route").located(By.xpath("//div[@data-test-id='flight-summary']/h3"));
    public static final Target PRICE_ROUTE = Target.the("Price route").located(By.xpath("//span[@class='uitk-flex-item']"));
}
