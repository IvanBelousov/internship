import browser.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static browser.Config.START_URL;

public class Test1 {
    private WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
    }
    @Test
    public void step_1(){
        driver.get(START_URL);
        int a = driver.findElements(By.xpath("//div[@class='card mt-4 top-card']")).size();
        Assert.assertEquals(a,7);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
