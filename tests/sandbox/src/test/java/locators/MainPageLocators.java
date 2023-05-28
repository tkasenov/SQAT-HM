package locators;

import org.openqa.selenium.By;

public enum MainPageLocators {
    COOKIES_ACCEPT_BODY(By.xpath("//*[@id=\"onetrust-accept-btn-handler\"]")),
    MAIN_TEXT(By.xpath("/html/body/nfj-root/nfj-layout/div[2]/div/div/h1")),
    NAVBAR(By.xpath("/html/body/nfj-root/nfj-layout/div[1]")),
    SEARCHBAR(By.xpath("/html/body/nfj-root/nfj-layout/div[2]")),
    MAIN(By.xpath("/html/body/nfj-root/nfj-layout/nfj-main-content")),
    FOOTER(By.xpath("/html/body/nfj-root/nfj-layout/div[4]")),
    SEARCH_BOX(By.xpath("//*[@id=\"mat-chip-list-input-0\"]")),
    SEARCH_BUTTON(By.xpath("/html/body/nfj-root/nfj-layout/div[2]/div/div/nfj-search-box/form/mat-form-field/div/div[1]/div[1]/mat-chip-list/div/div[1]/button")),
    SEARCH_RESULT(By.xpath("/html/body/nfj-root/nfj-layout/nfj-main-content/div/nfj-postings-search/div/common-main-loader/nfj-search-results/nfj-postings-list/div[1]/h2/span/a")),
    SEARCH_DEFAULT_RESULT(By.xpath("/html/body/nfj-root/nfj-layout/nfj-main-content/div/nfj-postings-search/div/common-main-loader/div/nfj-postings-categorized/nfj-postings-list[1]/div[1]/div/h2")),
    LOGIN_DROPDOWN(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper/nfj-navbar-profile-dropdown/div/span")),
    LOGOUT_DROPDOWN(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span")),
    LOGIN_BUTTON(By.xpath("//*[@id=\"navbar-login\"]")),
    LOGIN_EMAIL_FIELD(By.xpath("//*[@id=\"log-in-email\"]")),
    LOGIN_PASSWORD_FIELD(By.xpath("//*[@id=\"log-in-password\"]")),
    LOGIN_SUBMIT_BUTTON(By.xpath("//*[@id=\"log-in-submit\"]")),
    LOGOUT_SUBMIT_BUTTON(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/div/nfj-navbar-candidate/footer/a")),
    IS_GUEST(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[3]/common-lazy-render/nfj-navbar-login-wrapper")),
    IS_LOGGEDIN(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[3]/common-lazy-render/nfj-navbar-candidate-wrapper/nfj-navbar-profile-dropdown/div/span/span")),
    UI_SETTINGS(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[5]/common-lazy-render/nfj-navbar-ui-settings/div/nfj-navbar-ui-settings-inline")),
    UI_SETTINGS_DROPDOWN_MENU(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[5]/common-lazy-render/nfj-navbar-ui-settings/div/div")),
    UI_SETTINGS_DROPDOWN_MENU_SWITCH_TO_EN(By.xpath("/html/body/nfj-root/nfj-layout/div[1]/nfj-navbar/nav/nfj-navbar-menu/ul[2]/li[5]/common-lazy-render/nfj-navbar-ui-settings/div/div/nfj-navbar-ui-settings-form/form/div[1]/nfj-navbar-language-selector/nfj-dropdown/div/button")),
    ;
    private final By locator;
    MainPageLocators(By locator) {
        this.locator = locator;
    }

    public By getLocator(){
        return this.locator;
    }
}
