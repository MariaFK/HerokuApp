package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddRemoveElementsPage extends BasePage {

    private By ADD_ELEMENT_BUTTON = By.xpath("//button[@onclick='addElement()']");
    private By DELITE_ELEMENT_BUTTON = By.xpath("//button[@onclick='deleteElement()']");

    public AddRemoveElementsPage(WebDriver driver) {
        super(driver);
    }

    public void openAddRemoveElementsPage() {
        driver.get(Urls.ADD_REMOVE_ELEMENTS_URL);
    }

    public void addElement() {
        driver.findElement(ADD_ELEMENT_BUTTON).click();
    }

    public void deliteElement() {
        driver.findElement(DELITE_ELEMENT_BUTTON).click();
    }

    public int numberOfElements() {
        return driver.findElements(DELITE_ELEMENT_BUTTON).size();
    }
}
