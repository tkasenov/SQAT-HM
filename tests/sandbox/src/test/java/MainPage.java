import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {
    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        this.driver.get("https://nofluffjobs.com/hu");
        this.acceptCookiesSettings();
        //        driver.manage().addCookie(new Cookie("__hssrc",	"1")); Enable cookies without UI
    }
    private void acceptCookiesSettings() {
        waitAndFindElementByLocator(MainPageLocators.COOKIES_ACCEPT_BODY.getLocator()).click();
    }

    public String getTitle() {
        return this.driver.getTitle();
    }

    public String getMainText() {
        return waitAndFindElementByLocator(MainPageLocators.MAIN_TEXT.getLocator()).getText();
    }

    private WebElement getSearchBox() {
        return waitAndFindElementByLocator(MainPageLocators.SEARCH_BOX.getLocator());
    }
    public void search(String query) {
        this.getSearchBox().sendKeys(query);
        waitAndFindElementByLocator(MainPageLocators.SEARCH_BUTTON.getLocator()).click();
    }
    public String getSearchResult() {
        return waitAndFindElementByLocator(MainPageLocators.SEARCH_RESULT.getLocator()).getText();
    }
    public String getSearchDefaultResult() {
        return waitAndFindElementByLocator(MainPageLocators.SEARCH_DEFAULT_RESULT.getLocator()).getText();
    }

    public boolean isNavBarPresent() {
        return waitAndFindElementByLocator(MainPageLocators.NAVBAR.getLocator()).isDisplayed();
    }

    public boolean isSearchBarPresent() {
        return waitAndFindElementByLocator(MainPageLocators.SEARCHBAR.getLocator()).isDisplayed();

    }

    public boolean isMainContentPresent() {
        return waitAndFindElementByLocator(MainPageLocators.MAIN.getLocator()).isDisplayed();

    }

    public boolean isFooterPresent() {
        return waitAndFindElementByLocator(MainPageLocators.FOOTER.getLocator()).isDisplayed();

    }
}
