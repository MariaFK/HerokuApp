package tests;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.DropdownPage;

import java.util.List;

public class DropdownPomTest extends BaseTest {

    @Test
    public void firstDropdownElementsTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        Select selectOptions = new Select(dropdownPage.dropdownList());
        selectOptions.selectByIndex(1);
        Assert.assertTrue(dropdownPage.isFirstDropdownElementSelected(), "The first element isn't selected");
    }

    @Test
    public void SecondDropdownElementsTest() {
        DropdownPage dropdownPage = new DropdownPage(driver);
        dropdownPage.openDropdownPage();
        Select selectOptions = new Select(dropdownPage.dropdownList());
        selectOptions.selectByIndex(2);
        Assert.assertTrue(dropdownPage.isSecondDropdownElementSelected(), "The first element isn't selected");
    }

}
