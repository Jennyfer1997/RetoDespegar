package co.com.accenture.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

import org.openqa.selenium.Keys;

import static co.com.accenture.testing.userinterfaces.HomePageDespegar.*;

public class SearchFlight implements Task {
	

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(
				Click.on(FLIGHT),
				Enter.theValue("MDE").into(ORIGIN),
				Click.on(CLICK_ON_ORIGIN),
				Enter.theValue("BOG").into(DESTINATION).thenHit(Keys.ENTER),
				Click.on(CLICK_ON_DESTINATION),
				Click.on(CALENDAR),
				Click.on(START_DATE),
				Click.on(RETURN_DATE),
				Click.on(SEARCH_BUTTON),
				Click.on(SELECT_BUTTON)
				
				
				);
		
	}

	public static SearchFlight on() {
		// TODO Auto-generated method stub
		return instrumented(SearchFlight.class);
	}

}
