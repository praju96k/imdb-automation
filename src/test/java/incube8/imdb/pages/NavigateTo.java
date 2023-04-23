package incube8.imdb.pages;

import net.thucydides.core.annotations.Step;

public class NavigateTo {

	ImdbHomePage imdbHomePage;
	CreateAccPage createacc;
	MovieDetailsPage moviedetails;

	@Step("Open the IMDB home page")
	public void theImdbHomePage() {
		imdbHomePage.open();
	}

	@Step("Open the Create Acc page")
	public void theCreateacc() {
		createacc.open();
	}

	@Step("Open the Movie details page")
	public void moviedetails() {
		moviedetails.open();
	}
}
