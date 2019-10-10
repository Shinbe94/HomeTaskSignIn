package stepDefinition;

import org.junit.Assert;

import Page.SignInPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SignInStep {
	
	SignInPage signInPage = new SignInPage();
	
	@Given("user open page \"([^\"]*)\"$")
	public void user_open_page(String url) {
	    signInPage.openBrowser(url);
	}

	@When("User inputs in email field is \"([^\"]*)\"$")
	public void user_inputs_in_email_field_is(String username) {
	    signInPage.inputUserName(username);
	}

	@When("User inputs in password field is \"([^\"]*)\"$")
	public void user_inputs_in_password_field_is(String password) {
	    signInPage.inputPassword(password);
	}

	@When("User clicks sign-in button")
	public void user_clicks_button() {
	    signInPage.clickSignInButton();
	}

	@Then("User can sign-in successfully")
	public void user_can_sign_in_successfully() {
		Assert.assertEquals(signInPage.navigateToHomePage(),"Bắt đầu với Quảng Cáo Cốc Cốc");
	}

	@Then("User cannot sign-in successfully")
	public void user_cannot_sign_in_successfully() {
		Assert.assertTrue("Still in the sign-in page", signInPage.titleIsDisplay());;
	}
	
	@Then("User sees message {string}")
	public void user_sees_message(String errorMessage) {
		Assert.assertEquals(signInPage.getErrorMessage(),errorMessage);
	}


	@When("User doesn't input username and password")
	public void user_doesn_t_input_username_and_password() {
		signInPage.inputUserName("");
		signInPage.inputPassword("");
	}

}
