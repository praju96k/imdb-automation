package incube8.imdb.pages;

import org.openqa.selenium.By;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class MovieDetailsPage extends PageObject {

	@FindBy(xpath = "//span[contains(text(), 'Game of Thrones: The Last Watch')]")
	WebElementFacade title;

	@FindBy(xpath = "//h1[@data-testid='hero__pageTitle']//parent::div//following-sibling::div//div[contains(@data-testid,'hero-rating-bar__aggregate-rating')]//div[contains(.,'IMDb RATING')]")
	WebElementFacade ratings;

	@FindBy(xpath = "//span[contains(text(), 'User reviews')]")
	WebElementFacade reviews;

	public String titleDisplayed() {
		return title.getText();
	}

	public String reviewsDisplayed() {
		return reviews.getText();
	}

	public String ratingsDisplayed() {
		return ratings.getText();
	}
}
