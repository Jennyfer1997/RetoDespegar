package co.com.accenture.testing.runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;


@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features = "src/test/resources/co/com/"
		+ "accenture/testing/features/Despegar.feature",glue = "co.com.accenture"
				+ ".testing.stepsdefinitions", snippets = SnippetType.CAMELCASE )

public class DespegarRunner {

}
