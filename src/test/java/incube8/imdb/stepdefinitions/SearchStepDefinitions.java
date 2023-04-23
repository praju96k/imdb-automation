package incube8.imdb.stepdefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import incube8.imdb.pages.ImdbHomePage;
import incube8.imdb.pages.MovieDetailsPage;
import incube8.imdb.pages.NavigateTo;

public class SearchStepDefinitions {

	@Steps
	NavigateTo navigateTo;

	@Steps
	ImdbHomePage imdbHome;

	@Steps
	MovieDetailsPage moviedetails;

	@Given("^User is on the Create New Account page$")
	public void user_is_on_the_create_new_account_page() throws Throwable {

	}

	@When("^User Clicks on Create your new IMDb account after entering below details$")
	public void user_clicks_on_create_your_new_imdb_account_after_entering_below_details(DataTable data)
			throws Throwable {
		List<List<String>> obj = data.asLists();
	}

	@Then("^User should be able to create new account successfully$")
	public void user_should_be_able_to_create_new_account_successfully() throws Throwable {

	}

	@Given("^a new user is on the IMDb home page$")
	public void a_new_user_is_on_the_imdb_home_page() throws Throwable {
		navigateTo.theImdbHomePage();
	}

	@When("^the user clicks on the 'Menu' button displayed next to the IMDb logo$")
	public void the_user_clicks_on_the_menu_button_displayed_next_to_the_imdb_logo() throws Throwable {
		imdbHome.clickMenu();
	}

	@And("^selects the 'Top 250 TV Shows link' under the 'TV Shows' category$")
	public void selects_the_top_250_tv_shows_link_under_the_tv_shows_category() throws Throwable {
		imdbHome.clickTopShows();
	}

	@Then("^the user should be redirected to the Top Rated TV Shows page$")
	public void the_user_should_be_redirected_to_the_top_rated_tv_shows_page() throws Throwable {

	}

	@Given("^a user is on the IMDb home page$")
	public void a_user_is_on_the_imdb_home_page() throws Throwable {
		navigateTo.theImdbHomePage();
	}

	@When("^the user searches for movie \"([^\"]*)\"$")
	public void the_user_searches_for_movie_something(String term) throws Throwable {
		imdbHome.term(term);
	}

	@Then("^the user should be redirected to the selected movie page \"([^\"]*)\"$")
	public void the_user_should_be_redirected_to_the_selected_movie_page_something(String term) throws Throwable {
		assertThat(moviedetails.titleDisplayed()).contains(term);
		System.out.println("the title of movie is" + moviedetails.titleDisplayed());
	}

	@And("^selects from the suggestion window movie Game of Thrones: The Last Watch$")
	public void selects_from_the_suggestion_window_movie_game_of_thrones_the_last_watch() throws Throwable {
		imdbHome.clickSuggestedTextLink();
	}

	@Given("^a user is on the selected movie details page $")
	public void a_user_is_on_the_selected_movie_details_page() throws Throwable {
		// navigate
	}

	@Then("^the title of the selected episode should be shown as \"([^\"]*)\"$")
	public void the_title_of_the_selected_episode_should_be_shown_as_something(String term) throws Throwable {
		assertThat(moviedetails.titleDisplayed()).contains(term);
		System.out.println("the title of movie is" + moviedetails.titleDisplayed());
	}

	@And("^the rating  should be shown as \"([^\"]*)\"$")
	public void the_rating_should_be_shown_as_something(String term) throws Throwable {
		assertThat(moviedetails.ratingsDisplayed()).contains(term);
		System.out.println("the title of rating is" + moviedetails.ratingsDisplayed());
	}

	@And("^the number of reviews Title should be visible as \"([^\"]*)\"$")
	public void the_number_of_reviews_title_should_be_visible_as_something(String term) throws Throwable {
		assertThat(moviedetails.reviewsDisplayed()).contains(term);
		System.out.println("the title of reviews is" + moviedetails.reviewsDisplayed());
	}

}
