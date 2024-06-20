package co.com.bancolombia.certification.utestreto.ui;

import net.serenitybdd.screenplay.targets.Target;

public class RegisterDevices {

    public static final Target INPUT_MOVILE_DEVICE = Target.the("Input para tipo de celular")
            .locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[4]");
    public static final Target APPLE = Target.the("Lista para tipo de celular")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[3]");
    public static final Target INPUT_MODEL = Target.the("Input para modelo de celular")
            .locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[5]");
    public static final Target IPHONE_4 = Target.the("Lista para modelo de celular")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[5]");
    public static final Target INPUT_SISTEM_MOVILE = Target.the("Input para sistema opertivo celular")
            .locatedBy("(//span[@class='btn btn-default form-control ui-select-toggle'])[6]");
    public static final Target IOS_1103 = Target.the("Lista para sistema opertivo celular")
            .locatedBy("(//span[@class='ui-select-choices-row-inner'])[2]");
    public static final Target BUTTON_NEXT = Target.the("Boton de siguiente")
            .locatedBy("//button[@class='btn btn-blue pull-right']");


}
