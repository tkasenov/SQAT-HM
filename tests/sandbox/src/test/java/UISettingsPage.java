import locators.MainPageLocators;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class UISettingsPage extends BasePage{

    public UISettingsPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public WebElement getUISettings() {
        return waitAndFindElementByLocator(MainPageLocators.UI_SETTINGS.getLocator());
    }

    public void openUISettings() {
        this.getUISettings().click();
    }

    public void switchToEnglishUISettings() {
        this.openUISettings();
        waitAndFindElementByLocator(MainPageLocators.UI_SETTINGS_DROPDOWN_MENU_SWITCH_TO_EN.getLocator()).click();
    }

}
