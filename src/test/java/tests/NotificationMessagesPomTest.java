package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.NotificationMessagePage;

public class NotificationMessagesPomTest extends BaseTest {
    @Test
    public void isSuccessfulMessageDisplayedTest() {
        NotificationMessagePage notificationMessagePage = new NotificationMessagePage(driver);
        notificationMessagePage.openNotificationMessagePage();
        notificationMessagePage.clickWordsClickHere();
        Assert.assertEquals(notificationMessagePage.displayedMessage(), notificationMessagePage.expectedMessage(),
                "Actual message differs from expected message");
    }
}
