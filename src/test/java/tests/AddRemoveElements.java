package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElements extends BaseTest {
    @Test
    public void addRemoveElementsTest() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS_URL);
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//button[@onclick='addElement()']")).click();
        driver.findElement(By.xpath("//button[@onclick='deleteElement()']")).click();
        int numberOfElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()']")).size();
        Assert.assertEquals(numberOfElements, 1);

    }
}
