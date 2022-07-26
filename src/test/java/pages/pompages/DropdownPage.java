package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import tests.BaseTest;

public class DropdownPage extends BasePage {

    private By DROPDOWN_LIST = By.id("dropdown");
    private By FIRST_DROPDOWN_ELEMENT = By.cssSelector("option[value='1']");
    private By SECOND_DROPDOWN_ELEMENT = By.cssSelector("option[value='2']");

    public DropdownPage(WebDriver driver) {
        super(driver);
    }

    public void openDropdownPage() {
        driver.get(Urls.DROPDOWN_URL);
    }

    public WebElement dropdownList() {
        return driver.findElement(DROPDOWN_LIST);
    }

    public boolean isFirstDropdownElementSelected() {
        return driver.findElement(FIRST_DROPDOWN_ELEMENT).isSelected();
    }

    public boolean isSecondDropdownElementSelected() {
        return driver.findElement(SECOND_DROPDOWN_ELEMENT).isSelected();
    }

}
