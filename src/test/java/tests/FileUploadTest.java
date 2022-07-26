package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.pompages.FileUploadPage;

public class FileUploadTest extends BaseTest {

    @Test
    public void fileUploadTest() {
        FileUploadPage fileUploadPage = new FileUploadPage(driver);
        fileUploadPage.openFileUploadPage();
        fileUploadPage.chooseFile();
        fileUploadPage.uploadFile();
        Assert.assertEquals(fileUploadPage.uploadedFileName(), fileUploadPage.expectedName(), "The name isn't the same");


    }
}
