package co.com.xyztesters.globalsqa.pages;


import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.WebElement;

@DefaultUrl("https://www.globalsqa.com/angularJs-protractor/registration-login-example/#/register")
    public class RegisterPage extends PageObject {

        @FindBy(xpath = "//input[@id='firstName']")
        WebElement textBoxFirstName;

        @FindBy(xpath = "//input[@name=\"lastName\"]")
        WebElement textBoxLastName;

        @FindBy(xpath = "//input[@id='username']")
        WebElement textBoxUsername;

        @FindBy(xpath = "//input[@id='password']")
        WebElement textBoxPassword;

        @FindBy(xpath = "//button[contains(text(),'Register')]")
        WebElement btnRegister;

        public void dataRegister(String firstName,String lastName, String userName,String password){
            textBoxFirstName.sendKeys(firstName);
            textBoxLastName.sendKeys( lastName);
            textBoxUsername.sendKeys(userName);
            textBoxPassword.sendKeys(password);
            btnRegister.click();
        }
    }


