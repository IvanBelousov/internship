package mainPageTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.MainPage;

import static browser.Config.START_URL;
import static pages.MainPage.COUNT_CATEGORY_CARDS;

public class OpenMainPage {
    private WebDriver driver;
    private MainPage mainPage;
    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
    }

    @Test
    public void step_1(){
        mainPage.openURL(START_URL);
        Assert.assertEquals(mainPage.getCategoryCount(),COUNT_CATEGORY_CARDS);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
