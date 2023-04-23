package incube8.imdb.pages;

import java.util.Map;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;

public class CreateAccPage extends PageObject {
	@FindBy(xpath = "//input[@id='ap_customer_name']")
	WebElementFacade username;

	@FindBy(xpath = "//input[@id='ap_email']")
	WebElementFacade email;

	@FindBy(xpath = "//input[@id='ap_password']")
	WebElementFacade password;

	@FindBy(xpath = "//input[@id='ap_password_check']")
	WebElementFacade retypePassword;

	@FindBy(xpath = "//input[@id='continue']")
	WebElementFacade continueButton;

	@FindBy(xpath = "//span[contains(text(), 'Solve this puzzle to protect your account')]")
	WebElementFacade puzzleText;

	public void enterDetails(Map<String, String> row) throws InterruptedException {
		username.type(row.get("Username"));
		email.type(row.get("Email"));
		password.type(row.get("Password"));
		retypePassword.type(row.get("Password"));
		continueButton.click();

	}

	public void solvePuzzleVisible() {
		getDriver().switchTo().frame("cvf-aamation-challenge-iframe");
		element(puzzleText).waitUntilPresent();
	}

}
