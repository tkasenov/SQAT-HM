import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    final WebDriver driver;
    final WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }
    public WebElement waitAndFindElementByLocator(By locator) {
        this.wait.until(ExpectedConditions.elementToBeClickable(locator));
        return this.driver.findElement(locator);
    }


}
