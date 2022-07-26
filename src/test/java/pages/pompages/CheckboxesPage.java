package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckboxesPage extends BasePage {

    private By FIRST_CHECKBOX = By.xpath("//form[@id='checkboxes']//input[1]");
    private By SECOND_CHECKBOX = By.xpath("//form[@id='checkboxes']//input[2]");

    public CheckboxesPage(WebDriver driver) {
        super(driver);
    }

    public void openCheckboxesPage() {
        driver.get(Urls.CHECKBOX_URL);
    }

    public boolean isFirstCheckboxSelected() {
        return driver.findElement(FIRST_CHECKBOX).isSelected();
    }

    public void clickFirstCheckbox() {
        driver.findElement(FIRST_CHECKBOX).click();
    }

    public boolean isSecondCheckboxSelected() {
        return driver.findElement(SECOND_CHECKBOX).isSelected();
    }

    public void clickSecondCheckbox() {
        driver.findElement(SECOND_CHECKBOX).click();
    }

}
