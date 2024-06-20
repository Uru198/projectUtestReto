package co.com.bancolombia.certification.utestreto.ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

public class HomePage extends PageObject {

    public static final Target BUTTON_COOKIES = Target.the("Boton para aceptar cookies")
            .locatedBy("//button[@id='onetrust-accept-btn-handler']");
    public static final Target BUTTON_REGISTER = Target.the("Boton para registrarse")
            .locatedBy("//a[contains(text(),'Join Today')]");
}
