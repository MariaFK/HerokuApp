package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.TyposPage;


public class TyposPomTest extends BaseTest {

    @Test
    public void spellCheckTest() {
        TyposPage typosPage = new TyposPage(driver);
        typosPage.openTyposPage();
        Assert.assertEquals(typosPage.actualText(), typosPage.rightText(), "It's typo on the page");
    }
}
