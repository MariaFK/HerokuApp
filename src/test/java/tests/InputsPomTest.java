package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.InputsPage;

public class InputsPomTest extends BaseTest {

    @Test
    public void arrowUpTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.arrowUpClick();
        Assert.assertEquals(inputsPage.numberInBox(), "1");
    }

    @Test
    public void arrowDownTest() {
        InputsPage inputsPage = new InputsPage(driver);
        inputsPage.openInputsPage();
        inputsPage.arrowDownClick();
        inputsPage.arrowDownClick();
        Assert.assertEquals(inputsPage.numberInBox(), "-2");
    }
}
