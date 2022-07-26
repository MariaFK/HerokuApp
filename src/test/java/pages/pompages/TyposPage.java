package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TyposPage extends BasePage {

    private By TYPO_ROW = By.xpath("//div//p[2]");

    public TyposPage(WebDriver driver) {
        super(driver);
    }

    public void openTyposPage() {
        driver.get(Urls.TYPOS_URL);
    }

    public String actualText() {
        return driver.findElement(TYPO_ROW).getText();
    }

    public String rightText() {
        return "Sometimes you'll see a typo, other times you won't.";
    }
}
