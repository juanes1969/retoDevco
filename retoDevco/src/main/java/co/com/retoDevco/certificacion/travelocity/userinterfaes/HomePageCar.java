package co.com.retoDevco.certificacion.travelocity.userinterfaes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageCar {

    public static final Target CARS = Target.the("Cars").located(By.xpath("//a[@class='uitk-tab-anchor']//span[contains(text(), 'Cars')]"));
    public static final Target ORIGIN = Target.the("Origin").located(By.xpath("//button[@data-stid='location-field-locn-menu-trigger']"));
    public static final Target INPUT_ORIGIN = Target.the("Input Origin").located(By.id("location-field-locn"));
    public static final Target ITEM_ORIGIN = Target.the("Item Origin").located(By.xpath("//*[@id='location-field-locn-menu']/div[2]/ul/li[1]/button"));
    public static final Target DESTINY = Target.the("Destiny").located(By.xpath("//button[@data-stid='location-field-loc2-menu-trigger']"));
    public static final Target INPUT_DESTINY = Target.the("Input Destiny").located(By.id("location-field-loc2"));
    public static final Target ITEM_DESTINY = Target.the("Item Destiny").located(By.xpath("//*[@id='location-field-loc2-menu']/div[2]/ul/li[1]/button"));
    public static final Target SELECT_TIME_INITIAL = Target.the("Select time initial").located(By.xpath("(//select[@class='uitk-field-select'])[1]"));
    public static final Target SELECT_TIME_END = Target.the("Select time end").located(By.xpath("(//select[@class='uitk-field-select'])[2]"));
    public static final Target LOADING_CARS = Target.the("Loading cars").located(By.xpath("//div[@data-testid='loading-view']"));
    public static final Target CARS_ITEMS = Target.the("Cars items").located(By.className("offer-card-desktop"));
}
