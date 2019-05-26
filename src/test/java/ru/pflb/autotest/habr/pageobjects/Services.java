package ru.pflb.autotest.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Services extends BasePage {
    public void clickАdvertising() {
        WebElement advertising = chromeDriver.findElementByXPath("//html/body/div[3]/div[5]/div/div[1]/div[4]/div/ul/li[1]/a");
        advertising.click();

    }

    public WebElement getAdvertising() {
        WebElement advertising = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("/html/body/div[1]/section[1]/div/h1/text()[1]")));
        return wait.until(ExpectedConditions.visibilityOf(advertising));
    }

    public String getAdvertising1() {
        WebElement advertising = chromeDriver.findElementByXPath("/html/body/div[1]/section[1]/div/h1/text()[1]");
        return advertising.getText();

    }


}
