package stepDefinietion;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Given;
import myhook.Hook;
import pom.LoginPage;

public class NopStepDef {
	
	WebDriver driver;
    LoginPage login;
    
    public NopStepDef() {
    
        this.driver =Hook.driver;
        this.login = new LoginPage(driver);
    }

    @Given("the user is on the login page {string}")
    public void the_user_is_on_the_login_page(String url) {
    	driver.get(url);
       
    }

    @Given("the user enters a valid username {string}")
    public void the_user_enters_a_valid_username(String email) {
    	login.enterEmail(email);
       
    }

    @Given("the user enters a valid password {string}")
    public void the_user_enters_a_valid_password(String pass) {
        login.enterPassword(pass);
    }

    @Given("the user clicks the login button")
    public void the_user_clicks_the_login_button() {
    	login.clickloginnButton();
        
    }




}


