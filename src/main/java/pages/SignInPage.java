package pages;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class SignInPage {
    private SelenideElement logininput = $(By.id("index_email"));
    private SelenideElement loginpass = $(By.id("index_pass"));

    public void inputlogin(String text){
    this.logininput.val(text);
}
    public void inputpassword(String text) {
    this.loginpass.val(text);
}

    public void clickButton(String text) {
        $(By.id("index_login_button")).click();
    }
    public void clickCheckbox(){
        $(By.id("index_expire")).click();
    }
    public void contentIsVisible(String text){

        $(By.xpath("//div[text()='"+text+"']")).shouldBe(Condition.visible);

    }
}

