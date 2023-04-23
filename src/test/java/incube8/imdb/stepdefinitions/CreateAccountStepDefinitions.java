package incube8.imdb.stepdefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

import incube8.imdb.pages.CreateAccPage;
import incube8.imdb.pages.ImdbHomePage;
import incube8.imdb.pages.NavigateTo;
import incube8.imdb.pages.SignInPage;
import io.cucumber.datatable.DataTable;

public class CreateAccountStepDefinitions {
	@Steps
	CreateAccPage createAcc;

	@Steps
	NavigateTo navigateTo;

	@Steps
	ImdbHomePage imdbHome;

	@Steps
	SignInPage signIn;

	@Given("^a new user is on the home page$")
	public void a_new_user_is_on_the_home_page() throws Throwable {
		navigateTo.theImdbHomePage();
	}

	@When("^the user clicks on the SignIn button$")
	public void the_user_clicks_on_the_signin_button() throws Throwable {
		imdbHome.clickSignIn();
	}

	@Then("^the user should be redirected to solve puzzle page$")
    public void the_user_should_be_redirected_to_solve_puzzle_page() throws Throwable {
		createAcc.solvePuzzleVisible();

	}

	@And("^User clicks on create account button$")
	public void user_clicks_on_create_account_button() throws Throwable {
		signIn.clickCreateAccount();
	}

	@And("^User Click on Create account after entering below details:$")
	public void user_click_on_create_account_after_entering_below_details(DataTable dataTable) throws Throwable {
		List<Map<String, String>> rows = dataTable.asMaps(String.class, String.class);
		for (Map<String, String> row : rows) {
			createAcc.enterDetails(row);
		}
	}

}
