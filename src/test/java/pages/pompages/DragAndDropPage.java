package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropPage extends BasePage {

    private By DRAGGABLE_FRAGMENT = By.cssSelector("div[id='draggable']");
    private By DROPPABLE_FRAGMENT = By.cssSelector("div[id='droppable']");

    private By CHANGED_TEXT = By.xpath("//div[@id='droppable']//p");

    public DragAndDropPage(WebDriver driver) {
        super(driver);
    }

    public void openDragAndDropPage() {
        driver.get(Urls.DRAG_AND_DROP_URL);
    }

    public void switchToFrame() {
        driver.switchTo().frame(0);
    }

    public WebElement draggableFragment() {
        return driver.findElement(DRAGGABLE_FRAGMENT);
    }

    public WebElement droppableFragment() {
        return driver.findElement(DROPPABLE_FRAGMENT);
    }

    public String actualText() {
        return driver.findElement(CHANGED_TEXT).getText();
    }

    public String expectedText() {
        return "Dropped!";
    }
}
