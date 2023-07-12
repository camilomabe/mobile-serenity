package Task;

import helpers.Time;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static ui.LoginPage.*;

public class LoginApp implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        Time.getTimeOut(2000);
        actor.attemptsTo(Enter.theValue("correo@gmail.com").into(TXT_USER));
        actor.attemptsTo(Enter.theValue("password").into(TXT_PASSWORD));
        actor.attemptsTo(Click.on(BTN_LOGIN));
        Time.getTimeOut(2000);
    }

    public static Performable inTheApp() {
        return Tasks.instrumented(LoginApp.class);
    }
}
