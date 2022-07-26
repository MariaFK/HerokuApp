package tests;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.DragAndDropPage;

public class DragAndDropPomTest extends BaseTest {

    @Test
    public void dragAndDropTest() {
        DragAndDropPage dragAndDropPage = new DragAndDropPage(driver);
        Actions actions = new Actions(driver);
        dragAndDropPage.openDragAndDropPage();
        dragAndDropPage.switchToFrame();
        actions.dragAndDrop(dragAndDropPage.draggableFragment(), dragAndDropPage.droppableFragment()).build().perform();
        Assert.assertEquals(dragAndDropPage.actualText(), dragAndDropPage.expectedText());


    }

}
