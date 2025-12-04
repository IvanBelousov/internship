package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

/**
 * Класс для стартовой страницы
 */
public class MainPage extends BasePage {
    /**
     * Конструктор класса, позволяет передевать экземпляр драйвера на наследуюемые страницы
     * @param driver
     */
    public MainPage(WebDriver driver) {
        super(driver);
    }
    public By categoryCards = By.xpath("//div[@class='card mt-4 top-card']//h5[contains(text(),'')]");
    public By categoryCardElements = By.xpath("//div[@class='card mt-4 top-card']//h5[contains(text(),'Elements')]");
    public static final int COUNT_CATEGORY_CARDS = 6;

    public int getCategoryCount(){
        return  driver.findElements(categoryCards).size();
    }

    public ElementsPage openElements(){
        driver.findElement(categoryCardElements).click();
        return new ElementsPage(driver);
    }
}
