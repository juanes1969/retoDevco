package co.com.retoDevco.certificacion.travelocity.userinterfaes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeTravelocity {

    public static final Target DESTINATION = Target.the("destination").located(By.xpath("//button[@aria-label='Going to']"));
    public static final Target INPUT_DESTINATION = Target.the("Input destination").located(By.id("location-field-destination"));
    public static final Target INPUT_DESTINATION_ITEM = Target.the("Input destination item").located(By.xpath("//ul[@data-stid='location-field-destination-results']//li[1]"));
    public static final Target INPUT_DATE = Target.the("Input date").located(By.id("d1-btn"));
    public static final Target CALENDAR_ELEMENT_DAYS_EXIT = Target.the("Calendar element days").located(By.xpath("(//table[@class='uitk-date-picker-weeks'])[1]/tbody//td//button"));
    public static final Target CALENDAR_ELEMENT_DAYS_ARRIVAL = Target.the("Calendar element days arrival").located(By.xpath("(//table[@class='uitk-date-picker-weeks'])[2]/tbody//td//button"));
    public static final Target BUTTON_DONE_DATE = Target.the("Button done days").located(By.xpath("//button//span[contains(text(),'Done')]"));
    public static final Target BUTTON_ADD_ADULT = Target.the("Button Add Adult").located(By.xpath("//input[@id='adult-input-0']//following::button[1]"));
    public static final Target BUTTON_ADD_CHILDREN = Target.the("Button Add Children").located(By.xpath("//input[@id='child-input-0']//following::button[1]"));
    public static final Target TRAVELERS = Target.the("Travelers").located(By.xpath("//button[@data-testid='travelers-field-trigger']"));
    public static final Target AGE_CHILDREN_1 = Target.the("Age children 1").located(By.id("child-age-input-0-0"));
    public static final Target AGE_CHILDREN_2 = Target.the("Age children 2").located(By.id("child-age-input-0-1"));
    public static final Target BUTTON_DONE_TRAVELERS = Target.the("Button done travelers").located(By.xpath("//button[@data-testid='guests-done-button']"));
    public static final Target BUTTON_SEARCH = Target.the("Button search").located(By.xpath("//button[contains(text(), 'Search')]"));
    public static final Target LOADING = Target.the("Loading").located(By.xpath("//div[@class='page-loading']/span"));
    public static final Target HOTEL_AVALIBLE = Target.the("Hotel avalible").located(By.xpath("//a[@data-stid='open-hotel-information']"));
}
