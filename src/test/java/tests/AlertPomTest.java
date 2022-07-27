package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.AlertPage;

public class AlertPomTest extends BaseTest {

    @Test
    public void JSAlertButtonTest() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.openAlertsPage();
        alertPage.clickJSAlertButton();
        String actualText = alertPage.getAlertText();
        alertPage.acceptAlert();
        Assert.assertEquals(actualText, alertPage.expectedJSAlertButtonText(), "The text isn't the same");
    }

    @Test
    public void JSConfirmButtonTest() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.openAlertsPage();
        alertPage.clickJSConfirmButton();
        String actualText = alertPage.getAlertText();
        alertPage.dismissAlert();
        Assert.assertEquals(actualText, alertPage.expectedJSConfirmButtonText(), "The text isn't the same");
    }

    @Test
    public void JSPromptButtonTest() {
        AlertPage alertPage = new AlertPage(driver);
        alertPage.openAlertsPage();
        alertPage.clickJSPromptButton();
        alertPage.sendKeysToAlert();
        alertPage.acceptAlert();
        Assert.assertEquals(alertPage.actualJSPromptButtonText(), alertPage.expectedJSPromptButtonText(), "The text isn't the same");
    }
}
