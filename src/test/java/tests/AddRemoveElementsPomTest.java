package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.AddRemoveElementsPage;

public class AddRemoveElementsPomTest extends BaseTest {
    @Test
    public void addRemoveElementsTest() {
        AddRemoveElementsPage addRemoveElementsPage = new AddRemoveElementsPage(driver);
        addRemoveElementsPage.openAddRemoveElementsPage();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.addElement();
        addRemoveElementsPage.deliteElement();
        Assert.assertEquals(addRemoveElementsPage.numberOfElements(), 1);

    }
}
