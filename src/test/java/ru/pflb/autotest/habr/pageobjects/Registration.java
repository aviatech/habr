package ru.pflb.autotest.habr.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Registration extends BasePage {
    @Override
    public void open() {
        chromeDriver.get("https://habr.com/ru/");
    }

    public void clickRegistrationButton() {
        WebElement registrationButton = chromeDriver.findElementByXPath("//a[@class = 'btn btn_medium btn_navbar_registration']");
        registrationButton.click();
    }

    public void setNickName() {
        WebElement nickNameField = chromeDriver.findElementByXPath("//input[@id = 'nickname_field']");
        nickNameField.sendKeys("nickname");
    }

    public void setPasswordRepeat() {
        WebElement passwordRepeat = chromeDriver.findElementByXPath("//input[@id ='password_repeat']");
        passwordRepeat.sendKeys("5dtTMPH6CsSQG4G");
    }

    public void setCaptcha() {
        WebElement captcha = chromeDriver.findElementByXPath("//input[@id = 'captcha']");
        captcha.sendKeys("captcha");
    }

    public void clickButton() {
        WebElement registrationButton = chromeDriver.findElementByXPath("//button[@id = 'registration_button']");
        registrationButton.click();
    }

    public WebElement getWarningElement() {
        WebElement warning = wait.until(
                ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class = 'form__field form__field_captcha s-field s-with-error']/div[1]")));
        return wait.until(ExpectedConditions.visibilityOf(warning));
    }

}
