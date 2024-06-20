package co.com.bancolombia.certification.utestreto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterForm {

    public static final Target INPUT_FIRSTNAME = Target.the("Input para ingesar el nombre")
            .locatedBy("//input[@id='firstName']");
    public static final Target INPUT_LASTNAME = Target.the("Input para ingesar el apellido")
            .locatedBy("//input[@id='lastName']");
    public static final Target INPUT_EMAIL = Target.the("Input para ingesar el correo electronico")
            .locatedBy("//input[@id='email']");
    public static final Target INPUT_MONTH = Target.the("Input para ingesar el mes")
            .locatedBy("//select[@id='birthMonth']");
    public static final Target INPUT_DAY = Target.the("Input para ingesar el dia")
            .locatedBy("//select[@id='birthDay']");
    public static final Target INPUT_YEAR = Target.the("Input para ingesar el año")
            .locatedBy("//select[@id='birthYear']");
    public static final Target BUTTON_NEXT = Target.the("Boton para seguir con los pasos del registro")
            .locatedBy("//button[@class='btn btn-blue']");

}
