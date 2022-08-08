package a1_LoginTest;

import io.cucumber.java.en.And;
import io.cucumber.java.en.But;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class A1_StepDefination {@Given("launch the Brower")
public void launch_the_Browser() {
	System.out.println("Open the browser");
}
@When("get the url")
public void get_the_url() {
	System.out.println("intiate the url");
}

@Then("get the valid username")
public void get_the_valid_username() {
	System.out.println("enter valid username");
}

@And("get the valid password")
public void get_the_valid_password() {
	System.out.println("enter valid password");
}

@And("click the Login button")
public void click_the_login_button() {
	System.out.println("click the login");
}

@But("Didn't navigate the same page")
public void didn_t_navigate_the_same_page() {
	System.out.println("navigate");
}



}
