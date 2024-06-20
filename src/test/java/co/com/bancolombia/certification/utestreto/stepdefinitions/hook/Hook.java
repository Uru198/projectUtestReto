package co.com.bancolombia.certification.utestreto.stepdefinitions.hook;

import co.com.bancolombia.certification.utestreto.hook.OpenWeb;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.page.TheWebPage;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static co.com.bancolombia.certification.utestreto.utils.Constans.*;
import static co.com.bancolombia.certification.utestreto.utils.Time.waiting;

public class Hook {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("{string} user in the home page")
    public void userInTheHomePage(String actor) {
        OnStage.theActorCalled(actor).attemptsTo(
                OpenWeb.browserURL(WEB_URL)
        );
        waiting(TIME_SHORT);
        theActorInTheSpotlight().should(
                GivenWhenThen.seeThat(
                        //Aqui se aplica la sobrecarga tiene varias formas de implementar este metodo
                        TheWebPage.title(),
                        Matchers.containsString(TITLE)
                )
        );
    }
}
