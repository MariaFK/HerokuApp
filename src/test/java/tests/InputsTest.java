package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InputsTest extends BaseTest {
    public void openLink() {
        driver.get(Urls.INPUTS_URL);
    }

    @Test
    public void arrowUpTest() {
        openLink();
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='number']"));
        inputBox.sendKeys(Keys.ARROW_UP);
        String number = inputBox.getAttribute("value");
        Assert.assertEquals(number, "1");
    }

    @Test
    public void arrowDownTest() {
        openLink();
        WebElement inputBox = driver.findElement(By.xpath("//input[@type='number']"));
        inputBox.sendKeys(Keys.ARROW_DOWN);
        inputBox.sendKeys(Keys.ARROW_DOWN);
        String number = inputBox.getAttribute("value");
        Assert.assertEquals(number, "-2");
    }

}
