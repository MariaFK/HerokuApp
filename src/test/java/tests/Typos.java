package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class Typos extends BaseTest {

    @Test
    public void spellCheck() {
        driver.get(Urls.TYPOS_URL);
        WebElement typoRow = driver.findElement(By.xpath("//div//p[2]"));
        String actualText = typoRow.getText();
        String rightText = "Sometimes you'll see a typo, other times you won't.";
        Assert.assertEquals(actualText, rightText, "It's typo on the page");
    }
}
