package question;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static ui.LoginPage.LBL_FOR_PASS;


public class ShouldSeeRegisterUser implements Question<String> {

    public static Question<String> validateUser(){
        return new ShouldSeeRegisterUser();
    }

    @Override
    public String answeredBy(Actor actor) {
        return LBL_FOR_PASS.resolveFor(actor).getText();
    }

}
