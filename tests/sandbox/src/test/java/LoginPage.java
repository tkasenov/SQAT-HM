import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    public void openLoginMenu() {
        waitAndFindElementByLocator(MainPageLocators.LOGIN_DROPDOWN.getLocator()).click();
    }

    public void login() {
        this.openLoginMenu();
        waitAndFindElementByLocator(MainPageLocators.LOGIN_BUTTON.getLocator()).click();
        this.fillLoginForm();
        waitAndFindElementByLocator(MainPageLocators.LOGIN_SUBMIT_BUTTON.getLocator()).click();
    }

    public WebElement getCurrentUser() {
        return waitAndFindElementByLocator(MainPageLocators.IS_LOGGEDIN.getLocator());
    }

    private void fillLoginForm() {
        waitAndFindElementByLocator(MainPageLocators.LOGIN_EMAIL_FIELD.getLocator()).sendKeys("elteseleniumuser@gmail.com");
        waitAndFindElementByLocator(MainPageLocators.LOGIN_PASSWORD_FIELD.getLocator()).sendKeys("figbiv-ryqbov-2fEvne");
    }
}
