package tests;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CheckboxesTest extends BaseTest {
    public void openLink() {
        driver.get(Urls.CHECKBOX_URL);
    }

    @Test
    public void isFistCheckboxUncheckedTest() {
        openLink();
        WebElement firstCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        boolean firstCheckboxIsSelected = firstCheckbox.isSelected();
        Assert.assertFalse(firstCheckboxIsSelected, "First checkbox is selected");
    }

    @Test
    public void IsFirstCheckboxCheckedTest() {
        openLink();
        WebElement firstCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[1]"));
        firstCheckbox.click();
        boolean firstCheckboxIsSelected = firstCheckbox.isSelected();
        Assert.assertTrue(firstCheckboxIsSelected, "First checkbox isn't selected");
    }

    @Test
    public void IsSecondCheckboxCheckedTest() {
        openLink();
        WebElement secondCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        boolean secondCheckboxIsSelected = secondCheckbox.isSelected();
        Assert.assertTrue(secondCheckboxIsSelected, "Second checkbox isn't selected");
    }

    @Test
    public void IsSecondCheckboxUncheckedTest() {
        openLink();
        WebElement secondCheckbox = driver.findElement(By.xpath("//form[@id='checkboxes']//input[2]"));
        secondCheckbox.click();
        boolean secondCheckboxIsSelected = secondCheckbox.isSelected();
        Assert.assertFalse(secondCheckboxIsSelected, "First checkbox is selected");
    }

}
