package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NotificationMessagesTest extends BaseTest {
    @Test
    public void successfulMessageIsDisplayedTest() {
        driver.get(Urls.NOTIFICATION_MASSAGES_URL);
        driver.findElement(By.xpath("//a[text()='Click here']")).click();
        String expectedMessage = "Action successful";
        String displayedMessage = driver.findElement(By.xpath("//div[@id='flash']")).getText().replace("\n×", "");
        Assert.assertEquals(displayedMessage, expectedMessage, "Actual message differs from expected message");

    }
}
