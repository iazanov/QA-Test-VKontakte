package Steps;

import Config.UserConfig;
import io.cucumber.java.en.Then;
import pages.SignInPage;

public class SignInPageDef {
    SignInPage signInPage = new SignInPage();
    @Then("Input Login")
    public void inputLogin() {
        signInPage.inputlogin(UserConfig.USER_LOGIN);
    }
    @Then("Input Password")
    public void inputpass() {
        signInPage.inputpassword(UserConfig.USER_PASSWORD);
    }
    @Then("Click Checkbox")
    public void clickCheckbox() {
        signInPage.clickCheckbox();
    }
    @Then("Click {string} button")
    public void clickButton(String arg0) {
    signInPage.clickButton(arg0);
    }
    @Then("Content with {string} visible")
    public void contentIsVisible(String arg0) {
        signInPage.contentIsVisible(arg0);
    }
}
