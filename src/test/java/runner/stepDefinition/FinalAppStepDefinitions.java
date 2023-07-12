package runner.stepDefinition;

import Task.LoginApp;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.CoreMatchers;
import question.ShouldSeeRegisterUser;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FinalAppStepDefinitions {


    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^(.*) ejecuta la app")
    public void starts_app(String user) {
        Actor actor = theActorCalled(user);
        theActorInTheSpotlight().should( actor + " es un usuario registrado en la app " );
    }

    @When("^el inicia sesion en la app$")
    public void login_in() {
        theActorInTheSpotlight().attemptsTo(LoginApp.inTheApp());

    }

    @Then("^el valida el (.*) logueado")
    public void visualiza_user(String text) {
        theActorInTheSpotlight().should(seeThat(ShouldSeeRegisterUser.validateUser(), CoreMatchers.equalTo(text)));
    }
}
