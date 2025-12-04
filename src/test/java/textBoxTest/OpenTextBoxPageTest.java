package textBoxTest;

import browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import pages.ElementsPage;
import pages.MainPage;
import pages.TextBoxPage;

import static browser.Config.START_URL;

public class OpenTextBoxPageTest {
    private WebDriver driver;
    private MainPage mainPage;
    private ElementsPage elementsPage;
    private TextBoxPage textBoxPage;
    private String fullName = "Testov Test";
    private String email = "test@test.com";
    private String currentAddress = "Test 1";
    private String permanentAddress = "Test 2";
    @BeforeTest
    public void beforeTest(){
        driver = Browser.createDriver();
        mainPage = new MainPage(driver);
        mainPage.openURL(START_URL);
        elementsPage = mainPage.openElements();
    }

    @Test
    public void step_1(){
     textBoxPage = elementsPage.openTextBoxPage();
     Assert.assertTrue(textBoxPage.isPageOpen());
    }
    @Test
    public void step_2(){
        /*textBoxPage.setFullName("Testov Test");
        textBoxPage.setEmail("test@test.com");
        textBoxPage.setCurrentAddress("Test 1");
        textBoxPage.setPermanentAddress("Test 2");
        textBoxPage.clickSubmit();*/
        textBoxPage.setAllFieldAndSubmit(fullName,email,currentAddress, permanentAddress);
        textBoxPage.getOutputName();
        textBoxPage.getOutputEmail();
        textBoxPage.getOutputCurAddr();
        textBoxPage.getOutputPermAddr();
        Assert.assertEquals(textBoxPage.getOutputName(),"Name:"+fullName);
        Assert.assertEquals(textBoxPage.getOutputEmail(), "Email:"+email);
        Assert.assertEquals(textBoxPage.getOutputCurAddr(), "Current Address :"+currentAddress);
        Assert.assertEquals(textBoxPage.getOutputPermAddr(),"Permananet Address :"+permanentAddress);
    }
    @AfterTest
    public void afterTest(){
        driver.quit();
    }
}
