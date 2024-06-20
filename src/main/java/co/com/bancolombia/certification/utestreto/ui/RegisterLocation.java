package co.com.bancolombia.certification.utestreto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterLocation {
    public static final Target INPUT_CITY = Target.the("Input para ingesar la ciudad")
            .locatedBy("//input[@type='search']");
    public static final Target CLICK_CITY = Target.the("Clik en la ciudad")
            .locatedBy("//ngf-option[@ng-repeat='option in geoOptions']");

    public static final Target INPUT_POSTAL = Target.the("Input para ingesar el codigo postal")
            .locatedBy("//input[@id='zip']");
    public static final Target BUTTON_NEXT_DEVICES = Target.the("Boton seguir formulario localizacion")
            .locatedBy("//button[@class='btn btn-blue']");
}
