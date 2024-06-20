package co.com.bancolombia.certification.utestreto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterPassword {

    public static final Target INPUT_PASSWORD = Target.the("Contraseña")
            .locatedBy("//input[@id='password']");
    public static final Target INPUT_CONFIRM_PASSWORD = Target.the("Confirmar Contraseña")
            .locatedBy("//input[@id='confirmPassword']");
    public static final Target CHECK_BOXONE = Target.the("Confirmar primer checkbox")
            .locatedBy("//span[@class='checkmark signup-consent__checkbox error']");
    public static final Target CHECK_BOXTWO = Target.the("Confirmar segundo checkbox")
            .locatedBy("//span[@ng-class='{error: userForm.privacySetting.$error.required}']");
    public static final Target BUTTON_COMPLETE = Target.the("Boton de completado")
            .locatedBy("//button[@id='laddaBtn']");
}
