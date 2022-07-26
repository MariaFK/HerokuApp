package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.security.SecureRandom;

public class AlertPage extends BasePage {

    private By JS_ALERT_BUTTON = By.xpath("//button[@onclick='jsAlert()']");
    private By JS_CONFIRM_BUTTON = By.xpath("//button[@onclick='jsConfirm()']");
    private By JS_PROMPT_BUTTON = By.xpath("//button[@onclick='jsPrompt()']");

    private By JS_PROMPT_BUTTON_TEXT = By.xpath("//p[@id='result']");

    public AlertPage(WebDriver driver) {
        super(driver);
    }

    public void openAlertsPage() {
        driver.get(Urls.ALERTS_URL);
    }

    public void clickJSAlertButton() {
        driver.findElement(JS_ALERT_BUTTON).click();
    }

    public void clickJSConfirmButton() {
        driver.findElement(JS_CONFIRM_BUTTON).click();
    }

    public void clickJSPromptButton() {
        driver.findElement(JS_PROMPT_BUTTON).click();
    }

    public String getAlertText() {
        return driver.switchTo().alert().getText();
    }

    public void acceptAlert() {
        driver.switchTo().alert().accept();
    }

    public void dismissAlert() {
        driver.switchTo().alert().dismiss();
    }

    public void sendKeysToAlert() {
        driver.switchTo().alert().sendKeys("Hello");
    }

    public String expectedJSAlertButtonText() {
        return "I am a JS Alert";
    }

    public String expectedJSConfirmButtonText() {
        return "I am a JS Confirm";
    }

    public String expectedJSPromptButtonText() {
        return "You entered: Hello";
    }

    public String actualJSPromptButtonText() {
        return driver.findElement(JS_PROMPT_BUTTON_TEXT).getText();
    }

}
