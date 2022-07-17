package tests;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DataTables extends BaseTestDataTable {
    @Test
    public void firstNameAndLastNameTest() {
        String firstName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[1]")).getText();

        String lastName = driver.findElement(By.xpath("//table[@id='table1']//td[text()='fbach@yahoo.com']//preceding-sibling::td[2]")).getText();

        Assert.assertEquals(firstName, "Frank");
        Assert.assertEquals(lastName, "Bach");
    }

    @Test
    public void dueAndWebsiteTest() {
        String due = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[@class='dues']")).getText();

        String webSite = driver.findElement(By.xpath("//table[@id='table2']//td[text()='fbach@yahoo.com']//following-sibling::td[@class='web-site']")).getText();

        Assert.assertEquals(due, "$51.00");
        Assert.assertEquals(webSite, "http://www.frank.com");

    }

}
