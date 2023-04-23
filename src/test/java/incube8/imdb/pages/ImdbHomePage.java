package incube8.imdb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.annotations.Step;

@DefaultUrl("https://imdb.com")
public class ImdbHomePage extends PageObject {

	@FindBy(id = "imdbHeader-navDrawerOpen")
	WebElementFacade menuHeader;

	@FindBy(xpath = "//span[contains(text(), 'Top 250 TV Shows')]")
	WebElementFacade topShowsLink;

	@FindBy(xpath = "//div[contains(@class, 'nav__userMenu')]/a/span[contains(text(), 'Sign In')]")
	WebElementFacade signInButton;

	@FindBy(id = "suggestion-search")
	WebElementFacade searchField;

	@FindBy(xpath = "//div[contains(text(), 'Game of Thrones: The Last Watch')]")
	WebElementFacade suggestedTextLink;

	public void clickMenu() {
		menuHeader.click();
	}

	public void clickTopShows() {
		topShowsLink.click();
	}

	public void clickSignIn() {
		signInButton.click();
	}

	@Step("Search for term {0}")
	public void term(String term) {
		searchField.clear();
		searchField.sendKeys(term);
	}

	@Step("Click on suggested text link")
	public void clickSuggestedTextLink() {
		suggestedTextLink.click();
	}
}
