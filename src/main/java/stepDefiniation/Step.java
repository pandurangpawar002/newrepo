package stepDefiniation;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Step {

	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.out.println("This Step open the Firefox and launch the application.");
	}

	@When("^Enter the user name and password$")
	public void Enter_the_user_name_and_password() throws Throwable

	{
		System.out.println("Enter the user name and password");
	}

	@Then("^reset the credientials$")

	public void reset_the_credientials() throws Throwable {
		System.out.println("reset the credientials");

	}

}
