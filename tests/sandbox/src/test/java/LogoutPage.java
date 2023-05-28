import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LogoutPage extends BasePage{

    public LogoutPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getGuest() {
        return waitAndFindElementByLocator(MainPageLocators.IS_GUEST.getLocator());
    }

    public void logout() {
        waitAndFindElementByLocator(MainPageLocators.LOGOUT_DROPDOWN.getLocator()).click();
        waitAndFindElementByLocator(MainPageLocators.LOGOUT_SUBMIT_BUTTON.getLocator()).click();
    }
}
