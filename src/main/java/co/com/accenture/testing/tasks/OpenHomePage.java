package co.com.accenture.testing.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.pages.PageObject;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenHomePage implements Task {
	

	PageObject home;
	
	public OpenHomePage(PageObject home) {
		this.home = home;
	}

	@Override
	public <T extends Actor> void performAs(T actor) {
		// TODO Auto-generated method stub
		actor.attemptsTo(Open.browserOn(home));
	}
	
	public static OpenHomePage on(PageObject homePage) {
		// TODO Auto-generated method stub
		return instrumented(OpenHomePage.class, homePage);
	}


}
