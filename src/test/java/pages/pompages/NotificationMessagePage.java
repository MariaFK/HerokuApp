package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class NotificationMessagePage extends BasePage {

    private By CLICK_HERE_HREF = By.xpath("//a[text()='Click here']");
    private By DISPLAYED_MESSAGE = By.xpath("//div[@id='flash']");

    public NotificationMessagePage(WebDriver driver) {
        super(driver);
    }

    public void openNotificationMessagePage() {
        driver.get(Urls.NOTIFICATION_MASSAGES_URL);
    }

    public void clickWordsClickHere(){
        driver.findElement(CLICK_HERE_HREF).click();
    }

    public String expectedMessage() {
        return "Action successful";
    }

    public String displayedMessage(){
        return driver.findElement(DISPLAYED_MESSAGE).getText().replace("\n×", "");
    }
}
