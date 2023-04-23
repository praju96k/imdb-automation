package incube8.imdb.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.imdb.com/registration/signin")
public class SignInPage extends PageObject {

	@FindBy(xpath = "//a[contains(@class, 'create-account')]")
	WebElementFacade createAccountButton;

	public void clickCreateAccount() {
		createAccountButton.click();
	}
}
