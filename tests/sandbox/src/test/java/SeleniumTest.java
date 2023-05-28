import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.time.temporal.ChronoUnit;
import java.util.Random;

public class SeleniumTest {

    private WebDriver driver;
    private WebDriverWait wait;
    @Before
    public void setup() throws MalformedURLException {
        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.setPageLoadStrategy(PageLoadStrategy.NORMAL);
        firefoxOptions.setCapability("browserName","firefox");
        this.driver = new RemoteWebDriver(new URL("http://selenium:4444/wd/hub"), firefoxOptions);
        this.driver.manage().window().maximize();
        this.wait = new WebDriverWait(driver, Duration.of(10, ChronoUnit.SECONDS));

    }

    @Test
    public void test() {
        // Initializing and starting MainPage test
        MainPage mainPage = new MainPage(this.driver, this.wait);
        // Static MainPage test
        Assert.assertTrue(mainPage.getTitle().contains("No Fluff Jobs"));
        Assert.assertEquals("Top European IT Job Board. Salary in Every Ad.", mainPage.getMainText());

        Assert.assertTrue(mainPage.isNavBarPresent());
        Assert.assertTrue(mainPage.isSearchBarPresent());
        Assert.assertTrue(mainPage.isMainContentPresent());
        Assert.assertTrue(mainPage.isFooterPresent());
        // End of static MainPage test

        // Initializing and starting UISettingPage test
        UISettingsPage uiSettingsPage = new UISettingsPage(this.driver, this.wait);
        Assert.assertEquals("HU, HUN, HUF", uiSettingsPage.getUISettings().getText());
        uiSettingsPage.switchToEnglishUISettings();
        Assert.assertEquals("HU, ENG, HUF", uiSettingsPage.getUISettings().getText());

        // Initializing and starting LoginPage and LogoutPage  test
        LogoutPage logoutPage = new LogoutPage(this.driver, this.wait);
        LoginPage loginPage = new LoginPage(this.driver, this.wait);
        // Check if user is not logged in
        Assert.assertTrue(logoutPage.getGuest().getText().contains("LOG IN"));

        // Log in and check if login is successful
        loginPage.login();
        Assert.assertTrue(loginPage.getCurrentUser().getText().contains("ELTESELENIUMUSER"));

        // Generate random string
        String randomSearchQuery = new Random().ints(97, 122 + 1)
                .limit(7)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();

        // Testing MainPage search box
        mainPage.search("Selenium");
        Assert.assertEquals("SELENIUM JOBS", mainPage.getSearchResult());
        mainPage.search(randomSearchQuery);

        // Testing Browser navigation
        driver.navigate().back();
        Assert.assertEquals("SELENIUM JOBS", mainPage.getSearchResult());
//        Assert.assertEquals("OFFERS OF THE DAY", mainPage.getSearchDefaultResult());

        // Log out and check if logout is successful
        logoutPage.logout();
        Assert.assertTrue(logoutPage.getGuest().getText().contains("LOG IN"));
    }

    @After
    public void close() {
        if (this.driver != null) {
            this.driver.quit();
        }
    }


}