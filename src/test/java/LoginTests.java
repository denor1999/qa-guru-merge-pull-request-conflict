import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class LoginTests {

    @Test
    void loginTest(){
        open("https://qa-guru.github.io/one-page-form/login.html");
        $("#login-input").setValue("user1");
        $("#password-input").setValue("password1");
        $("#submit-button").click();
        $("#login-form").shouldNotBe(visible);
    }
}
