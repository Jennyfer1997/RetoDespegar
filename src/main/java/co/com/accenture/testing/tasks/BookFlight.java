package co.com.accenture.testing.tasks;

import java.util.List;

import org.openqa.selenium.Keys;

import co.com.accenture.testing.models.DataBook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import static co.com.accenture.testing.userinterfaces.HomePageDespegar.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BookFlight implements Task {
	private List<DataBook> databook;
	
	public BookFlight(List<DataBook> databook) {
		this.databook = databook;
	
	}

	@Override
	public <T extends Actor> void performAs(T jennyfer) {
		jennyfer.attemptsTo(Click.on(PSE));
		jennyfer.attemptsTo(Enter.theValue(databook.get(0).getNombre()).into(NOMBRE).thenHit(Keys.ENTER),
				Enter.theValue(databook.get(0).getApellido()).into(APELLIDO).thenHit(Keys.ENTER),
				Enter.theValue(databook.get(0).getCedula()).into(CEDULA).thenHit(Keys.ENTER),
				Enter.theValue(databook.get(0).getDireccion()).into(DIRECCION).thenHit(Keys.ENTER)
				//Enter.theValue(databook.get(0).getEmail()).into(EMAIL).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getEmail()).into(EMAIL_VALIDATION).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getArea()).into(AREA).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getNumero()).into(NUMERO).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getNombre()).into(NOMBRE_ADULTO).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getApellido()).into(APELLIDO_ADULTO).thenHit(Keys.ENTER),
				//Enter.theValue(databook.get(0).getCedula()).into(CEDULA_ADULTO).thenHit(Keys.ENTER)
				
				);
		//jennyfer.attemptsTo(
				//Click.on(BIRTHDAY_DAY),
				//Click.on(BIRTHDAY_MONTH),
				//Click.on(BIRTHDAY_YEAR)
			//	);
		
		
		
	}

	public static BookFlight onPageDespegar(List<DataBook> databook) {
		// TODO Auto-generated method stub
		return instrumented(BookFlight.class,databook);
	}

}
