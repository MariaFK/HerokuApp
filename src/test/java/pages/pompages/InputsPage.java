package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import java.security.Key;

public class InputsPage extends BasePage{

    private By BOX_INPUT = By.xpath("//input[@type='number']");

    public InputsPage(WebDriver driver) {
        super(driver);
    }
    public void openInputsPage(){
        driver.get(Urls.INPUTS_URL);
    }

    public void arrowUpClick(){
        driver.findElement(BOX_INPUT).sendKeys(Keys.ARROW_UP);
    }

    public void arrowDownClick(){
        driver.findElement(BOX_INPUT).sendKeys(Keys.ARROW_DOWN);
    }

    public String numberInBox(){
        return driver.findElement(BOX_INPUT).getAttribute("value");
    }
}
