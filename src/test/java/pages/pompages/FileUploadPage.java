package pages.pompages;

import constants.Urls;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class FileUploadPage extends BasePage {

    private By CHOOSE_FILE_BUTTON = By.id("file-upload");
    private By UPLOAD_BUTTON = By.id("file-submit");
    private By UPLOADED_FILE = By.id("uploaded-files");

    public FileUploadPage(WebDriver driver) {
        super(driver);
    }

    public void openFileUploadPage() {
        driver.get(Urls.FILE_UPLOAD_URL);
    }

    public void chooseFile() {
        driver.findElement(CHOOSE_FILE_BUTTON).sendKeys("src/test/resources/heart.jfif");
    }

    public void uploadFile() {
        driver.findElement(UPLOAD_BUTTON).click();
    }

    public String uploadedFileName() {
        return driver.findElement(UPLOADED_FILE).getText();
    }

    public String expectedName() {
        return "heart.jfif";
    }


}
