package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import static browser.Config.BROWSER_TYPE;

public class Browser {
    public static WebDriver driver;
    /**
     * Инициализируется (необходимо для работы драйвера, иначе ошибка) драйвер, устанавливается разрешение экрана
     * Переменная BROWSER_TYPE отвечает за открытие необходимого браузера
     * @return - возвращает экземпляр класса WebDriver
     */
    public static WebDriver createDriver(){
        switch (BROWSER_TYPE){
            case "chrome":
                driver = new ChromeDriver();
                break;
            case "firefox":
                driver = new FirefoxDriver();
                break;
            case "edge":
                driver = new EdgeDriver();
                break;
            case "safari":
                driver = new SafariDriver();
                break;
            default:
                System.out.println("Некорректное имя браузера: " + BROWSER_TYPE);
        }
        driver.manage().window().maximize();
        return driver;
    }
}
