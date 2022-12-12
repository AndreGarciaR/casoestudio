package co.com.xyztesters.globalsqa.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/registration-login-example/#/login")
public class LoginPage extends PageObject {

    @FindBy( name="username")
    WebElement textBoxUsername;

    @FindBy(name="password")
    WebElement textBoxPassword;

    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement btnLogin;

    public void Login(String userName,String password){
        textBoxUsername.sendKeys(userName);
        textBoxPassword.sendKeys(password);
        btnLogin.click();

    }
}
