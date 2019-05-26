package ru.pflb.autotest.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class AccountPage extends BasePage {

    public void setEmail() {
        WebElement webElementFieldEmail = chromeDriver.findElementByXPath("//input[@type = 'email']");
        webElementFieldEmail.clear();
        webElementFieldEmail.sendKeys("qwq@qq.com");
    }

    public void setPassword() {
        WebElement webElementFieldPassword = chromeDriver.findElementByXPath("//input[@type = 'password']");
        webElementFieldPassword.sendKeys("5dtTMPH6CsSQG4G");
    }

    public void clickComeIn() {
        WebElement buttonComeIn = chromeDriver.findElementByXPath("//button[@type = 'submit']");
        buttonComeIn.click();
    }

    public WebElement getWarningElement() {
        WebElement warning = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//fieldset[@class = 'form__fields']/div[1]/div[1]")));
        return wait.until(ExpectedConditions.visibilityOf(warning));
    }


}
