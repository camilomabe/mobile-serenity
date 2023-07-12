package ui;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final Target TXT_USER = Target.the("User").located(By.id("editTextEmail"));
    public static final Target TXT_PASSWORD = Target.the("Pass").located(By.id("editTextPassword"));
    public static final Target BTN_LOGIN = Target.the("Login").located(By.id("buttonLogIn"));
    public static final Target LBL_FOR_PASS = Target.the("For pass").located(By.id("buttonLogInGoogle"));


}
