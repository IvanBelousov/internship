package pages.base;
/**
 * Базовый класс, в нём указываются базовые методы, которые применяются на всех страницах
 */

import org.openqa.selenium.WebDriver;

public class BasePage {
    protected WebDriver driver;
    public BasePage(WebDriver driver) {
        this.driver = driver;
    }
    public void openURL(String url){
        driver.get(url);
    }
}
