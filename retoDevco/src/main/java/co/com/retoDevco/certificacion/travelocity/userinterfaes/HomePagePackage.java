package co.com.retoDevco.certificacion.travelocity.userinterfaes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePagePackage {

    public static final Target PACKAGE = Target.the("Package").located(By.xpath("//a[@class='uitk-tab-anchor']//span[contains(text(), 'Packages')]"));
    public static final Target ADD_CAR = Target.the("Add car").located(By.xpath("//label[@class='uitk-pill-content']/span[contains(text(), 'Add a car')]"));
    public static final Target ORIGIN_PACKAGE = Target.the("Origin").located(By.xpath("(//button[@class='uitk-faux-input'])[1]"));
    public static final Target INPUT_ORIGIN_PACKAGE = Target.the("Input Origin").located(By.id("location-field-origin"));
    public static final Target RESULT_ORIGIN_PACKAGE = Target.the("Result Origin").located(By.xpath("//*[@id='location-field-origin-menu']/div[2]/ul/li[1]/button"));
    public static final Target DESTINY_PACKAGE = Target.the("Destiny").located(By.xpath("(//button[@class='uitk-faux-input'])[2]"));
    public static final Target INPUT_DESTINY_PACKAGE = Target.the("Input Destiny").located(By.id("location-field-destination"));
    public static final Target RESULT_DESTINY_PACKAGE = Target.the("Result Destiny").located(By.xpath("//*[@id='location-field-destination-menu']/div[2]/ul/li[1]/button"));
    public static final Target LOADING_PACKAGE = Target.the("Loading").located(By.className("page-loading"));
    public static final Target RESULT_SEARCH_PACKAGE = Target.the("Result search package").located(By.xpath("//a[@data-stid='open-hotel-information']"));
}
