package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.CheckboxesPage;

public class CheckboxesPomTest extends BaseTest {

    @Test
    public void isFistCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertFalse(checkboxesPage.isFirstCheckboxSelected(), "First checkbox is selected");
    }

    @Test
    public void IsFirstCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickFirstCheckbox();
        Assert.assertTrue(checkboxesPage.isFirstCheckboxSelected(), "First checkbox isn't selected");
    }

    @Test
    public void IsSecondCheckboxCheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        Assert.assertTrue(checkboxesPage.isSecondCheckboxSelected(), "Second checkbox isn't selected");
    }

    @Test
    public void IsSecondCheckboxUncheckedTest() {
        CheckboxesPage checkboxesPage = new CheckboxesPage(driver);
        checkboxesPage.openCheckboxesPage();
        checkboxesPage.clickSecondCheckbox();
        Assert.assertFalse(checkboxesPage.isSecondCheckboxSelected(), "First checkbox is selected");
    }
}
