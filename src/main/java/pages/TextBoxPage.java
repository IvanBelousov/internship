package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;

import java.util.ArrayList;
import java.util.List;

public class TextBoxPage extends BasePage {
    public TextBoxPage(WebDriver driver) {
        super(driver);
    }
    public By header = By.xpath("//div[@class='main-header' and text()='Text Box']");
    //public By inputLocator = By.xpath("//*[@placeholder=''%s]");
    public By fullNameLocator = By.id("userName");
    public By emailLocator = By.id("userEmail");
    public By currentAddressLocator = By.id("currentAddress");
    public By permanentAddressLocator = By.id("permanentAddress");
    public By buttonLocator = By.id("submit");
    public By outputId = By.xpath("//p[@id]");
    public static final String OUTPUT_XPATH = "//div[@id='output']//p[@id='%s']";

    public boolean isPageOpen(){
        return driver.findElement(header).isDisplayed();
    }
    public void setFullName(String fullName){
        driver.findElement(fullNameLocator).sendKeys(fullName);
    }
    public void setEmail(String email) {

        driver.findElement(emailLocator).sendKeys(email);
    }

    public void setCurrentAddress(String address) {
        driver.findElement(currentAddressLocator).sendKeys(address);
    }

    public void setPermanentAddress(String address) {

        driver.findElement(permanentAddressLocator).sendKeys(address);
    }
    public void clickSubmit() {

        driver.findElement(buttonLocator).click();
    }
    public void setAllFieldAndSubmit(String fullName, String email, String curAddr, String permAddr){
        setFullName(fullName);
        setEmail(email);
        setCurrentAddress(curAddr);
        setPermanentAddress(permAddr);
        clickSubmit();
    }
    public List<WebElement> getOutput(){
        return driver.findElements(outputId);
    }

    public String getOutputName() {
        String locator = String.format(OUTPUT_XPATH, "name");
        return driver.findElement(By.xpath(locator)).getText();
    }

    public String getOutputEmail() {
        String locator = String.format(OUTPUT_XPATH, "email");
        return driver.findElement(By.xpath(locator)).getText();
    }

    public String getOutputCurAddr() {
        String locator = String.format(OUTPUT_XPATH, "currentAddress");
        return driver.findElement(By.xpath(locator)).getText();
    }

    public String getOutputPermAddr() {
        String locator = String.format(OUTPUT_XPATH, "permanentAddress");
        return driver.findElement(By.xpath(locator)).getText();
    }
}
