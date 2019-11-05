package co.com.accenture.testing.userinterfaces;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;

@DefaultUrl("https://www.despegar.com.co/")
public class HomePageDespegar extends PageObject {
	public static final Target FLIGHT = Target.the("vuelos").located(By.linkText("Vuelos"));
	public static final Target ORIGIN = Target.the("Campo ciudad de origen").located(By.xpath("//div[@class='input-container']//input[@placeholder='Ingresa desde dónde viajas']"));
	public static final Target DESTINATION = Target.the("campo cuidad destino").located(By.xpath("//div[@class='input-container']//input[@placeholder='Ingresa hacia dónde viajas']"));
	public static final Target CLICK_ON_ORIGIN = Target.the("selecciona la cuidad").located(By.xpath("//span[@class='item-text']"));
	public static final Target CLICK_ON_DESTINATION = Target.the("Selecciona el destino").located(By.xpath("//li[@class='item -active']"));
	public static final Target CALENDAR = Target.the("calendario").located(By.xpath("//div[@class='input-container sbox-bind-event-click-start-date']//input[@placeholder='Ida']"));
	public static final Target RETURN_DATE = Target.the("fecha de retorno").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[5]/div[1]/div[4]/span[14]/span[1]"));
	public static final Target START_DATE = Target.the("fecha de inicio").located(By.xpath("/html[1]/body[1]/div[4]/div[1]/div[5]/div[1]/div[4]/span[12]/span[1]"));
	public static final Target SEARCH_BUTTON = Target.the("boton buscar").located(By.xpath("//div[@class='sbox-button -ml3-l -mt5-l']//a[@class='sbox-3-btn -primary -md sbox-search']"));
	public static final Target SELECT_BUTTON = Target.the("boton seleccionar").located(By.xpath("//*[@id=\"clusters\"]/span[1]/span/cluster/div/div/div[2]/fare/span/span/div/buy-button/a/div/em"));
	public static final Target PSE = Target.the("PSE").located(By.xpath("//span[contains(text(),'PSE')]"));
	public static final Target NOMBRE= Target.the("nombre").located(By.id("invoice-first-name-0"));
	public static final Target APELLIDO= Target.the("apellido").located(By.id("invoice-last-name-0"));
	public static final Target CEDULA= Target.the("cedula").located(By.id("invoice-fiscal-identification-number-0"));
	public static final Target DIRECCION= Target.the("direccion").located(By.id("aq5urj8pkd7c9qs1dss7i"));
	public static final Target EMAIL= Target.the("email").located(By.id("1gf54wf4pp5faigsg7py1p"));
	public static final Target EMAIL_VALIDATION= Target.the("verificacion de email").located(By.id("gkc9wiysczpvoxlvk9dtr"));
	public static final Target AREA= Target.the("area").located(By.id("7bf4h5t767krp0yp2g5gbl"));
	public static final Target NUMERO= Target.the("numero").located(By.id("3jv9ahiv267gv7hb0fw84p"));
	public static final Target NOMBRE_ADULTO= Target.the("nombre").located(By.id("eb43gyjuybs3imbmpstus"));
	public static final Target APELLIDO_ADULTO= Target.the("apellido").located(By.id("kezadqbfxyh32zdog23n0y"));
	public static final Target CEDULA_ADULTO= Target.the("cedula").located(By.id("traveler-identification-number-0"));
	public static final Target BIRTHDAY_DAY = Target.the("Birthday day").locatedBy("//select[@id='traveler-birthday-day-0']");
	public static final Target BIRTHDAY_MONTH = Target.the("Birthday month").locatedBy("//select[@id='traveler-birthday-month-0']");
	public static final Target BIRTHDAY_YEAR = Target.the("Birthday year").locatedBy("//select[@id='traveler-birthday-year-0']");

}
