package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddRemoveElements extends BaseTestAddRemoveElements {
    @Test
    public void addRemoveElementsTest() {
        int numberOfElements = driver.findElements(By.xpath("//button[@onclick='deleteElement()']")).size();
        Assert.assertEquals(numberOfElements, 1);

    }
}
