package co.com.bancolombia.certification.utestreto.stepdefinitions;

import co.com.bancolombia.certification.utestreto.tasks.RegisterUserReto;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class RegisterUserStep {



    //Esto funcionar antes del given y lo hara funcionar tambien toda la configuracion del
    // serenity.properties
    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }


    @When("user create an account filling all fields")
    public void userCreateAnAccountFillingAllFields() {
        OnStage.theActorInTheSpotlight().attemptsTo(RegisterUserReto.makeinformation());
    }
    @Then("user sees its username")
    public void userSeesItsUsername() {

    }
}
