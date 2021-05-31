package co.com.retoDevco.certificacion.travelocity.userinterfaes;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomeCruises {

    public static final Target CRUISES = Target.the("Cruises").located(By.xpath("//a[@class='uitk-tab-anchor']//span[contains(text(), 'Cruises')]"));
    public static final Target SELECT_DESTINATION = Target.the("Select destination").located(By.id("cruise-destination"));
    public static final Target LOADING_CRUISES = Target.the("Loading cruises").located(By.className("cruise-loading-view"));
    public static final Target RESULTS_CRUISES = Target.the("Results cruises").located(By.className("flex-card"));

    public static Target optionDocument(String optionType) {
        Target TypeOption;
        TypeOption = Target.the("Option Type").located(By.xpath("//select[@id='cruise-destination']//option[contains(text(), \"" + optionType + "\")]"));
        return TypeOption;
    }
}
