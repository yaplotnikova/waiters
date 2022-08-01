package steps;

import io.qameta.allure.Step;
import org.testng.annotations.BeforeMethod;
import pages.InternetLoginPageEnterLogin;
import pages.InternetLoginPageEnterPassword;
import pages.ValidAndInvalidLogin;

public class HealsCheckSteps extends BaseTest{
   @BeforeMethod
   @Override
   public void parentSetUp() {
      super.parentSetUp();
   }
   @Step("enter valid login and password")
   public void enterValidLoginAndPassword(){
      InternetLoginPageEnterLogin internetLoginPageEnterLogin = new InternetLoginPageEnterLogin();
      internetLoginPageEnterLogin.enterLoginField("tomsmith");
      InternetLoginPageEnterPassword internetLoginPageEnterPassword = new InternetLoginPageEnterPassword();
      internetLoginPageEnterPassword.enterPasswordField("SuperSecretPassword!");
      internetLoginPageEnterPassword.clickLoginButton();
      ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
      validAndInvalidLogin.checkURL();
      validAndInvalidLogin.successfulLogin();
   }
   @Step("enter valid login and invalid password")
   public void enterValidLoginAndInvalidPassword(){
      InternetLoginPageEnterLogin internetLoginPageEnterLogin = new InternetLoginPageEnterLogin();
      internetLoginPageEnterLogin.enterLoginField("tomsmith");
      InternetLoginPageEnterPassword internetLoginPageEnterPassword = new InternetLoginPageEnterPassword();
      internetLoginPageEnterPassword.enterPasswordField("qweqweqwe");
      internetLoginPageEnterPassword.clickLoginButton();
      ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
      validAndInvalidLogin.invalidLogin();
   }
  @Step("enter invalid login and valid password")
   public void enterInvalidLoginAndValidPassword(){
     InternetLoginPageEnterLogin internetLoginPageEnterLogin = new InternetLoginPageEnterLogin();
     internetLoginPageEnterLogin.enterLoginField("qweqweqwe");
     InternetLoginPageEnterPassword internetLoginPageEnterPassword = new InternetLoginPageEnterPassword();
     internetLoginPageEnterPassword.enterPasswordField("SuperSecretPassword!");
     internetLoginPageEnterPassword.clickLoginButton();
     ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
     validAndInvalidLogin.invalidLogin();
  }
  @Step("enter invalid login and invalid password")
   public void enterInvalidLoginAndInvalidPassword(){
     InternetLoginPageEnterLogin internetLoginPageEnterLogin = new InternetLoginPageEnterLogin();
     internetLoginPageEnterLogin.enterLoginField("qweqweqwe");
     InternetLoginPageEnterPassword internetLoginPageEnterPassword = new InternetLoginPageEnterPassword();
     internetLoginPageEnterPassword.enterPasswordField("qweqweqwe");
     internetLoginPageEnterPassword.clickLoginButton();
     ValidAndInvalidLogin validAndInvalidLogin = new ValidAndInvalidLogin();
     validAndInvalidLogin.invalidLogin();
  }
}


