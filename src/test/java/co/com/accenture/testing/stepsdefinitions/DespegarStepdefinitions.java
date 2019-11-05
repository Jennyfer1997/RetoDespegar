package co.com.accenture.testing.stepsdefinitions;

import java.util.List;

import org.openqa.selenium.WebDriver;

import co.com.accenture.testing.models.DataBook;
import co.com.accenture.testing.tasks.BookFlight;
import co.com.accenture.testing.tasks.OpenHomePage;
import co.com.accenture.testing.tasks.SearchFlight;
import co.com.accenture.testing.userinterfaces.HomePageDespegar;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;

public class DespegarStepdefinitions {
	
	HomePageDespegar homePage;
	
	  @Managed(driver = "chrome")
	    private WebDriver driver;
	    private Actor jennyfer = Actor.named("jennyfer");
	    
	    @Before
	    public void setUp() {
	        jennyfer.can(BrowseTheWeb.with(driver));
	    }
	
	@Given("^that Jennyfer wants go to Despegar\\.com$")
	public void thatJennyferWantsGoToDespegarCom() throws Exception {
		jennyfer.wasAbleTo(OpenHomePage.on(homePage));
		driver.manage().window().maximize();
	
	}


	@When("^enter the date for make the book$")
	public void enterTheDateForMakeTheBook(List<DataBook> nombre)  {
		 jennyfer.attemptsTo(SearchFlight.on());
		   jennyfer.attemptsTo(BookFlight.onPageDespegar(nombre));
	}
	  
	

	@Then("^she should verify the data entered with the data on screen$")
	public void sheShouldVerifyTheDataEnteredWithTheDataOnScreen() throws Exception {
	 
	}


}
