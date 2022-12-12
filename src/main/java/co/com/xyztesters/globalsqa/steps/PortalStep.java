package co.com.xyztesters.globalsqa.steps;

import co.com.xyztesters.globalsqa.pages.LoginPage;
import co.com.xyztesters.globalsqa.pages.RegisterPage;
import net.thucydides.core.annotations.Step;

public class PortalStep {

    LoginPage pageLogin;
    RegisterPage pageRegister;

    @Step
    public void LoginPortal(String username, String pass){
        pageLogin.open();
        pageLogin.Login(username, pass);
    }

    @Step
    public void RegisterPortal(String firstName,String lastName, String userName,String password){
        pageRegister.dataRegister(firstName, lastName,userName,password);
    }
}
