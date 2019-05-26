package ru.pflb.autotest.habr.pageobjects;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.pflb.autotest.habr.WDriver;

public class BasePage {
    WDriver chromeDriver = WDriver.getInstance();
    WebDriverWait wait = WDriver.wait;
    Logger logger = LogManager.getLogger();

    public void open() {
    }

    public BasePage() {
    }

    public void close() {
        chromeDriver.close();
    }

    public void maximaze() {
        chromeDriver.maximazeWindow();
    }


}
