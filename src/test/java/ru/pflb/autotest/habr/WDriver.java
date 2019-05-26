package ru.pflb.autotest.habr;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WDriver {
    private static Logger logger = LogManager.getLogger();
    private static WDriver instance;
    static ChromeDriver chromeDriver = null;
    public static WebDriverWait wait = null;

    public static WDriver getInstance() {
        if (instance == null) {
            instance = new WDriver();
        }
        return instance;
    }

    private WDriver() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Александр/habr/bin/chromedriver.exe");
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("disable-infobars");
        chromeDriver = new ChromeDriver(chromeOptions);
        wait = new WebDriverWait(chromeDriver, 20, 200);
    }

    public WebElement findElementByXPath(String xpath) {
        logger.info(String.format("Ищу элемент с локатором '%s'", xpath));
        return chromeDriver.findElementByXPath(xpath);
    }

    public WebElement findElementKeys(String idOfElement) {
        logger.info("Press Enter");
        return chromeDriver.findElement(By.id(""));
    }

    public void maximazeWindow() {
        chromeDriver.manage().window().maximize();
    }

    public void get(String url) {
        logger.info(String.format("Открываю страницу по адресу: '%s'", url));
        chromeDriver.get(url);
    }

    public void scrollToElement(WebElement webElementRegButton) {
        ((JavascriptExecutor) chromeDriver).executeScript("arguments[0].scrollIntoView();", webElementRegButton);

    }

    public void close() {
        logger.info("Закрываю окно браузера");
        chromeDriver.close();
    }
}
