package co.com.bancolombia.certification.utestreto.tasks;

import co.com.bancolombia.certification.utestreto.ui.*;
import net.serenitybdd.screenplay.*;
import net.serenitybdd.screenplay.actions.*;

public class RegisterUserReto implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BUTTON_COOKIES),
                Click.on(HomePage.BUTTON_REGISTER),
                SendKeys.of("Andres").into(RegisterForm.INPUT_FIRSTNAME),
                SendKeys.of("Uruburu").into(RegisterForm.INPUT_LASTNAME),
                SendKeys.of("Andres12@hotmail.com").into(RegisterForm.INPUT_EMAIL),
                SendKeys.of("Agosto").into(RegisterForm.INPUT_MONTH),
                SendKeys.of("17").into(RegisterForm.INPUT_DAY),
                SendKeys.of("2024").into(RegisterForm.INPUT_YEAR),
                Click.on(RegisterForm.BUTTON_NEXT),
                SendKeys.of("Medellin").into(RegisterLocation.INPUT_CITY),
                Click.on(RegisterLocation.CLICK_CITY),
                SendKeys.of("050001").into(RegisterLocation.INPUT_POSTAL),
                Click.on(RegisterLocation.BUTTON_NEXT_DEVICES),
                Click.on(RegisterDevices.INPUT_MOVILE_DEVICE),
                Click.on(RegisterDevices.APPLE),
                Click.on(RegisterDevices.INPUT_MODEL),
                Click.on(RegisterDevices.IPHONE_4),
                Click.on(RegisterDevices.INPUT_SISTEM_MOVILE),
                Click.on(RegisterDevices.IOS_1103),
                Click.on(RegisterDevices.BUTTON_NEXT),
                SendKeys.of("Carlos.12345").into(RegisterPassword.INPUT_PASSWORD),
                SendKeys.of("Carlos.12345").into(RegisterPassword.INPUT_CONFIRM_PASSWORD),
                Click.on(RegisterPassword.CHECK_BOXONE),
                Click.on(RegisterPassword.CHECK_BOXTWO),
                Click.on(RegisterPassword.BUTTON_COMPLETE)

        );
    }

    //Por medio de este metodo yo puedo llamar la tarea a donde yo quiciera
    public static RegisterUserReto makeinformation(){
        return Tasks.instrumented(RegisterUserReto.class);
    }
}
