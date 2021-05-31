package co.com.retoDevco.certificacion.travelocity.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/features/change_laguage.feature",
        glue = "co.com.retoDevco.certificacion.travelocity.stepdefinitions",
        snippets = SnippetType.CAMELCASE)
public class ChangeLanguage {
}
